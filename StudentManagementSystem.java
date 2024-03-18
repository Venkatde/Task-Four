package com.studentmanagement;

// Custom exception for age not within range
    class AgeNotWithinRangeException extends Exception {
        public AgeNotWithinRangeException(String message) {
            super(message);
        }
    }

    // Custom exception for invalid name
    class NameNotValidException extends Exception {
        public NameNotValidException(String message) {
            super(message);
        }
    }

    // Student class
    class Student {
        private int rollNo;
        private String name;
        private int age;
        private String course;

        // Parameterized constructor
        public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
            if (age < 15 || age > 21) {
                throw new AgeNotWithinRangeException("Age is not within range (15-21)");
            }
            if (!isValidName(name)) {
                throw new NameNotValidException("Name contains numbers or special symbols");
            }
            this.rollNo = rollNo;
            this.name = name;
            this.age = age;
            this.course = course;
        }

        // Method to check if name is valid
        private boolean isValidName(String name) {
            // Using regex to check if the name contains only alphabets and spaces
            return name.matches("[a-zA-Z\\s]+");
        }

        // Getter methods
        public int getRollNo() {
            return rollNo;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getCourse() {
            return course;
        }

        // Setter methods
        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) throws AgeNotWithinRangeException {
            if (age < 15 || age > 21) {
                throw new AgeNotWithinRangeException("Age is not within range (15-21)");
            }
            this.age = age;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        @Override
        public String toString() {
            return "Roll No: " + rollNo + ", Name: " + name + ", Age: " + age + ", Course: " + course;
        }
    }

    // Main class
  public class StudentManagementSystem {
        public static void main(String[] args) {
            try {
                // Creating a valid student
                Student student1 = new Student(1, "John Doe", 18, "Computer Science");
                System.out.println("Student 1: " + student1);

                // Creating a student with invalid age
                Student student2 = new Student(2, "Alice", 22, "Mathematics");

                // Creating a student with invalid name
                Student student3 = new Student(3, "Robert123", 20, "Physics");
            } catch (AgeNotWithinRangeException e) {
                System.out.println("Error creating student: " + e.getMessage());
            } catch (NameNotValidException e) {
                System.out.println("Error creating student: " + e.getMessage());
            }
        }
    }



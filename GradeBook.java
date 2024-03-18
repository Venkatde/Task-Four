package com.student.grade;
 import java.util.HashMap;
import java.util.Map;

    public class GradeBook {
        private Map<String, Integer> gradeMap;

        public GradeBook() {
            gradeMap = new HashMap<>();
        }

        public void addStudent(String name, int grade) {
            gradeMap.put(name, grade);
            System.out.println("Student " + name + " added with grade: " + grade);
        }

        public void removeStudent(String name) {
            if (gradeMap.containsKey(name)) {
                gradeMap.remove(name);
                System.out.println("Student " + name + " removed from the grade book.");
            } else {
                System.out.println("Student " + name + " not found in the grade book.");
            }
        }

        public void displayGrade(String name) {
            if (gradeMap.containsKey(name)) {
                int grade = gradeMap.get(name);
                System.out.println("Grade of student " + name + " is: " + grade);
            } else {
                System.out.println("Student " + name + " not found in the grade book.");
            }
        }

        public static void main(String[] args) {
            GradeBook gradeBook = new GradeBook();

            // Adding students
            gradeBook.addStudent("susi", 85);
            gradeBook.addStudent("Gowtham", 90);

            // Displaying grade
            gradeBook.displayGrade("susi");

            // Removing a student
            gradeBook.removeStudent("Gowtham");

            // Displaying grade of a removed student
            gradeBook.displayGrade("Gowtham");
        }
    }



package com.voteridcheck;

// Custom checked exception for invalid voter age
class InvalidVoterAgeExceptions extends Exception {
    public InvalidVoterAgeExceptions(String message) {
        super(message);
    }
}

// Voter class
class Voter1 {
    private int voterId;
    private String name;
    private int age;

    // Parameterized constructor
    public Voter1(int voterId, String name, int age) throws InvalidVoterAgeExceptions {
        if (age < 18) {
            throw new InvalidVoterAgeExceptions("Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public int getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setVoterId(int voterId) {
        this.voterId = voterId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) throws InvalidVoterAgeExceptions {
        if (age < 18) {
            throw new InvalidVoterAgeExceptions("Invalid age for voter");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Voter ID: " + voterId + ", Name: " + name + ", Age: " + age;
    }
}

// Main class
public class VoterManagementSystem {
    public static void main(String[] args) {
        try {
            // Creating a valid voter
            Voter1 voter1 = new Voter1(101, "venkat", 25);
            System.out.println("Voter 1: " + voter1);

            // Creating a voter with invalid age
            Voter1 voter2 = new Voter1(102, "mukilan", 17);
        } catch (InvalidVoterAgeExceptions e) {
            System.out.println("Error creating voter: " + e.getMessage());
        }
    }
}

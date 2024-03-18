package com.weekdays;

import java.util.Scanner;

public class Main {



        public static void main(String[] args) {
            String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Enter the day position (0-6): ");
                int dayIndex = scanner.nextInt();

                if (dayIndex < 0 || dayIndex > 6) {
                    System.out.println("Index out of range. Please enter a number between 0 and 6.");
                } else {
                    System.out.println("The day is: " + weekdays[dayIndex]);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds. Please enter a valid index.");
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
            } finally {
                scanner.close();
            }
        }
    }





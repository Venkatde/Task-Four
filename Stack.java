package com.Stock.code;

public class Stack {
        private int maxSize;
        private int[] stackArray;
        private int top;

        // Constructor to initialize the stack
        public Stack(int size) {
            this.maxSize = size;
            this.stackArray = new int[maxSize];
            this.top = -1; // Stack is initially empty
        }

        // Method to push an element onto the stack
        public void push(int value) {
            if (top == maxSize - 1) {
                System.out.println("Stack is full. Cannot push element.");
            } else {
                stackArray[++top] = value;
                System.out.println("Pushed " + value + " onto the stack.");
            }
        }

        // Method to pop an element from the stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot pop element.");
                return -1; // Return a default value indicating failure
            } else {
                int poppedValue = stackArray[top--];
                System.out.println("Popped " + poppedValue + " from the stack.");
                return poppedValue;
            }
        }

        // Method to check if the stack is empty
        public boolean isEmpty() {
            return (top == -1);
        }

        public static void main(String[] args) {
            Stack stack = new Stack(5);

            // Pushing elements onto the stack
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);

            // Popping elements from the stack
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop(); // Trying to pop from an empty stack
        }
    }



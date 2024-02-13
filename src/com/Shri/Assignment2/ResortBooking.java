package com.Shri.Assignment2;

import java.util.Scanner;

class Booking {
    private String customerName;
    private int numberOfAdults;
    private int numberOfChildren;
    private int numberOfDays;

    public Booking(String input) {
        String[] tokens = input.split(":");
        this.customerName = tokens[0];
        this.numberOfAdults = Integer.parseInt(tokens[1]);
        this.numberOfChildren = Integer.parseInt(tokens[2]);
        this.numberOfDays = Integer.parseInt(tokens[3]);
    }

    public void calculateTotalCost() {
        if (numberOfAdults < 0) {
            System.out.println("Invalid input for number of adults");
        } else if (numberOfChildren < 0) {
            System.out.println("Invalid input for number of children");
        } else if (numberOfDays <= 0) {
            System.out.println("Invalid input for number of days");
        } else {
            int totalCost = numberOfAdults * 1000 + numberOfChildren * 650;
            totalCost *= numberOfDays;
            System.out.println(customerName + " your booking is confirmed and the total cost is " + totalCost);
        }
    }
}

public class ResortBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the customer details, customer name:number of adults:number of child:number of days");
        String input = scanner.nextLine();

        Booking booking = new Booking(input);
        booking.calculateTotalCost();

        scanner.close();
    }
}
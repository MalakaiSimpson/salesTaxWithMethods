package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*Setup any variables you need and call your methods
       * here in the main method */
        double purchasePrice = inputPurchasePrice();
        double stateTax = calculateTax(purchasePrice, 0.04);
        double countyTax = calculateTax(purchasePrice, 0.02);
        double totalTax = calculateTotal(stateTax, countyTax);
        double totalPrice = calculateTotal(totalTax, purchasePrice);
        displayTotals(purchasePrice, stateTax, countyTax, totalTax, totalPrice);
    }

    /* Write a method called inputPurchasePrice that
    *  takes the user input for price, converts to
    *  a double, and returns the price
    * */
    public static double inputPurchasePrice() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter price: ");
        return Double.parseDouble(input.nextLine());
    }

    /* Write a method called calculateTax that
     * accepts price and tax rate as parameters and
     * calculates and returns the tax
     * */
    public static double calculateTax(double price, double taxRate) {
        return price * taxRate;
    }

    /* Write a method called calculateTotal that
     * accepts two double values nd calculates and
     * returns the total
     * */
    public static double calculateTotal(double num1, double num2) {
        return num1 + num2;
    }

    /* Write a method called displayTotals that takes
    *  purchasePrice, stateTax, countyTax, totalTax and totalPrice
    *  as parameters. Output using decimal formatter amd printf */
    public static void displayTotals
    (double purchasePrice, double stateTax, double countyTax, double totalTax, double totalPrice) {
        System.out.println("Purchase Price: " + purchasePrice);
        System.out.println("Stat Tax: " + stateTax);
        System.out.println("County Tax: " + countyTax);
        System.out.println("Total Tax: " + totalTax);
        System.out.println("Total Price: " + totalPrice);
    }
}
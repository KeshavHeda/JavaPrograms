package BankBranchApp;

import java.util.Scanner;

public class BankInstance {

    private static Scanner scanner = new Scanner(System.in);
    public static Bank bank = new Bank("National Bank of America");

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice :");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    displayBranchCustomer(false);
                    break;
                case 2:
                    displayBranchCustomer(true);
                    break;
                case 3:
                    addNewBranch();
                    break;
                case 4:
                    addCustomerBranch();
                    break;
                case 5:
                    addCustomerTransaction();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list customers in branch.");
        System.out.println("\t 2 - To print the list customers transactions in branch.");
        System.out.println("\t 3 - To add new branch.");
        System.out.println("\t 4 - To add customer to a branch.");
        System.out.println("\t 5 - To add customer transactions.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addNewBranch() {
        System.out.print("Please enter the branch name: ");
        boolean result = bank.addBranch(scanner.nextLine());
        if (result) {
            System.out.println("Bank Branch added successfully.");
        } else {
            System.out.println("Error occurred while adding Bank Branch.");
        }
    }

    public static void addCustomerBranch() {
        System.out.print("Please enter the branch name: ");
        String branchName = scanner.nextLine();
        System.out.print("Please enter the customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Please enter the initial amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        boolean result = bank.addCustomer(branchName, customerName, amount);
        if (result) {
            System.out.println("Customer " + customerName + " added to the branch " + branchName + " with amount " + amount + " successfully.");
        } else {
            System.out.println("Error occurred while adding Customer to the Branch.");
        }
    }

    public static void addCustomerTransaction() {
        System.out.print("Please enter the branch name: ");
        String branchName = scanner.nextLine();
        System.out.print("Please enter the customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Please enter the amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        boolean result = bank.addCustomerTransaction(branchName, customerName, amount);
        if (result) {
            System.out.println("Customer " + customerName + " in branch " + branchName + " deposited " + amount + " successfully.");
        } else {
            System.out.println("Error occurred while depositing Customer amount.");
        }
    }

    public static void displayBranchCustomer(boolean showTransactions) {
        System.out.print("Please enter the branch name: ");
        String branchName = scanner.nextLine();

        boolean result = bank.listCustomers(branchName, showTransactions);
        if (result) {
            System.out.println("List Printed successfully.");
        } else {
            System.out.println("Error occurred while printing list.");
        }
    }

}

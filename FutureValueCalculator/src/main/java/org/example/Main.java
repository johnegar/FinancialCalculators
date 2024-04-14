package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your total deposit amount: ");
        double principle = scanner.nextDouble();

        System.out.println("What is the interest rate?: ");
        double interestRate = scanner.nextDouble();

        System.out.println("What is the length?: ");
        int years = scanner.nextInt();
        double futureValue = calc(principle, interestRate, years);

        System.out.printf("Your Future Value is: $%.2f and your Total Interest Earned is: $%.2f ", futureValue , (futureValue - principle));


        }

    public static double calc(double principle, double interestRate, int years){
        return Math.pow(1+ (interestRate /365 /100), (365 * years)) * principle;

    }
}




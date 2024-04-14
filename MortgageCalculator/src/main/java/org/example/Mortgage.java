package org.example;

import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.print("What is the Principal ammount? :");
        int principal = stdin.nextInt();

        System.out.print("What is the Annual interest Rate?:");
        float annualInterest = stdin.nextFloat();
        float monthlyInterest = annualInterest / 12 / 100;

        System.out.print("How long is the Period (years)? :");
        byte years = stdin.nextByte();
        int numberOfPayments = years * 12;



        stdin.close();

        double mathPower = Math.pow(1 + monthlyInterest, numberOfPayments);

        double monthlyPayment = principal * (monthlyInterest * mathPower / (mathPower - 1));

        System.out.printf("your monthly payment is: " + monthlyPayment);

        double totalInterest;
        totalInterest = (numberOfPayments * monthlyPayment) - principal;
        System.out.printf("Your total Interest is:"  + totalInterest);

        }


    }


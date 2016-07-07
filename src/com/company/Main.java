package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        PrimeNumber primeNumber=new PrimeNumber();

        System.out.println("Enter the number to display its prime factors:");
        int number= Integer.parseInt(scanner.next());

        primeNumber.printFactors(number);

    }
}

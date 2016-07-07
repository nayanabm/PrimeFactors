package com.company;

/**
 * Created by Nayana on 7/6/2016.
 */
public class PrimeNumber {
    public void printFactors(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                if (isPrime(i))
                    System.out.println(i);
        }
    }

    private boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if(number%i==0)
                return false;
        }
        return true;
    }
}

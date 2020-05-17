package com.antaladrien;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Even numbers between two numbers");
        System.out.println("Enter start:");
        int num1 = myObj.nextInt();
        System.out.println("Enter end:");
        int num2 = myObj.nextInt();
        int number = num1;
        int finishNumber = num2;
        int evenNumbersFound = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            //System.out.println("Even number " + number);
            evenNumbersFound++;
            /*if (evenNumbersFound >= 5) {
                break;
            }*/
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}

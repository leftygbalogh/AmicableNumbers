/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amicablenumbers_;

import java.util.Scanner;

/**
 *
 * @author lefty
 */
public class AmicableNumbers_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int firstNumber, secondNumber;

        System.out.print("What is your first number? ");
        firstNumber = keyboard.nextInt();

        System.out.print("What is your second number? ");
        secondNumber = keyboard.nextInt();

        int smallerNumber, biggerNumber;
        if (firstNumber < secondNumber) {
            smallerNumber = firstNumber;
            biggerNumber = secondNumber;
        } else {
            smallerNumber = secondNumber;
            biggerNumber = firstNumber;

        }
//        System.out.println(smallerNumber);

        int half = (int) smallerNumber / 2;
        int sumOfDivisors = 1; //I do not divide by 1

        for (int i = half; i > 1; i--) {
            if (smallerNumber % i == 0) {
                sumOfDivisors += i;
//                System.out.println(i);
            }
        }

//        System.out.println(sumOfDivisors);

        if (sumOfDivisors == biggerNumber) {

            sumOfDivisors = 1;
            half = (int) biggerNumber / 2;

            for (int i = half; i > 1; i--) {
                if (biggerNumber % i == 0) {
                    sumOfDivisors += i;
//                    System.out.println(i);
                }
            }

//            System.out.println(sumOfDivisors);

        }

        if (sumOfDivisors == smallerNumber) {
            System.out.println(smallerNumber + " and " + biggerNumber + " are an amicable pair.");
        } else {
            System.out.println(smallerNumber + " and " + biggerNumber + " are not a friendly lot.");
        }

    }

}

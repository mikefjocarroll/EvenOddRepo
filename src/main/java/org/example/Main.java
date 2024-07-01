//Author : Mike O'Carroll
//Start Date : 7/1/24
//Write an application that asks a user to enter an integer.
//Pass the integer to a method tha determines whether the number is even and returns a Boolean value.
//Display a statement that indicates whether the integer is even or odd.

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a whole number");
        int numberFromUser = Integer.parseInt(scanner.nextLine());
        boolean isEven = determineIsEven(numberFromUser);
       if(isEven){
           System.out.println("The number entered is even");
       }else{
           System.out.println("The number entered is odd");
       }
    }

    public static boolean determineIsEven(int number){
        return number % 2 == 0;
    }

}
package com.csc;

import java.util.Scanner;

public class Menu {
    public static int promptInt(String promptMessage, String errorMessage, Integer lowerBound, Integer upperBound){
        Scanner scanner = new Scanner(System.in);
        int userInput;

        while(true){
            System.out.println(promptMessage);
            userInput = scanner.nextInt();

            if((lowerBound == null || userInput >= lowerBound) && (upperBound == null || userInput <= upperBound)){
                return userInput;
            }
            else{
                System.out.println(errorMessage);
            }
        }
    }

    public static void main(String[] args){
        int result = promptInt("Please enter a number between 20 and 140:","You number is invalid, Please re-enter another number", 20, 140);
        System.out.println("The number you inputted is " + result + ".");
    }
}
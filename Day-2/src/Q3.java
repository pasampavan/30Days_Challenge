/**
 * Program to Check Whether the Number is a Multiple of 7:
 * Write a program that verifies if a number entered by the user is a multiple of 7. For example:
 * Input: Enter a number: 14
 * Output: 14 is a multiple of 7.
 * */

import java.util.Scanner;

public class Q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        String check_number = (number%7==0)?number+" is a multiple of 7" : number+" is not a multiple of 7";
        System.out.println(check_number);
    }
}

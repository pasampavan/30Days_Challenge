/**
 * Program to Check Whether the Number is Odd or Even:
 * Write a program that checks whether a number entered by the user is odd or even. For example:
 * Input: Enter a number: 7
 * Output: 7 is an odd number
 **/
import java.util.Scanner;
public class Q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        String check_number = (number%2==0)?number+" is an Even number":number+" is an Odd Number";
        System.out.println(check_number);

    }
}

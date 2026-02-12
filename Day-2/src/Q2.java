/**
 * Program to Check Whether the Number is Divisible by 5:
 * Write a program that determines if a number entered by the user is divisible by 5. For example:
 * Input: Enter a number: 25
 * Output: 25 is divisible by 5.
 **/
import java.util.Scanner;
public class Q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        String check_number = (number%5==0)?number+" is divisible by 5" : number+" is not divisible by 5";
        System.out.println(check_number);
    }
}

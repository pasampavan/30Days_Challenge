/**
 * Program to Find the Larger Number Among Two Numbers:
 * Write a program to compare two integers entered by the user and print the larger one. For example:
 * Input: Enter two numbers: 15, 20
 * Output: The larger number is: 20
 *
 * */
import java.util.*;
public class Q3 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter Number 1 :"+a);
        int b = sc.nextInt();
        System.out.println("Enter Number 2 :"+b);
        int c = (a>b)?a:b;
        System.out.println("Largest Number is :"+c);

    }

}

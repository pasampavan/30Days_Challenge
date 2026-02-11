/**
**  Program to Print Integer Numbers Entered by the User:
**  Write a program where the user is asked to enter an integer number, and the program prints that number back to them. For example:
**  Input: 42
**  Output: You entered: 42
 */

/*Learn About Scanner : https://www.w3schools.com/java/java_user_input.asp*/

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        //For Integer -> nextInt()
        int number = scanner.nextInt();
        System.out.println("You Entered :"+number);
        scanner.nextLine();

        //For String -> nextLine();
        String name = scanner.nextLine();
        System.out.println("Your Name is:"+name);
        scanner.close();

    }

}

package day9;

import java.util.Scanner;

public class UserInput {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Welcome " + name + "!!!");
        scan.close(); //why do we have to close.

    }
}

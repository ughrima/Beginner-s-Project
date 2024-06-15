// Create a program to print the length of the string entered by the user
// For ex: “Hey Tushar” the program should print : 10

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Please enter a string : "); 
        String input = sc.nextLine();

        System.out.println("String Length : " + input.length());

        sc.close();
    }
}
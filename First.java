// Create class to take input from user

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Please enter your name: "); //taking name input
        String name = sc.nextLine();

        System.out.println("Hey " + name + ", Good morning!");

        sc.close();
    }
}
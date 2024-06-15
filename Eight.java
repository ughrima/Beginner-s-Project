// Create a program to reverse the string
// For ex: “Programmer” to “remmargorP”

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        StringBuilder str=new StringBuilder();

        System.out.print("Please enter a string : "); 
        String s = sc.nextLine();

        for(int i=s.length()-1;i>=0;i--){
            str.append(s.charAt(i));
        }
    System.out.println("Reversed String : "+ str.toString());
}
}
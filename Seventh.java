// Create a class to print following pattern

import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Please enter the height of the pattern : "); 
        Integer h = sc.nextInt();

        for(int i=0;i<h;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println('\n');
        }
    }
}
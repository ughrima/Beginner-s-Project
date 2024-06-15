
import java.util.Scanner;
import java.util.Arrays;

public class Ninth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Please enter a string : "); 
        String str1 = sc.nextLine();

        System.out.print("Please enter anagram : "); 
        String str2 = sc.nextLine();

        char[] chr1=(str1.toLowerCase()).toCharArray();
        char[] chr2=(str2.toLowerCase()).toCharArray();

        if(str1.length()!= str2.length()){
            System.out.println("Not an anagram");
        }
        else {

        Arrays.sort(chr1);
        Arrays.sort(chr2);
            if(Arrays.equals(chr1,chr2)) System.out.println("Yes, anagram");
            else System.out.println("Not an anagram");
        }
        
}
}
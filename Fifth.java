// Create a program to print counting from 100 to 1 using different 
// types of loops (For, Foreach, while)

public class Fifth {
    public static void main(String[] args){
    System.out.println("For loop:");
    for(int i=100;i>=1;i--){
        System.out.print(i+" ");
    }
    int i=100;

    System.out.println("\n");
    System.out.println("While loop:");
    while(i>=0){
        System.out.print(i+" ");
        i--;
    }
    System.out.println("\n");
    System.out.println("For each loop:");

    Integer[] arr=new Integer[100];
    for (int j = 0; j<100; j++) {
        arr[j] = 100-j;
    }
    for (int j : arr) 
    System.out.print(j+ " "); 
}
}
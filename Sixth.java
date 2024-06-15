
// Create a program to break the inner for loop.

public class Sixth {
    public static void main(String[] args){
    for(int i=1;i<=5;i++){
        System.out.println("Outer loop number : "+ i);
        for(int j=1;j<=5;j++){
            if(j==3){
                System.out.println("Loop breaking at : "+j);
                break;
            }
            System.out.println("Inner loop number i = " +i +", j = " +j);
        }
    }
}
}
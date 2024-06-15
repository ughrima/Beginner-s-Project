import java.util.Scanner;

public class Second {
    public int Addition(int num1, int num2) {
        return num1 + num2;
    }

    public int  Subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public int Multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public int Division(int num1, int num2) {
        if(num2 !=0)
        return num1 / num2;
        else {System.out.println("Cannot divide by zero. Please enter a non-zero number");
        return 0;}
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Second obj = new Second();
        System.out.println("Please enter which type of calculation you want to perform :");
        System.out.println("a. Addition\n" + 
                        "b. Subtraction\n" + 
                        "c. Multiplication\n" + 
                        "d. Division");
        System.out.print("Enter your choice (a, b, c, d): ");
        String operation = sc.nextLine();
        System.out.println("Great!\n Please enter the digits for which you want to perform calculations :");
        Integer num1 = sc.nextInt();
        Integer num2 = sc.nextInt();

        int result = 0;
        switch (operation) {
        case "a":
            result = obj.Addition(num1, num2);
            break;
        case "b":
            result = obj.Subtraction(num1, num2);
            break;
        case "c":
            result = obj.Multiplication(num1, num2);
            break;
        case "d":
            result = obj.Division(num1, num2);
            break;
        default:
        System.out.println("Not a valid operation");
        }
        System.out.println("Result of "+operation+"on "+num1+ " and "+num2+" :"+result);
    }
}



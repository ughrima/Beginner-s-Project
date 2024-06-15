import java.util.Scanner;

public class Third {
    public  static void validCharacter(String input) {
        if (input.length() == 1 && Character.isLetter(input.charAt(0)))
        System.out.println("It is a valid character");
        else System.out.println("Not a valid character");
    }
    public static void validBoolean(String input) {
        if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) 
        System.out.println("Valid boolean");
        else System.out.println("Invalid boolean");
    }
    public static void validFloat(String input) {
        try {
            Float.parseFloat(input);
            System.out.println("Valid float");
        } catch (Exception e) {
            System.out.println("Invalid float");
        }
    }
    public static void validInt(String input) {
        try {
            Integer.parseInt(input);
            System.out.println("Valid Integer");
        } catch (Exception e) {
            System.out.println("Invalid Integer");
        }
    }
    public static void validDouble(String input) {
        try {
            Double.parseDouble(input);
            System.out.println("Valid double");
        } catch (Exception e) {
            System.out.println("Invalid double");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Third obj = new Third();
        System.out.println("Select Data type :");
        System.out.println("a. Character\n" + 
                        "b. Boolean\n" + 
                        "c. Float\n" + 
                        "d. Integer\n"+
                        "e. Double");
        System.out.print("Enter your choice (a, b, c, d, e): ");
        String operation = sc.nextLine();
        System.out.println("Great!\n Please enter valid inputs:");
        String inputValue = sc.nextLine();

        switch (operation) {
        case "a":
            obj.validCharacter(inputValue);
            break;
        case "b":
           obj.validBoolean(inputValue);
            break;
        case "c":
           obj.validFloat(inputValue);
            break;
        case "d":
           obj.validInt(inputValue);
            break;
        case "e":
           obj.validDouble(inputValue);
            break;
        default:
        System.out.println("Select the correct option");
        }   
        sc.close();
    }
}



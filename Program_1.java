/* 
 * Program-1 
 */

import java.util.InputMismatchException;
import java.util.Scanner; 

public class Program_1 {

    // inputs
    static double a, b;
    static String typeOfOperation;

    // takes user-input values of a and b
    public static void takeInput(Scanner scn) {
        System.out.println("\t\t ~ Simple Calculator ~");
        try {
            System.out.println("Enter the value of a : ");
            a = scn.nextDouble();
            System.out.println("Enter the value of b : ");
            b = scn.nextDouble();
        } catch (InputMismatchException e) {
            // handle exception : value entered not of type double
            System.out.println("Invalid input. Please enter a number.");
            takeInput(scn);
        }
    }

    public static void userChoice(Scanner scn) {
        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of operation to be performed.");
        System.out.println("TYPE:  \"A\" for Addition" + "\n\t\"S\" for Subtraction" + "\n\t\"M\" for Multiplication" + "\n\t\"D\" for Division");
        typeOfOperation = scn.next();
    }
    
    // main
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // take input from user
        takeInput(scn);
        // take input for type of operation
        userChoice(scn);

        if (!(typeOfOperation.equalsIgnoreCase("A") || 
            typeOfOperation.equalsIgnoreCase("S") ||
            typeOfOperation.equalsIgnoreCase("M") ||
            typeOfOperation.equalsIgnoreCase("D") )) {
            // invalid operation
            System.out.println("Invalid input. Please type in a valid operation.");
            userChoice(scn);
        } else {
            switch (typeOfOperation) {

                case "A":
                    System.out.println("Sum of a & b : " + (int)(a+b));
                    break;

                case "S":
                    System.out.println("Difference of a & b : " + (int)(a-b));
                    break;

                case "M":
                    System.out.println("Product of a & b : " + (int)(a*b));
                    break;

                case "D":
                    System.out.println("Division of a & b : " + (int)(a/b));
                    break;
            }
        }
       
        scn.close();
    }
}

/*
    This programs displays to the user example Java programs that are categorised
    Author: Kade Allen
    Date of creation:   27/11/18
*/

package java_by_example;

import java.util.*;
import java.io.IOException;

public class Main {
    
    // Create scanner input reference
    static Scanner input = new Scanner(System.in);
    // Variable declarations
    static byte mode;
    static String program;
    static boolean mainLoop = true;
    public static String endStatement;
    
    public static void clearConsole() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    public static void simpleAsker() throws IOException {
        System.out.println("\nThis is Simple Programs.\n"
                    + "\t'a' to view the 'Hello World' Program\n"
                    + "\t'b' to view the 'Two Integer Comparison' Program\n"
                    + "\t'c' to view the 'Three Integer Comparison' Program\n"
                    + "\t'd' to view the 'Even or Odd' Program\n"
                    + "\t'e' to view the 'Positive or Negative' Program\n"
                    + "\t'f' to view the 'Leap Year' Program");
            program = input.next();
            switch (program) {
                case "back":
                    categoryAsker();
                    break;
                case "a":
                    Simple.helloWorld();
                    break;
            }
//            if ("back".equals(program)) {
//                categoryAsker();
//            }
//            if ("a".equals(program)) {
//                Simple.helloWorld();
//            }
    }
    
    public static void categoryAsker() throws IOException{
        System.out.println("Enter the correpsonding number/letter to view the corresponding category/program\n"
                + "Enter 'back' at any time to go back to the previous selection,\n"
                + "Enter 'exit' at any time to exit the program.\n"
                + "\t'1' to view Simple Programs\n"
                + "\t'2' to view Loops / Iterations\n"
                + "\t'3' to view Patterns\n"
                + "\t'4' to view Arrays\n"
                + "\t'5' to view Strings\n"
                + "\t'6' to view Mathematics\n"
                + "\t'7' to view Linked Lists.");
        mode = input.nextByte();
        if (mode == 1) {
            simpleAsker();
        }
    }
    
    public static void main(String[] args) throws IOException {
       // Welcome statement
        System.out.println("Welcome to Java By Examples\nPress 'Enter' to continue.");
        input.nextLine();
        categoryAsker();
    }
    
}

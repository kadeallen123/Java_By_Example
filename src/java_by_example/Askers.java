
package java_by_example;

import java.io.IOException;
import java.util.*;
import static java_by_example.Main.cls;
import static java_by_example.Main.program;

public class Askers {
    public static Scanner input = new Scanner(System.in);
    
    public static void categoryAsker() throws IOException{
        cls();
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
        Main.mode = input.nextInt();
        switch (Main.mode) {
            case 1:
                simpleAsker();
                break;
            default:
                categoryAsker();
        }
    }
    
    public static void simpleAsker() throws IOException {
        cls();
        System.out.println("This is Simple Programs.\n"
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
                case "b":
                    Simple.twoIntCompare();
                    break;
                default:
                    simpleAsker();
            }
    }
}

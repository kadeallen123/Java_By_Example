
package java_by_example;

import java.io.IOException;
import java.util.*;
import static java_by_example.Main.cls;
import static java_by_example.Main.program;

public class Askers {
    public static Scanner input = new Scanner(System.in);
    
    public static void categoryAsker() throws IOException, InterruptedException{
        cls();
        System.out.println("Enter the correpsonding number/letter to view the corresponding category/program\n"
                + "Press 'Enter' at any time to go back to the previous selection,\n"
                + "Enter 'again' after a program has run to run it again.\n"
                + "\t'1' to view Simple Programs\n"
                + "\t'2' to view Loops / Iterations\n"
                + "\t'3' to view Patterns\n"
                + "\t'4' to view Arrays\n"
                + "\t'5' to view Strings\n"
                + "\t'6' to view Mathematics\n");
        Main.mode = input.nextInt();
        switch (Main.mode) {
            case 1:
                simpleAsker();
                break;
	    case 2:
		loopsAsker();
            case 3:
                patternsAsker();
            default:
                categoryAsker();
        }
    }
    
    public static void simpleAsker() throws IOException, InterruptedException {
        cls();
        System.out.println("This is Simple Programs.\n"
                    + "\t'a' to view the 'Hello World' Program\n"
                    + "\t'b' to view the 'Two Integer Comparison' Program\n"
                    + "\t'c' to view the 'Three Integer Comparison' Program\n"
                    + "\t'd' to view the 'Even or Odd' Program\n"
                    + "\t'e' to view the 'Leap Year' Program");
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
                case "c":
                    Simple.threeIntCompare();
                    break;
		case "d":
		    Simple.evenOrOdd();
                    break;
                default:
                    simpleAsker();
                    break;
            }
    }
    
    public static void loopsAsker() throws IOException, InterruptedException {
	cls();
	System.out.println("This is Loops / Iterations.\n"
		+ "\t'a' to view the 'Counting' Program\n"
		+ "\t'b' to view the 'Table' Program\n"
		+ "\t'c' to view the 'Even Printing' Program\n"
		+ "\t'd' to view the 'Odd Printing' Program\n");
	program = input.next();
	switch (program) {
	    case "back":
		categoryAsker();
		break;
	    case "a":
		Loops.counting();
		break;
	    case "b":
		Loops.table();
		break;
	    case "c":
		Loops.evenPrinting();
		break;
	    case "d":
		Loops.oddPrinting();
		break;
	    default:
		loopsAsker();
		break;
	}
    }
    
    public static void patternsAsker() throws IOException, InterruptedException {
        cls();
        System.out.println("This is Patterns.\n"
                + "\t'a' to view the 'Equilateral Triangle Printing' Program\n"
                + "\t'b' to view the 'Upside Down Triangle Printing' Program\n"
                + "\t'c' to view the 'Floyd's Triangle' Program\n"
                + "\t'd' to view the 'Pascal's Triangle' Program\n");
        program = input.nextLine();
        switch(program) {
            case "a":
                Patterns.equilateralTriangle();
                break;
            case "b":
                Patterns.upsideDownTriangle();
                break;
            case "c":
                Patterns.floydsTriangle();
                break;
            case "d":
                Patterns.pascalsTriangle();
                break;
            default:
                patternsAsker();
                break;
        }
    }
}

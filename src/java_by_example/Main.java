/*
    This programs displays to the user example Java programs that are categorised
    Author: Kade Allen
    Date of creation:   27/11/18
*/

package java_by_example;

import java.util.*;

public class Main {
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
       // Welcome statement
        System.out.println("Welcome to Java By Examples\nPress 'Enter' to continue");
        input.nextLine();
        System.out.println("Enter the correpsonding number to view example category:\n"
                + "\t'1' to view Simple Programs\n"
                + "\t'2' to view Loops / Iterations\n"
                + "\t'3' to view Patterns\n"
                + "\t'4' to view Arrays\n"
                + "\t'5' to view Strings\n"
                + "\t'6' to view Mathematics\n"
                + "\t'7' to view Linked Lists.\n");
    }
    
}

/*
    This programs displays to the user example Java programs that are categorised
    Author: Kade Allen
    Date of creation:   27/11/18
*/

package java_by_example;

import java.util.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    // Create scanner input reference
    static Scanner input = new Scanner(System.in);
    // Variable declarations
    static int mode;
    static String program;
    static boolean mainLoop = true;
    public static String endStatement;
    
    public static void clearConsole() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    public static void cls() throws IOException{
        try { Main.clearConsole(); } 
        catch (InterruptedException ex) { Logger.getLogger(Simple.class.getName()).log(Level.SEVERE, null, ex); }
    }
        
    public static void main(String[] args) throws IOException, InterruptedException {
       // Welcome statement
        cls();
        System.out.println("Welcome to Java By Examples\nPress 'Enter' to continue.");
        input.nextLine();
        Askers.categoryAsker();
    }
    
}

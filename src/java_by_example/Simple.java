
package java_by_example;

import java.io.IOException;
import java.util.*;
import java.lang.Runtime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Simple {
    
    static Scanner input = new Scanner(System.in);
    static String endStatement;
    
    public static void helloWorld() throws IOException {
        Main.cls();
        System.out.println("Hello World Program!\n"
                + "\nOutput:\n"
                + "Hello World!\n\n"
                + "Code for program:\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "~ public static void main(String[] args) { ~\n"
                + "~ \tSystem.out.println(\"Hello World!\") ~\n"
                + "~ }                                        ~\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        endStatement = input.nextLine();
        switch (endStatement) {
            case "again":
                helloWorld();
                break;
            default:
                Askers.simpleAsker();
                break;
        }
    }
    
    public static void twoIntCompare() throws IOException {
        Main.cls();
        System.out.println("Compare Two Integers Program!\n"
                + "\nInput:\n"
                + "Enter value one:\t");
        final int a = input.nextInt();
        System.out.println("\n"
                + "Enter value two:\t");
        final int b = input.nextInt();
        System.out.println("\nOutput:");
        if(a > b) { System.out.printf("%d is greater than %d\n", a, b);} 
        else { System.out.printf("%d is greater than %d\n", b, a);}
        System.out.println("\nCode for program:\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "~ static Scanner input = new Scanner(System.in);                      ~\n"
                + "~                                                                     ~\n"
                + "~ public static void main(String[] args) {                            ~\n"
                + "~ \tSystem.out.println(\"Enter value one:    \")                    ~\n"
                + "~ \tfinal int a = input.nextInt();                                ~\n"
                + "~                                                                     ~\n"
                + "~ \tSystem.out.println(\"Enter value two:    \")                    ~\n"
                + "~ \tfinal int b = input.nextInt();                                ~\n"
                + "~                                                                     ~\n"
                + "~ \tif(a > b) { System.out.printf(\"%d is greater than %d\", a, b); ~\n"
                + "~ \telse { System.out.printf(\"%d is greater than %d\", b, a);      ~\n"
                + "~ }                                                                   ~\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        endStatement = input.nextLine();
        switch (input.nextLine()) {
            case "again":
                twoIntCompare();
                break;
            default:
                Askers.simpleAsker();
                break;
        }
    }
    public static void threeIntCompare() throws IOException {
        Main.cls();
        System.out.println("Compare Three Integers Program!\n"
                + "\nInput:\n"
                + "Enter value one:\t");
        final int a = input.nextInt();
        System.out.println("\n"
                + "Enter value two:\t");
        final int b = input.nextInt();
        System.out.println("\n"
                + "Enter value three:\t");
        final int c = input.nextInt();
        System.out.println("\nOutput:");
        if(a > b && a > c){ System.out.printf("%d is the largest number out of %d, %d and %d", a, a, b, c); }
        else if (b > a && b > c) { System.out.printf("%d is the largest number out of %d, %d and %d", b, a, b, c); }
        else if (c > a && c > b) { System.out.printf("%d is the largest number out of %d, %d and %d", c, a, b, c); }
        else {System.out.println("Values are identical!");}
        System.out.println("\n\nCode for program:\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "~ static Scanner input = new Scanner(System.in);                                                 ~\n"
                + "~                                                                                                ~\n"
                + "~ public static void main(String[] args) {                                                       ~\n"
                + "~ \tSystem.out.println(\"Enter value one:    \");                                              ~\n"
                + "~ \tfinal int a = input.nextInt();                                                           ~\n"
                + "~                                                                                                ~\n"
                + "~ \tSystem.out.println(\"Enter value two:    \");                                              ~\n"
                + "~ \tfinal int b = input.nextInt();                                                           ~\n"
                + "~                                                                                                ~\n"
                + "~ \tSystem.out.println(\"Enter value three:  \");                                              ~\n"
                + "~ \tfinal int c = input.nextInt();                                                           ~\n"
                + "~                                                                                                ~\n"
                + "~ \tif(a > b && a > c){                                                                      ~\n"
                + "~ \t\tSystem.out.printf(\"%d is the largest number out of %d, %d and %d\", a, a, b, c);  ~\n"
                + "~ \t} else if (b > a && b > c){                                                              ~\n"
                + "~ \t\tSystem.out.printf(\"%d is the largest number out of %d, %d and %d\", b, a, b, c);  ~\n"
                + "~ \t} else if (c > a && c > b){                                                              ~\n"
                + "~ \t\tSystem.out.printf(\"%d is the largest number out of %d, %d and %d\", c, a, b, c);  ~\n"
                + "~ \t} else { System.out.println(\"Values are identical!\");                                    ~\n"
                + "~ }                                                                                              ~\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        endStatement = input.nextLine();
        switch(input.nextLine()) {
            case "again":
                threeIntCompare();
                break;
            default:
                Askers.simpleAsker();
                break;
        }
    }
}

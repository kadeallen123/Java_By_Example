
package java_by_example;

import java.io.IOException;
import java.util.*;
import java.lang.Runtime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Simple {
    
    static Scanner input = new Scanner(System.in);
    
    public static void helloWorld() throws IOException {
        Main.cls();
        System.out.println("Hello World Program!\n"
                + "\nOutput:\n"
                + "Hello World!\n\n"
                + "Code for program:\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "~ public static void main(String[] args) {\n"
                + "~ \tSystem.out.println(\"Hello World!\")\n"
                + "~ }\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        input.nextLine();
        Askers.simpleAsker();
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
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "~ static Scanner input = new Scanner(System.in);\n"
                + "~\n"
                + "~ public static void main(String[] args) {\n"
                + "~ \tSystem.out.println(\"Enter value one:    \")\n"
                + "~ \tfinal int a = input.nextInt();\n"
                + "~ \tSystem.out.println(\"Enter value two:    \")\n"
                + "~ \tfinal int b = input.nextInt();\n"
                + "~ \tif(a > b) { System.out.printf(\"%d is greater than %d\", a, b);\n"
                + "~ \telse { System.out.printf(\"%d is greater than %d\", b, a);\n"
                + "~ }\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        input.nextLine();
        switch (input.nextLine()) {
            default:
                Askers.simpleAsker();
        }
    }
}

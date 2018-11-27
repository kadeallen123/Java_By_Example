
package java_by_example;

import java.io.IOException;
import java.util.*;
import java.lang.Runtime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Simple {
    
    public static String endStatement;
    static Scanner input = new Scanner(System.in);
    
    public static void helloWorld() throws IOException {
        Main.cls();
        System.out.println("Hello World Program!\n"
                + "\nOutput:\n"
                + "Hello World!\n");
        System.out.println("Code for program:\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "~ public static void main(String[] args) {\n"
                + "~~~ System.out.println(\"Hello World!\")\n"
                + "~ }\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        endStatement = input.nextLine();
        if ("back".equals(endStatement) || "".equals(endStatement)) {
            Main.cls();
            System.out.println("");
            Main.simpleAsker();
        }
        
    }
}

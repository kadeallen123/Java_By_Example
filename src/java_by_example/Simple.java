
package java_by_example;

import java.util.*;
import java.lang.Runtime;

public class Simple {
    public static String endStatement;
    static Scanner input = new Scanner(System.in);
    public static void helloWorld() {
        System.out.println("Hello World!\n");
        System.out.println("Code for program:\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "~ public static void main(String[] args) {\n"
                + "~~~ System.out.println(\"Hello World!\")\n"
                + "~ }\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        endStatement = input.nextLine();
        if ("back".equals(endStatement)) {
            Main.clearConsole();
            System.out.println("");
            Main.asker();
        }
        
    }
}

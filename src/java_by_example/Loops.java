
package java_by_example;
import java.io.IOException;
import java.util.*;

public class Loops {
    static String endStatement;
    static Scanner input = new Scanner(System.in);
    
    public static void counting() throws IOException {
        Main.cls();
        System.out.println("Counting Program!\n"
                + "\nInput:\n"
                + "Enter start value:\t");
        final int start = input.nextInt();
        System.out.println("\n"
                + "Enter end value:\t");
        final int end = input.nextInt();
        System.out.println("\nOutput:");
        for(int i = start; i <= end; i++) {
            System.out.printf("%d\n", i);
        }
        System.out.println("\nCode for program:\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "~ static Scanner input = new Scanner(System.in);    ~\n"
                + "~                                                   ~\n"
                + "~ public static void main(String[] args) {          ~\n"
                + "~     System.out.println(\"Enter start value:\\t\");   ~\n"
                + "~     final int start = input.nextInt();            ~\n"
                + "~                                                   ~\n"
                + "~     System.out.println(\"Enter end value:\\t\");     ~\n"
                + "~     final int end = input.nextInt();              ~\n"
                + "~                                                   ~\n"
                + "~     for(int i = start; i <= end; i++) {           ~\n"
                + "~         System.out.printf(\"%d\\n\", i);             ~\n"
                + "~     }                                             ~\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "\n"
                + "Enter 'again' to run the program, or enter anything else to go back.");
        endStatement = input.nextLine();
	switch (input.nextLine()) {
	    case "again":
		counting();
		break;
	    default:
		Askers.loopsAsker();
		break;
	}
    }
    
    public static void table() throws IOException {
        Main.cls();
        System.out.println("Times Tables Program!\n"
                + "\nInput:\n"
                + "Enter base number:\t");
        final int base = input.nextInt();
        int a = 1;
        System.out.printf("\n%d Times Tables:\n", base);
        for(int i = base; i <= (base * 12); i += base) {
            System.out.printf("\t%d x %d =  %d\n", base, a, i);
            a++;
        }
        endStatement = input.nextLine();
	switch (input.nextLine()) {
	    case "again":
		table();
		break;
	    default:
		Askers.loopsAsker();
		break;
	}
    }
    
    public static void evenPrinting() throws IOException {
	Main.cls();
        
    }
    
    public static void oddPrinting() throws IOException {
	Main.cls();
        
    }
}

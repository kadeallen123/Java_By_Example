package java_by_example;

import java.io.IOException;
import java.util.*;

public class Patterns {

    static String endStatement;
    static Scanner input = new Scanner(System.in);

    public static void equilateralTriangle() throws IOException, InterruptedException {
        Main.cls();
        System.out.println("Equalateral Triangle Printing Program!\n"
                + "\nInput:\n"
                + "Enter number of rows:\t");
        int base = input.nextInt();
        System.out.println("\nOutput:\n");
        int j, i;
        for (i = 1; i <= base; i++) {
            for (j = 1; j <= base - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println("\nCode for program:\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "~ static Scanner input = new Scanner(System.in);       ~\n"
                + "~                                                      ~\n"
                + "~ public static void main(String[] args) {             ~\n"
                + "~     System.out.println(\"Enter number of rows:\\t\");   ~\n"
                + "~     final int base = input.nextInt();                ~\n"
                + "~                                                      ~\n"
                + "~     int j, i;                                        ~\n"
                + "~     for (i = 1; i <= base; i++) {                    ~\n"
                + "~         for (j=1; j <= base-i; j++) {                ~\n"
                + "~             System.out.print(\" \");                   ~\n"
                + "~         }                                            ~\n"
                + "~         for (j=1; j <= i; j++) {                     ~\n"
                + "~             System.out.print(\"* \");                  ~\n"
                + "~         }                                            ~\n"
                + "~         System.out.print(\"\\n\");                      ~\n"
                + "~     }                                                ~\n"
                + "~ }                                                    ~\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "\n"
                + "Enter 'again' to go run the program, or anything else to go back.");
        endStatement = input.nextLine();
        switch (input.nextLine()) {
            case "again":
                equilateralTriangle();
                break;
            default:
                Askers.patternsAsker();
                break;
        }

    }

    public static void upsideDownTriangle() throws IOException {
        Main.cls();

    }

    public static void floydsTriangle() throws IOException, InterruptedException {
        Main.cls();
        System.out.println("Floyd's Triangle Printing Program!\n"
                + "\nInput:\n"
                + "Enter number of rows to be printed (Max recommended, 13):\t");
        double rows = input.nextDouble();
        int i, j, k = 0;
        aboveMax:
        if (rows > 13) {
            Main.cls();
            System.out.println("That value is above the maximum recommended value of 13\n"
                    + "Are you sure you would like to continue? (y\\n)");
            String cond = input.next();
            if (cond.equals("n")) {
                Main.cls();
                for (int q = 3; q >= 0; q--) {
                    if (q == 0) {
                        System.out.println("Restarting");
                        Thread.sleep(1000);
                        break;
                    }
                    System.out.printf("Restarting program in %d\n", q);
                    Thread.sleep(1000);
                    Main.cls();
                }
                floydsTriangle();
            } else {
                break aboveMax;
            }
        }
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {
                System.out.printf("%3d", k++);
            }
            System.out.print("\n");
        }

        endStatement = input.nextLine();
        switch (input.nextLine()) {
            case "again":
                floydsTriangle();
                break;
            default:
                Askers.patternsAsker();
                break;
        }
    }

    public static void pascalsTriangle() throws IOException, InterruptedException {
        Main.cls();
        System.out.println("Pascals Triangle Printing Program!\n"
                + "\nInput:\n"
                + "Enter number of rows to be printed (Max of 14):\t");
        double rows = input.nextDouble();
        if (rows >= 15.0) {
            Main.cls();
            for (int i = 3; i >= 0; i--) {
                if (i == 0) {
                    System.out.println("Restarting");
                    Thread.sleep(1000);
                    break;
                }
                System.out.printf("That value is above the maximum of 14.\n"
                        + "Please try again in %d seconds\n", i);
                Thread.sleep(1000);
                Main.cls();
            }
            pascalsTriangle();
        }
        System.out.println("\nOutput:");
        int i, j;
        for (i = 0; i <= rows; i++) {
            for (j = 0; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (j = 0; j <= i; j++) {
                System.out.printf(" %3d", ExtraMethods.ncr(i, j));
            }
            System.out.print("\n");
        }
        System.out.println("\nCode for program:\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "~ public static int factorial(int rows) {                               ~\n"
                + "~     int factorialResult;                                              ~\n"
                + "~     for (factorialResult = 1; rows > 1; rows--) {                     ~\n"
                + "~         factorialResult *= rows;                                      ~\n"
                + "~     }                                                                 ~\n"
                + "~     return factorialResult;                                           ~\n"
                + "~ }                                                                     ~\n"
                + "~                                                                       ~\n"
                + "~ public static int ncr(int rows, int r) {                              ~\n"
                + "~     return factorial(rows) / (factorial(rows - r) * factorial(r));    ~\n"
                + "~ }                                                                     ~\n"
                + "~                                                                       ~\n"
                + "~ public static void main(String[] args) {                              ~\n"
                + "~     System.out.println(\"Enter amount of rows to be printed:\\t\");      ~\n"
                + "~     final int rows = input.nextInt();                                 ~\n"
                + "~     int i, j;                                                         ~\n"
                + "~     for (i=0; i<= rows; i++) {                                        ~\n"
                + "~         for(j=0; j<= rows-i; j++) {                                   ~\n"
                + "~             System.out.print(\"  \");                                   ~\n"
                + "~         }                                                             ~\n"
                + "~         for(j=0; j<=i; j++) {                                         ~\n"
                + "~             System.out.printf(\" %3d\", ExtraMethods.ncr(i, j));        ~\n"
                + "~         }                                                             ~\n"
                + "~         System.out.print(\"\\n\");                                       ~\n"
                + "~ }                                                                     ~\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "\n"
                + "Enter 'again' to run the program, or anything else to go back.");

        endStatement = input.nextLine();
        switch (input.nextLine()) {
            case "again":
                pascalsTriangle();
                break;
            default:
                Askers.patternsAsker();
                break;
        }
    }
}

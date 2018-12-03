package java_by_example;

import java.io.IOException;
import java.util.*;

public class Patterns {

    static String endStatement;
    static Scanner input = new Scanner(System.in);
    static String codeCond;

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
        System.out.println(Codes.endOfProgramCodeAsker);
        codeCond = input.next();
        if (codeCond.equals("y")) {
            System.out.println(Codes.equilateralTriangle);
            System.out.println(Codes.endOfProgramAsker);
            endStatement = input.nextLine();
            switch (input.nextLine()) {
                case "again":
                    equilateralTriangle();
                    break;
                default:
                    Askers.patternsAsker();
                    break;
            }
        } else {
            System.out.println(Codes.endOfProgramAsker);
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
    }

    public static void upsideDownTriangle() throws IOException, InterruptedException {
        Main.cls();
        System.out.println("Upside Down Triangle Printing Program!\n"
                + "\nInput:\n"
                + "Enter amount of rows:\t");
        final int rows = input.nextInt();
        int i, j;
        for (i = 1; i <= rows; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= rows; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println(Codes.endOfProgramCodeAsker);
        codeCond = input.next();
        if (codeCond.equals("y")) {
            System.out.println(Codes.upsideDownTriangle);
            System.out.println(Codes.endOfProgramAsker);
            endStatement = input.nextLine();
            switch (input.nextLine()) {
                case "again":
                    upsideDownTriangle();
                    break;
                default:
                    Askers.patternsAsker();
                    break;
            }
        } else {
            System.out.println(Codes.endOfProgramAsker);
            endStatement = input.nextLine();
            switch (input.nextLine()) {
                case "again":
                    upsideDownTriangle();
                    break;
                default:
                    Askers.patternsAsker();
                    break;
            }
        }
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
        System.out.println("\nOutput:");
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {
                System.out.printf("%3d", k++);
            }
            System.out.print("\n");
        }
        System.out.println(Codes.endOfProgramCodeAsker);
        String codeCond = input.next();
        if (codeCond.equals("y")) {
            System.out.println(Codes.floydsTriangle);
            System.out.println(Codes.endOfProgramAsker);
            endStatement = input.nextLine();
            switch (input.nextLine()) {
                case "again":
                    floydsTriangle();
                    break;
                default:
                    Askers.patternsAsker();
                    break;
            }
        } else {
            System.out.println(Codes.endOfProgramAsker);
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
        System.out.println(Codes.endOfProgramCodeAsker);
        codeCond = input.next();
        if (codeCond.equals("y")) {
            System.out.println(Codes.pascalsTriangle);
            System.out.println(Codes.endOfProgramAsker);
            endStatement = input.nextLine();
            switch (input.nextLine()) {
                case "again":
                    pascalsTriangle();
                    break;
                default:
                    Askers.patternsAsker();
                    break;
            }
        } else {
            System.out.println(Codes.endOfProgramAsker);
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
}

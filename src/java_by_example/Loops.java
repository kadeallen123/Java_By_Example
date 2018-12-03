package java_by_example;

import java.io.IOException;
import java.util.*;

public class Loops {

    static String endStatement;
    static Scanner input = new Scanner(System.in);
    static String codeCond;

    public static void counting() throws IOException, InterruptedException {
        Main.cls();
        System.out.println("Counting Program!\n"
                + "\nInput:\n"
                + "Enter start value:\t");
        final int start = input.nextInt();
        System.out.println("\n"
                + "Enter end value:\t");
        final int end = input.nextInt();
        System.out.println("\nOutput:");
        for (int i = start; i <= end; i++) {
            System.out.printf("%d\n", i);
        }
        System.out.println(Codes.endOfProgramCodeAsker);
        codeCond = input.next();
        if (codeCond.equals("y")) {
            System.out.println(Codes.counting);
            System.out.println(Codes.endOfProgramAsker);
            endStatement = input.nextLine();
            switch (input.nextLine()) {
                case "again":
                    counting();
                    break;
                default:
                    Askers.loopsAsker();
                    break;
            }
        } else {
            System.out.println(Codes.endOfProgramAsker);
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

    }

    public static void table() throws IOException, InterruptedException {
        Main.cls();
        System.out.println("Times Tables Program!\n"
                + "\nInput:\n"
                + "Enter base number:\t");
        final int base = input.nextInt();
        int a = 1;
        System.out.printf("\n%d Times Tables:\n", base);
        for (int i = base; i <= (base * 12); i += base) {
            System.out.printf("\t%d x %d =  %d\n", base, a, i);
            a++;
        }
        System.out.println(Codes.endOfProgramCodeAsker);
        codeCond = input.next();
        if (codeCond.equals("y")) {
            System.out.println(Codes.table);
            System.out.println(Codes.endOfProgramAsker);
            endStatement = input.nextLine();
            switch (input.nextLine()) {
                case "again":
                    table();
                    break;
                default:
                    Askers.loopsAsker();
                    break;
            }
        } else {
            System.out.println(Codes.endOfProgramAsker);
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
    }

    public static void evenPrinting() throws IOException {
        Main.cls();

    }

    public static void oddPrinting() throws IOException {
        Main.cls();

    }
}

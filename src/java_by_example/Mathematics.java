package java_by_example;

import java.util.*;
import java.io.IOException;

public class Mathematics {

    static Scanner input = new Scanner(System.in);
    static String codeCond;
    static String endStatement;

    public static void armstrongNumber() throws IOException, InterruptedException {
        Main.cls();
        System.out.println("Armstrong Number Program!\n"
                + "\nInput:\n"
                + "Enter number to see if it is a Armstrong Number:\t");
        int number = input.nextInt();
        int check, rem, sum = 0;
        check = number;
        while (check != 0) {
            rem = check % 10;
            sum = sum + (rem * rem * rem);
            check = check / 10;
        }
        System.out.println("\nOutput:");
        if (sum == number) {
            System.out.printf("%d is an Armstrong number.\n", number);
        } else {
            System.out.printf("%d is NOT an Armstrong number.\n", number);
        }
        System.out.println(Codes.endOfProgramCodeAsker);
        codeCond = input.next();
        if (codeCond.equals("y")) {
            System.out.println(Codes.armstrongNumber);
            System.out.println(Codes.endOfProgramAsker);
            endStatement = input.nextLine();
            switch (input.nextLine()) {
                case "again":
                    armstrongNumber();
                    break;
                default:
                    Askers.mathematicsAsker();
                    break;
            }
        } else {
            System.out.println(Codes.endOfProgramAsker);
            endStatement = input.nextLine();
            switch (input.nextLine()) {
                case "again":
                    armstrongNumber();
                    break;
                default:
                    Askers.mathematicsAsker();
                    break;
            }
        }
    }

}

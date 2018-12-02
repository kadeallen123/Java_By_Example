package java_by_example;

public class ExtraMethods {

    public static int factorial(int rows) {
        int factorialRes;

        for (factorialRes = 1; rows > 1; rows--) {
            factorialRes *= rows;
        }
        return factorialRes;
    }

    public static int ncr(int rows, int r) {
        return factorial(rows) / (factorial(rows - r) * factorial(r));
    }

}

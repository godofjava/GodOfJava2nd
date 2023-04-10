public class MyCalculator {

    public int add(int a, int b) {
        System.out.printf("%d + %d = %d", a, b, a + b);
        System.out.println();
        return a + b;
    }

    public int subtract(int a, int b) {
        System.out.printf("%d - %d = %d", a, b, a - b);
        System.out.println();
        return a - b;
    }

    public int multiply(int a, int b) {
        System.out.printf("%d * %d = %d", a, b, a * b);
        System.out.println();
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Divided By Zero");
            return -1; // unexpected error
        }
        System.out.printf("%d / %d = %d", a, b, a / b);
        System.out.println();
        return a / b;
    }
}

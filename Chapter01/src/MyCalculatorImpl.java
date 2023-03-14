import java.util.Scanner;

public class MyCalculatorImpl {

    public static void showMenu() {
        System.out.println("======= Menu =======");
        System.out.println("0. Exit");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("Please put the command number:");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCalculator myCalculator = new MyCalculator();
        boolean flag = true;
        int command = 0;
        int a = 0;
        int b = 0;
        while (flag) {
            showMenu();
            System.out.println("git commit 테스트");
            command = sc.nextInt();
            switch (command) {
                case 0:
                    flag = false;
                    System.out.println("Thanks. See you later :)");
                    break;
                case 1:
                    System.out.println("Put a, b that you want to add: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    myCalculator.add(a, b);
                    break;
                case 2:
                    System.out.println("Put a, b that you want to subtract: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    myCalculator.subtract(a, b);
                    break;
                case 3:
                    System.out.println("Put a, b that you want to multiply: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    myCalculator.multiply(a, b);
                    break;
                case 4:
                    System.out.println("Put a, b that you want to divide: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    myCalculator.divide(a, b);
                    break;
                default:
                    System.out.println("You got an wrong number. Please try again.");
                    break;
            }
        }
    }
}

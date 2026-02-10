
    /**
 * Topic: Control Statements
 *
 * Concepts:
 * - if-else
 * - switch-case
 * - for loop
 *
 * Author: Neha Thorat
 * Day: 3
 */
public class ControlStatement {

    public static void main(String[] args) {

        int num = 5;

        if (num > 0) {
            System.out.println("Positive number");
        } else if (num < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }

        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Invalid day");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
    }
}

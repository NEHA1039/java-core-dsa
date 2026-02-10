
/**
 * Topic: Input Output and Type Casting
 *
 * Concepts:
 * - Scanner class
 * - Implicit and Explicit type casting
 *
 * Author: Neha Thorat
 * Day: 2
 */
import java.util.Scanner;
public class InputOutputDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        double converted = number; // implicit

        double value = 9.7;
        int castedValue = (int) value; // explicit

        System.out.println("Implicit cast: " + converted);
        System.out.println("Explicit cast: " + castedValue);
    }
}


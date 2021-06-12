package ex31;

// -----------------------------------
// Exercise 31 - Karvonen Heart Rate
// -----------------------------------

import java.util.Scanner;

public class App {
    private static String restingPulse;
    private static String age;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        setPulseAge(scanner);

        while (!validateInputs()) {
            setPulseAge(scanner);
        }

        System.out.println(heartTableGenerator.generateTable(Integer.parseInt(age), Integer.parseInt(restingPulse)));
    }

    private static void setPulseAge(Scanner scanner) {
        System.out.print("Enter your resting pulse: ");
        restingPulse = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextLine();
    }

    private static boolean validateInputs() {
        if (restingPulse.length() > 0 && age.length() > 0) {
            for (char c : restingPulse.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
            for (char c : age.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }

            return true;
        }

        return false;
    }
}

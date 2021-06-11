package ex25;

import static java.lang.System.exit;

public class PasswordValidator {

    public int validatePassword(String password) {

        if (password.length() == 0) {
            System.out.println("No password given");
            exit(-1);
        }

        int letters = 0;
        int numbers = 0;
        int other = 0;
        int strength;

        for (char character : password.toCharArray()) {
            if (Character.isLetter(character))
                letters++;
            else if (Character.isDigit(character))
                numbers++;
            else
                other++;
        }

        if (password.length() < 8) {
            // password is very weak, weak, or fine
            if (letters + other == 0)
                strength = 0;
            else if (numbers + other == 0)
                strength = 1;
            else
                strength = 2;
        } else {
            // password is fine, strong, or very strong
            strength = 2; // is at least fine
            if (letters > 0 && numbers > 0 && other == 0)
                strength = 3;
            else if (letters > 0 && numbers > 0 && other > 0)
                strength = 4;

        }

        return strength;
    }
}

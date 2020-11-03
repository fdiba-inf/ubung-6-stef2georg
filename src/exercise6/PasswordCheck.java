package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean passwordValid = false;
        do {
            System.out.print("Enter a password: ");
            String password = input.nextLine();

            if (password.length() > 8) {
                boolean allLettersAndDigits = true;
                int numberOfDigits = 0;
                for (int index = 0; index < password.length(); index++) {
                    final char nextSymbol = password.charAt(index);
                    if (!Character.isLetterOrDigit(nextSymbol)) {
                        allLettersAndDigits = false;
                        break;
                    }

                    if (Character.isDigit(nextSymbol)) {
                        numberOfDigits++;
                    }
                }

                if (allLettersAndDigits && numberOfDigits >= 2) {
                    passwordValid = true;
                }
            }
        } while (!passwordValid);

        System.out.println("Password valid!");
    }
}

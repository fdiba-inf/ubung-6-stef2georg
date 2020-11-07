package exercise6;

import java.util.Scanner;

public class PasswordCheck2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean passwordValid = false;
        do {
            String password = input.nextLine();
            if (password.length() >= 8) {
                boolean letterOrDigit = true;
                for (int i = 0; i < password.length(); i++) {
                    char nextSymbol = password.charAt(i);
                    if (!Character.isLetterOrDigit(nextSymbol)) {
                        letterOrDigit = false;
                        break;
                    }
                }

                if (letterOrDigit) {
                    int digitCount = 0;
                    for (int i = 0; i < password.length(); i++) {
                        char nextSymbol = password.charAt(i);
                        if (Character.isDigit(nextSymbol)) {
                            digitCount++;
                        }
                    }

                    if (digitCount >= 2) {
                        passwordValid = true;
                    }
                }
            }
        } while (!passwordValid);
        System.out.println("Password valid!");
    }
}

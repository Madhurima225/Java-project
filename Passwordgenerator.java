import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        System.out.print("Include uppercase letters? (yes/no): ");
        boolean useUppercase = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include numbers? (yes/no): ");
        boolean useNumbers = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include special characters? (yes/no): ");
        boolean useSpecialChars = scanner.next().equalsIgnoreCase("yes");

        String password = generatePassword(length, useUppercase, useNumbers, useSpecialChars);

        System.out.println("Generated Password: " + password);
    }

    public static String generatePassword(int length, boolean useUppercase, boolean useNumbers, boolean useSpecialChars) {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()_+";

        StringBuilder password = new StringBuilder(length);
        Random random = new Random(System.nanoTime());

        if (useUppercase) {
            chars += uppercaseChars;
        }
        if (useNumbers) {
            chars += numbers;
        }
        if (useSpecialChars) {
            chars += specialChars;
        }

        for (int i = 0; i < length; i++) {
            password.append(chars.charAt(random.nextInt(chars.length())));
        }

        return password.toString();
    }
}



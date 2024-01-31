import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String sys_username = "Mustafa";
        String sys_password = "1234";

        Scanner scanner = new Scanner(System.in);

        int loginAttempts = 3;

        while (loginAttempts > 0) {

            System.out.println("Enter your username:");
            String enteredUsername = scanner.nextLine();
            System.out.println("Enter your password:");
            String enteredPassword = scanner.nextLine();

            if (sys_username.equals(enteredUsername) && sys_password.equals(enteredPassword)) {
                System.out.println("Username and password are correct. Welcome!");
                break;
            } else {
                System.out.println("Incorrect username or password");
                loginAttempts--;
                System.out.println("Remaining Login Attempts: " + loginAttempts);
            }
        }

        if (loginAttempts == 0) {
            System.out.println("You have run out of login attempts.");
        }
    }
}

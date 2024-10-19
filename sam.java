import java.util.Scanner;

public class UserInputCountdownTimer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for countdown time
        System.out.print("Enter countdown time in seconds: ");
        int countdownTime = scanner.nextInt(); // Read user input

        System.out.println("Countdown starts now:");

        for (int i = countdownTime; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                System.err.println("Timer interrupted");
            }
        }

        System.out.println("Time's up!");
        scanner.close(); // Close the scanner
    }
}

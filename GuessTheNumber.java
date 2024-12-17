import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Create Scanner for user input and Random for generating random number
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        int userGuess = 0; // Variable to store user input
        int attempts = 0;  // Counter for number of guesses

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it!");

        // Game Loop
        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");
            try {
                userGuess = scanner.nextInt(); // Read user input
                attempts++;

                // Check the guess
                if (userGuess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }

        // Close the scanner
        scanner.close();
        System.out.println("Thanks for playing!");
    }
}

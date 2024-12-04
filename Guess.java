import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int secretNumber = rand.nextInt(10) + 1;
        
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I am thinking of a number between 1 and 10.");
        System.out.println("You have 3 attempts to guess the correct number.");
        int attempts = 3;
        boolean guessedCorrectly = false;
        
        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt " + i + ": Enter your guess: ");
            int guess = scanner.nextInt();
            
            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                guessedCorrectly = true;
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Sorry! You've used all attempts. \nThe correct number was: " + secretNumber);
        }
        scanner.close();
    }
}

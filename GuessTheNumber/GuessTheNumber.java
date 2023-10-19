import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    private static int min = 1;
    private static int max = 100;

    public static void guessNumber(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numberToGuess = random.nextInt(max - min + 1) + min;
        int attempts = 0;
        int guess = 0;

        System.out.println("Welcome to Guess the Number!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Try a higher number.");
            } else if (guess > numberToGuess) {
                System.out.println("Try a lower number.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }
    }
    
    
}

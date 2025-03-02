package GamePrograms;

import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int position = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (position < 100) {
            System.out.println("Press enter to roll the dice...");
            scanner.nextLine();
            int dice = random.nextInt(6) + 1;
            System.out.println("You rolled: " + dice);

            if (position + dice <= 100) {
                position += dice;
                System.out.println("You moved to position: " + position);
            }

            // Simple snake and ladder logic
            if (position == 25) {
                position = 5;  // Snake bite
                System.out.println("Oops! Snake bite! Move back to position 5.");
            } else if (position == 50) {
                position = 80; // Ladder
                System.out.println("Great! You climbed a ladder to position 80.");
            }
        }
        System.out.println("Congratulations! You won the game.");
        scanner.close();
    }
}

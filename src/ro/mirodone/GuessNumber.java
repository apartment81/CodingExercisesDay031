package ro.mirodone;

import java.util.Random;
import java.util.Scanner;

 class GuessNumber {

    private Random r = new Random();
    private Scanner scanner = new Scanner(System.in);

    void numberGuess(int highNumber) {

        int count = 0;
        int guess = 0;
        int number = 1 + r.nextInt(highNumber);
        //System.out.println(number);// uncomment to cheat:)

        System.out.println("I'm thinking about a number between 1 and " + highNumber + "\n" + "Can you guess it?");

        while (guess != number) {
            count++;
            guess = scanner.nextInt();
            if (guess > number) {
                System.out.println("Too high ! Try again ..");
            } else if (guess < number) {
                System.out.println("Too Low ! Try again .. ");
            }
        }
        System.out.println("Guessed !");
        System.out.println("You tried " + count + " times !");

    }

}

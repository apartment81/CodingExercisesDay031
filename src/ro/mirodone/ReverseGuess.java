package ro.mirodone;

import java.util.Scanner;

 class ReverseGuess {

    void cumputerGuess () {
        Scanner keyboard = new Scanner(System.in);

        String response = "a";

        System.out.println( "Think of a number from 1 to 1000. I'll try to guess it." );
        int lo = 1;
        int hi = 1000;

        while ( !response.equals("c") ) {


            int guess = ( lo + hi ) / 2;

            System.out.println( "My guess is " + guess + ". Am I to (h)igh, too (l)ow, or (c)orrect?" );
            System.out.print( "> " );
            response = keyboard.next();

            if ( response.equals("h") ) {
                hi = guess;
            }

            if ( response.equals("l") ) {
                lo = guess;
            }
        }

        System.out.println( "Ha! I am the greatest guesser in the world!" );

    }
}

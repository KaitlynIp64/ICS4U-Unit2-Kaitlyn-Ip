/*
* This program checks how many characters repeat in a string
*
* @author  Kaitlyn Ip
* @version 1.0
* @since   2024-03-25
*/

import java.util.Scanner;

/**
* This is the program.
*/
final class MaxRuns {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private MaxRuns() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * Returns a new array with an added integer.
     *
     * @param array to be used
     * @param integer to be added into the array
     * @return the new array with the added integer
    */
    static int[] push(int[] array, int integer) {
        final int[] newArray = new int[array.length + 1];

        for (int counter = 0; counter < array.length; counter++) {
            newArray[counter] = array[counter];
        }

        newArray[array.length] = integer;

        return newArray;
    }

    /**
    * Finds the highest amount of the same character in a row in a string.
    *
    * @param string to be used
    * @return the longest streak of characters in a row
    */
    static int maxRun(String string) {
        // Loop variables
        int[] streaks = {1};
        int currentStreak = 0;
        int selectedChar = 0;
        char oldChar = string.charAt(selectedChar);
        // Check for all of the streaks of characters in a row
        for (int counter = 1; counter < string.length(); counter++) {
            final char currentChar = string.charAt(counter);

            if (oldChar == currentChar) {
                // Add one to the current streak
                streaks[currentStreak]++;
            } else {
                // Add a new streak and start using it
                streaks = push(streaks, 1);
                currentStreak++;
            }
            // Move one character up
            selectedChar++;
            oldChar = string.charAt(selectedChar);
        }
        int streak = 1;
        for (int counter = 0; counter < streaks.length; counter++) {
            if (streak < streaks[counter]) {
                streak = streaks[counter];
            }
        }

        return streak;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Scanners
        final Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a string: ");
        final String string = input.nextLine();

        // Get the max run and print it
        final int maxRuns = maxRun(string);
        System.out.println(
                "The max run of " + string + " is " + maxRuns + "."
        );

        // Close scanners
        input.close();

        // Show the program as done
        System.out.println("\nDone.");
    }
}

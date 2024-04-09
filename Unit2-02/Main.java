/*
* This program calculates the energy released when mass is converted to energy.
*
* @author  Kaitlyn Ip
* @version 1.0
* @since   2024-03-25
*/

/**
* This runs testcases.
*/
final class Main {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final String popString = "popped: ";

        // input
        final KaiStack fruits = new KaiStack();
        fruits.push("apple");
        fruits.push("orange");
        fruits.push("watermelon");
        System.out.println(popString + fruits.pop());
        System.out.println(popString + fruits.pop());
        System.out.println(popString + fruits.pop());
        System.out.println("fruits: " + fruits.show());

        final KaiStack colours = new KaiStack();
        colours.push("red");
        colours.push("blue");
        colours.push("purple");
        System.out.println(popString + colours.pop());
        System.out.println("colours: " + colours.show());

        final KaiStack animals = new KaiStack();
        animals.push("dog");
        animals.push("otter");
        animals.push("duck");
        System.out.println(popString + animals.pop());
        System.out.println(popString + animals.pop());
        System.out.println(popString + animals.pop());
        System.out.println("animals: " + animals.show());

        System.out.println("\nDone.");
    }
}

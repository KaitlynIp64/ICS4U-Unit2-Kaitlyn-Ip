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
final class TestCases {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private TestCases() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final String popString = "popped: ";
        final String lengthString = "length: ";
        final String emptyString = "is empty: ";

        // input
        final KaiStack fruits = new KaiStack();
        fruits.push("apple");
        fruits.push("watermelon");
        System.out.println("clearing stack:");
        fruits.clear();
        System.out.println(popString + fruits.pop());
        System.out.println("fruits: " + fruits.show());
        System.out.println(lengthString + fruits.size());
        System.out.println(emptyString + fruits.isEmpty());
        System.out.println();

        final KaiStack colours = new KaiStack();
        colours.push("red");
        colours.push("green");
        colours.push("blue");
        System.out.println(lengthString + colours.size());
        System.out.println(popString + colours.pop());
        System.out.println("colours: " + colours.show());
        System.out.println(emptyString + colours.isEmpty());
        System.out.println();

        final KaiStack animals = new KaiStack();
        animals.push("dog");
        animals.push("otter");
        animals.push("duck");
        animals.push("cat");
        animals.push("bunny");
        System.out.println(popString + animals.pop());
        System.out.println(popString + animals.pop());
        System.out.println(popString + animals.pop());
        System.out.println("peeking animals: " + animals.peek());
        System.out.println("animals: " + animals.show());
        System.out.println(lengthString + animals.size());
        System.out.println();

        System.out.println("\nDone.");
    }
}

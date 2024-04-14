/*
 * This is a program that pops stack.
 *
 * @author  Kaitlyn Ip
 * @version 1.0
 * @since   2024-01-01
 */

import java.util.Stack;

public class KaiStack {
    public static void main(String[] args) {
        let fruits = new KaiStack();
        fruits.push("apple");
        fruits.push("orange");
        fruits.push("watermelon");
        System.out.println("cleared stack");
        fruits.clear();
        System.out.println("popped: " + fruits.pop());
        System.out.println("fruits: " + fruits);
        System.out.println("length: " + fruits.size());
        System.out.println("is empty: " + fruits.isEmpty());
        System.out.println();

        let colours = new KaiStack();
        colours.push("red");
        colours.push("blue");
        colours.push("purple");
        System.out.println("length: " + colours.size());
        System.out.println("popped: " + colours.pop());
        System.out.println("colours: " + colours);
        System.out.println("is empty: " + colours.isEmpty());
        System.out.println();

        let animals = new KaiStack();
        animals.push("dog");
        animals.push("otter");
        animals.push("duck");
        animals.push("cat");
        animals.push("bunny");
        System.out.println("popped: " + animals.pop());
        System.out.println("popped: " + animals.pop());
        System.out.println("popped: " + animals.pop());
        System.out.println("peak last item: " + animals.peek());
        System.out.println("animals: " + animals);
        System.out.println("length: " + animals.size());

        System.out.println("\nDone.");
    }
}


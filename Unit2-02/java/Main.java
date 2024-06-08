/*
 * This is a program prints out stuff.
 * @author  Kaitlyn Ip
 * @version 1.0 
 * @since   2024-02-26
 */

// Assuming KaiStack is in the correct package

public class Main {

    public static void main(String[] args) {
    // this function uses the KaiStack
        KaiStack fruitStack = new KaiStack();
        fruitStack.push("apple");
        fruitStack.push("banana");
        fruitStack.push("watermelon");
        System.out.println("\nFruit items: " + fruitStack.show());
        String topFruit = fruitStack.pop();
        System.out.println("Popped fruit item: " + topFruit);
        System.out.println("Fruit items: " + fruitStack.show());

        KaiStack colorStack = new KaiStack();
        colorStack.push("red");
        colorStack.push("green");
        colorStack.push("blue");
        System.out.println("\nColor items: " + colorStack.show());
        String topColor = colorStack.pop();
        System.out.println("Popped color item: " + topColor);
        System.out.println("Color items: " + colorStack.show());

        KaiStack animalStack = new KaiStack();
        animalStack.push("dog");
        animalStack.push("otter");
        animalStack.push("duck");
        System.out.println("\nAnimals: " + animalStack.show());
        String topAnimal = animalStack.pop();
        System.out.println("Popped animal item: " + topAnimal);
        System.out.println("Animals: " + animalStack.show());

        System.out.println("\nDone.");
     }
}

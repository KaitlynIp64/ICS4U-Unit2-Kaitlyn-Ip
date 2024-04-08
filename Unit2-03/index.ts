/**
 * This is the standard index.ts starting point.
 *
 * author Kaitlyn Ip
 * version 1.0
 * since 2024-03-19
 */

import KaiStack from "./KaiStack"

let fruits = new KaiStack()
fruits.push("apple")
fruits.push("orange")
fruits.push("watermelon")
console.log("fruits: " + fruits.show())
const top_fruit = fruits.pop()
const isempty = fruits.isEmpty()
console.log("Is the stack empty? " + isempty)
const size = fruits.size()
console.log("The size of the stack is: " + size)
console.log("popped fruit: " + top_fruit)
console.log("fruits: " + fruits.show())
const isempty2 = fruits.isEmpty()
console.log("Is the stack empty? " + isempty2)
const size2 = fruits.size()
console.log("The size of the stack is: " + size2)
console.log("\n")

let colours = new KaiStack()
colours.push("purple")
colours.push("blue")
console.log("colours: " + colours.show())
const isempty3 = colours.isEmpty()
console.log("Is the stack empty? " + isempty3)
const size3 = colours.size()
console.log("The size of the stack is: " + size3)
const top_colour = colours.pop()
console.log("popped colour: " + top_colour)
console.log("colours: " + colours.show())
const isempty4 = colours.isEmpty()
console.log("Is the stack empty? " + isempty4)
const size4 = colours.size()
console.log("The size of the stack is: " + size4)
console.log("\n")

let animals = new KaiStack()
console.log("animals: " + animals.show())
const isempty5 = animals.isEmpty()
console.log("Is the stack empty? " + isempty5)
const size5 = animals.size()
console.log("The size of the stack is: " + size5)
const top_animal = animals.pop()
console.log("popped animal: " + top_animal)
console.log("animals: " + animals.show())
const isempty6 = animals.isEmpty()
console.log("Is the stack empty? " + isempty6)
const size6 = animals.size()
console.log("The size of the stack is: " + size6)

console.log("\nDone.")

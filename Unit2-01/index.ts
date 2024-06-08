/*
 * This is a program that calculates the area of a circle.
 *
 * @author Kaitlyn Ip
 * @version 1.0
 * @since   2024-01-01
 */

import { KaiStack } from './kai-stack.ts'

let fruits = new KaiStack()
fruits.push("apple")
fruits.push("banana")
fruits.push("watermelon")
console.log("fruits: " + fruits.show())


let colours = new KaiStack()
colours.push("red")
colours.push("green")
colours.push("blue")
console.log("colours: " + colours.show())

let animals = new KaiStack()
animals.push("dog")
animals.push("otter")
animals.push("duck")
console.log("animals: " + animals.show())

console.log("\nDone.")

/*
 * This is a program pops stack.
 *
 * @author  Kaitly Ip
 * @version 1.0
 * @since   2024-01-01
 */

import { KaiStack } from './kai-stack.ts'

let fruits = new KaiStack()
fruits.push("apple")
fruits.push("orange")
fruits.push("watermelon")
console.log("popped: " + fruits.pop())
console.log("popped: " + fruits.pop())
console.log("popped: " + fruits.pop())
console.log("fruits: " + fruits.show)

let colours = new KaiStack()
colours.push("red")
colours.push("blue")
colours.push("purple")
console.log("popped: " + colours.pop())
console.log("colours: " + colours.show)

let animals = new KaiStack()
animals.push("dog")
animals.push("otter")
animals.push("duck")
console.log("popped: " + animals.pop())
console.log("popped: " + animals.pop())
console.log("popped: " + animals.pop())
console.log("animals: " + animals.show)

console.log("\nDone.")

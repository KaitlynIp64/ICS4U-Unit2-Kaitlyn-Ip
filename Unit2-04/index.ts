/*
 * This is a program that pops stack.
 *
 * @author  Kaitlyn Ip
 * @version 1.0
 * @since   2024-01-01
 */

import { KaiStack } from './kai-stack.ts'

let fruits = new KaiStack()
fruits.push("apple")
fruits.push("orange")
fruits.push("watermelon")
console.log("cleared stack")
fruits.clear()
console.log("popped: " + fruits.pop())
console.log("fruits: " + fruits.show)
console.log("length: " + fruits.size)
console.log("is empty: " + fruits.isEmpty)
console.log()

let colours = new KaiStack()
colours.push("red")
colours.push("blue")
colours.push("purple")
console.log("length: " + colours.size)
console.log("popped: " + colours.pop())
console.log("colours: " + colours.show)
console.log("is empty: " + colours.isEmpty)
console.log()

let animals = new KaiStack()
animals.push("dog")
animals.push("otter")
animals.push("duck")
animals.push("cat")
animals.push("bunny")
console.log("popped: " + animals.pop())
console.log("popped: " + animals.pop())
console.log("popped: " + animals.pop())
console.log("peak last item: " + animals.peek)
console.log("animals: " + animals.show)
console.log("length: " + animals.size)

console.log("\nDone.")

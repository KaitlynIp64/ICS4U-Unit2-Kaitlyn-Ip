/**
 * The program gets the max run
 *
 * By:      Kaitlyn Ip
 * Version: 1.0
 * Since:   2024-04-02
 */

import { createPrompt } from 'bun-promptx'

// Finds the highest amount of the same character in a row in a string
function maxRun(string) {
  // Loop variables
  let selectedChar = 0
  let oldChar = string[selectedChar]
  let currentStreak = 0
  let streaks = [1]
  // Check for all of the streak of characters in a row
  for (let counter = 1; counter < string.length; counter++) {
    const currentChar = string[counter]

    if (oldChar == currentChar) {
      // Add one to the current streak
      streaks[currentStreak]++
    } else {
      // Add a new streak and start using it
      streaks.push(1)
      currentStreak++
    }
    // Move one character up
    selectedChar++
    oldChar = string[selectedChar]
  }
  let streak = 1
  // Check all of the streaks for the largest one
  for (let counter = 0; counter < streaks.length; counter++) {
    if (streak < streaks[counter]) {
      streak = streaks[counter]
    }
  }

  return streak
}

// String values
const stringChoice = createPrompt('Enter a string: ')
const string = stringChoice.value

// Get the max run and print it
const maxRuns = maxRun(string)
console.log(`The max run of ${string} is ${maxRuns}.`)

// Show the program as done
console.log('\nDone.')

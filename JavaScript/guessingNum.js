const read = require('readline-sync')

let guess = -1
let guessCount = 0

let diff = read.question("Enter number of zeros: ")

let num = Math.floor(Math.random() * Math.pow(10, diff))

console.log("Generated number from 0-" + Math.pow(10, diff))

while (guess != num)
{
	guess = read.question("Enter guess: ")

	guessCount++

	if (guess > num)
		console.log("Too high")
	else if (guess < num)
		console.log("Too low")
}

console.log("Congradulations!")
console.log("Guesses: " + guessCount)

import random

diff = input("Enter number of zeros: ")
diff = int(diff)

num = random.randint(0, 10**diff + 1)

print ("Generated number from 0-" + str(10**diff))

guess = -1
guessCount = 0

while guess != num:
    guess = input ("Enter guess: ")
    guess = int(guess)

    guessCount += 1
    
    if guess > num:
        print("Too high")
    elif guess < num:
        print("Too low")

print("Congradulations!")
print("Guesses:", guessCount)

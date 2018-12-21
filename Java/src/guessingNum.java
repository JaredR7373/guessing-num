import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class guessingNum
{
	public static void main(String[] args)
	{
		int diff, num, guess = -1, guessCount = 0;
		
		Random rand = new Random();
		Scanner key = new Scanner(System.in);
				
		System.out.print("Enter number of zeros: ");
		diff = key.nextInt();

		num = rand.nextInt((int) Math.pow(10, diff) + 1);

		System.out.println("Number generated from 0-" + (int) Math.pow(10, diff));
		
		while(guess != num)
		{
			System.out.print("Enter guess: ");
			guess = key.nextInt();
			
			guessCount++;

			if (guess > num)
				System.out.println("Too high");
			else if (guess < num)
				System.out.println("Too low");
		}

		System.out.println("Congradulations!");
		System.out.println("Guesses: " + guessCount);
	}
}
		

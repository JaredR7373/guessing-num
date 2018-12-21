import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class guessingNum
{
	public static void main(String[] args)
	{
		int diff, num;
		
		Random rand = new Random();
		Scanner key = new Scanner(System.in);
				
		System.out.print("Enter number of zeros: ");
		diff = key.nextInt();

		num = rand.nextInt((int) Math.pow(10, diff) + 1);

		System.out.println("Number generated from 0-" + (int) Math.pow(10, diff));
		System.out.println("Num: " + num);
	}
}
		

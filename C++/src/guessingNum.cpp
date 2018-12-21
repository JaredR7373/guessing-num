#include <iostream>
#include <cstdlib>
#include <cmath>
using namespace std;

int main()
{
	int diff, num, guess = -1, guessCount = 0;
	
	srand(time(0));

	cout << "Enter number of zeros: ";
	cin >> diff;

	num = rand()%(int) pow(10, diff) + 1;

	cout << "Generated number from 0-" << pow(10, diff) << endl;

	while (guess != num)
	{
		cout << "Enter guess: ";
		cin >> guess;

		guessCount++;

		if(guess > num)
			cout << "Too high\n";
		else if(guess < num)
			cout << "Too low\n";
	}

	cout << "Congradulations!!\n";
	cout << "Guesses: " << guessCount << endl;

	return 0;
}

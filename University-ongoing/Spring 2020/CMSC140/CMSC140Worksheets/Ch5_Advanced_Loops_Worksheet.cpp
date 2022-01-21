//This worksheet is for working with more advanced topics with loops, such as using characters in a for loop

#include <iostream>
using namespace std;

int main()
{

	/*
	---------------------------------------------
	PROBLEM #1

	What is the output of the following for loop?
	---------------------------------------------
	*/

	for (int i = 0, j = 10; i < 10; i++, j++)
	{
		cout << i << " - " << j << endl;
	}


	/*
	---------------------------------------------
	PROBLEM #2

	What is the output of the following for loop? 
	Why does this for loop work?
	---------------------------------------------
	*/

	for (char c = 'a'; c <= 'z'; c++)
	{
		cout << c << " ";
	}


	/*
	---------------------------------------------------------------------
	PROBLEM #3

	Complete the following for loop.
	The loop should display the numbers from 0 to 9 and from 0 to -9.
	The numbers should be displayed in a format similar to the following:

	0 : 0
	1 : -1
	2 : -2

	... and so on.
	---------------------------------------------------------------------
	*/

	for (int i = 0, j = 0; i < 10;
	{

	}


	/*
	-------------------------------------------------
	PROBLEM #4

	What is wrong with the following nested for loop?
	-------------------------------------------------
	*/

	for (int i = 0; j < 10; i++)
	{
		for (int j = 0; j < 10; j++)
		{
			cout << "i + j = " << i + j << endl;
		}
	}


	/*
	-------------------------------------------------------------------------
	PROBLEM #5

	Complete the following nested for loop.
	The loop should display the result of i times j.
	i should be incremented until it reaches 10, and j should be decremented.
	-------------------------------------------------------------------------
	*/

	for (int i = 0;
	{
		for(int j = 10; j > 0;
		{

		}
	}


	/*
	--------------------------------------------------------------------------------------------------------------
	PROBLEM #6

	Write a nested for loop that displays each hour and minute in the day.
	The outer loop should display the number of hours, and the inner loop should display the number of minutes.

	Display the hours and minutes in this format:

	0:0
	0:1
	0:2

	...where the number on the left of the colon is the number of hours, and the number on the right is the number
	of minutes.

	REMEMBER: there are 24 hours in a day, and 60 minutes in an hour.
	--------------------------------------------------------------------------------------------------------------
	*/

	
	return 0;
}
//This worksheet is for practicing and using do while loops

#include <iostream>
using namespace std;

int main()
{

	/*
	-----------------------------------------------------------------------------------------
	PROBLEM #1

	1. Does the do-while loop evaluate the conditional expression before or after it executes
	the block of code for the first time?

	2. What is the name for this kind of loop?
	-----------------------------------------------------------------------------------------
	*/


	/*
	-----------------------------------------------
	PROBLEM #2

	What is wrong with the following do-while loop?
	-----------------------------------------------
	*/

	int counter = 0;

	do
	{
		cout << counter << endl;
		counter++;

	} while (counter < 10)


	/*
	----------------------------------------------------------
	PROBLEM #3

	Complete the following do-while loop.
	The loop should display the message "Hello." twelve times.

	Then, rewrite the loop using a while loop.
	----------------------------------------------------------
	*/

	int counter2 = 0;

	do
	{
		cout << "Hello." << endl;

	}

	/*
	-----------------------------------------------
	PROBLEM #4

	How many times will this do-while loop execute?
	-----------------------------------------------
	*/

	int counter3 = 14;
	do
	{
		cout << counter3 << endl;
	} while (counter3 < 10);


	/*
	-----------------------------------------------------------------------------------------------
	PROBLEM #5

	Write a do while loop to display the message "The loop has executed: <num> times.", where <num>
	is the number of times the loop has executed. The loop should only execute 15 times.
	-----------------------------------------------------------------------------------------------
	*/

	int num = 1;


	/*
	------------------------------------------------------------------------------------
	PROBLEM #6

	Write a do while loop that asks the user to enter numbers and then asks if they want
	to continue to enter numbers. Have the user enter Y for yes or N for no.
	If the user enters Y, the loop should run again. If not, exit the loop.
	------------------------------------------------------------------------------------
	*/

	int num2;
	char answer;


	/*
	--------------------------------------------------------------------------------------------------
	PROBLEM #7

	Write a loop similar to the loop in PROBLEM #6. This time, add up all the numbers the user enters.
	After the user says N to entering more numbers, display the sum.
	--------------------------------------------------------------------------------------------------
	*/

	int num3, sum;
	char answer2;

	return 0;
}
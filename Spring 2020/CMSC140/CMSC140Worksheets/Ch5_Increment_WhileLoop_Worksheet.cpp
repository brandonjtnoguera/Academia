//This program is used to practice programming with increment/decrement operators and while loops

#include <iostream>
using namespace std;

int main()
{
	/*
	-----------------------------------
	PROBLEM #1

	Write code that does the following:
	1. Increment int1 in postfix 
	2. Decrement int2 in prefix
	-----------------------------------
	*/

	int int1 = 9, int2 = 13;


	/*
	---------------------------------------------------------------
	PROBLEM #2

	Whate are the values of a, b, and num after this code executes?
	---------------------------------------------------------------
	*/

	int a = 7, b = 10, num;

	num = (a++ * --b);

	/*
	----------------------------------------------
	PROBLEM #3

	What will be the output of the following code?
	----------------------------------------------
	*/

	int z = 9;

	if (++z < 10)
	{
		cout << "The weather is wonderful today." << endl;
	}
	else
	{
		cout << "It feels rather hot." << endl;
	}

	/*
	--------------------------------------
	PROBLEM #4

	What is wrong with the following code?
	--------------------------------------
	*/

	int j = 2, k = 23, l;

	l = ++(j + k);


	/*
	-----------------------------------------------------------
	PROBLEM #5
	
	What is the value of firstNum after the loop is terminated?
	-----------------------------------------------------------
	*/

	int counter = 0, firstNum = 5;

	while (counter < 10)
	{
		counter++;
		firstNum++;
	}


	/*
	--------------------------------------
	PROBLEM #6

	What is wrong with the following loop?
	--------------------------------------
	*/

	int counter2 = 0;

	while (counter2 < 10)
	{
		cout << "The counter is now: " << counter2 << endl;
	}


	/*
	-----------------------------------------
	PROBLEM #7

	What is the output of the following code?
	-----------------------------------------
	*/

	int counter3 = 25;

	while (counter3 < 20)
	{
		cout << "The counter is now: " << counter3 << endl;
	}

	cout << "Goodbye.";


	/*
	-------------------------------------------------------------------------------------------------
	PROBLEM #8

	Write a while loop to display the message "hello world" 7 times.
	-------------------------------------------------------------------------------------------------
	*/

	int firstValue = 0;


	/*
	-----------------------------------------------
	PROBLEM #9

	How many times will the following loop execute?
	-----------------------------------------------
	*/

	int counter4 = 0, counter5 = 5;

	while (counter5 < 3 || counter4 < 9)
	{
		counter5++;
		counter4++;
	}


	/*
	--------------------------------------------------------------
	PROBLEM #10

	Write a while loop that displays the odd numbers from 0 to 10.
	--------------------------------------------------------------
	*/

	int counter6;



	return 0;
}
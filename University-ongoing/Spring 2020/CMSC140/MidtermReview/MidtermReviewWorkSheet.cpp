// This worksheet is a review to help study for the midterm exam

#include <iostream>
#include <string>
using namespace std;

int main()
{
	/*
	--------------------------------------------------------------------------------------
	PROBLEM #1

	1. What kind of error occurs when something wrong in the "grammar" of the program
	keeps it from compiling?

	2. What kind of error occurs when the program runs, but it gives you the wrong result?

	3. What kind of error occurs when the program runs until a certain line of code
	and then crashes?
	--------------------------------------------------------------------------------------
	*/



	/*
	----------------------------------------------------------------------------------------
	PROBLEM #2

	Define a constant variable of double type named PI that has an initial value of 3.14159.
	----------------------------------------------------------------------------------------
	*/



	/*
	-------------------------------------------------------------------
	PROBLEM #3

	Code the following statements using combined assignment operators:

	1. price1 is equal to price1 plus 5.
	2. price2 is equal to price2 times 7.0
	3. price3 is equal to price3 divided by 4.5
	4. totalPrice is equal to totalPrice modulus 3
	-------------------------------------------------------------------
	*/

	double price1 = 3.45, price2 = 5.79, price3 = 15.64;
	int totalPrice = 98;


	/*
	------------------------------------------------
	PROBLEM #4

	What does the following code output to the user?
	------------------------------------------------
	*/

	int A = 10, B = 17, C = 2;
	double D = 17.01;
	bool boolValue = true;

	if (A > B)
	{
		cout << "Good afternoon, sir." << endl;

		if (A == C)
		{
			cout << "Fine weather today we're having." << endl;
		}
	}

	else if (D < B)
	{
		cout << "It looks like it will rain later on." << endl;
	}

	else
	{
		cout << "Good morning." << endl;

		if (boolValue == true)
		{
			cout << "The sun's bright at this time." << endl;
		}

		else
		{
			cout << "We've got a lot of cloud cover now." << endl;
		}
	}


	/*
	-----------------------------------------------
	PROBLEM #5

	What does the following code ouput to the user?
	-----------------------------------------------
	*/

	int num1 = 10, num2 = 13, num3 = 10, square, quotient;
	bool firstBool = true;
	bool secondBool = false;

	if (firstBool && num2 < num3)
	{
		cout << "Good day!" << endl;

		if (firstBool && !(secondBool))
		{
			cout << "Fine weather this morning." << endl;
		}
		else
		{
			cout << "The weather's a bit muggy, isn't it?" << endl;
		}
	}

	else if (!firstBool || !secondBool)
	{
		cout << "Hello!" << endl;

		if (firstBool && (secondBool == false))
		{
			cout << "Top of the morning to you!" << endl;
		}

		if (num1 == num3)
		{
			cout << "The sun is shining bright today." << endl;
		}

		else
		{
			cout << "It's a bit chilly out, don't you think?" << endl;
		}
	}

	else
	{
		cout << "A good morning to you!" << endl;

		if (!secondBool || num1 == num3)
		{
			cout << "I think the sun will come out a little later." << endl;
		}
		else
		{
			cout << "I bet it'll rain the rest of the day." << endl;
		}
	}


	/*
	-------------------------------------------------------------
	PROBLEM #6

	Use relational operators to write the following expressions:

	1. firstNum is less than secondNum
	2. char1 is greater than or equal to char2
	3. char1 is not equal to char2
	4. name1 is equal to name2
	5. name1 is equal to name3
	-------------------------------------------------------------
	*/

	int firstNum = 3, secondNum = 6;
	char char1 = 'C', char2 = 'c';
	string name1 = "Jane", name2 = "Joan", name3 = "Jan";


	/*
	-------------------------------------------------------------------
	PROBLEM #7

	Write a statement using a conditional operator to do the following:
	if x is less than y, set z equal to 20. Otherwise, set z equal to 0.
	-------------------------------------------------------------------
	*/

	int x = 2, y = 10, z;


	/*
	----------------------------------
	PROBLEM #8

	What will be stored in finalResult?
	----------------------------------
	*/

	int finalResult, a = 3, b = 7;

	finalResult = b < a ? 10 : 17;


	/*
	-----------------------------------------------------------------------
	PROBLEM #9

	What is the problem with the following statements? What is this called?
	-----------------------------------------------------------------------
	*/

	int int1 = 5, result;
	double float1 = 3.9;

	result = float1 * int1;


	/*
	-------------------------------------------------------------------
	PROBLEM #10

	Convert the following if / else statement into a switch statement.
	-------------------------------------------------------------------
	*/

	char letter = 'A';

	if (letter == 'B')
	{
		cout << "The letter is B." << endl;
	}
	else
	{
		cout << "The letter is not B." << endl;
	}


	/*

	PROBLEM #11

	What will be stored in the variable secondValue at the end of the switch statement?
	*/

	int firstValue = 10, secondValue;

	switch (firstValue)
	{
		case 1:
			secondValue = 100;
		case 10:
			secondValue = 91;
		case 30:
			secondValue = 59;
		case 50:
			secondValue = 80;
			break;
		case 70:
			secondValue = 9;
		case 100:
			secondValue = 1;
		default:
			secondValue = 0;
	}

	return 0;
}
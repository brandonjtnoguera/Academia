//This program is used as a review for the final exam.

//--------------------------------------------------------------------------------------------------------
//NOTE: this does not mean that the questions on here will be in the exam, nor does it mean that questions
//      absent will not be on the exam. 
//--------------------------------------------------------------------------------------------------------

#include <iostream>
#include <string>
#include <fstream>
using namespace std;

void refVarFunc(int &, int);

int main()
{
	/*
	---------------------------------------------------------------------------------------
	PROBLEM #1

	1. What does it mean to increment something? What operator is used in C++ to do this?
	2. What does it mean to decrement something? What operator is used in C++ to do this?

	3. What is the difference in using a increment/decrement operator in postfix or prefix?
	---------------------------------------------------------------------------------------
	*/

	//1. To increment something is to increase its value by 1. The operator in C++ is the ++ (plus-plus) operator.
	//2. To decrement something is to decrease its value by 1. The operator in C++ is the -- (minus-minus) operator.

	//3. In prefix mode, the value is incremented before used in any expression in the same statement.
	//   In postfix mode, the value is incremented after used in any expression in the same statement.


	/*
	---------------------------------------------------------------------------------------------------------------
	PROBLEM #2

	1. What does it mean to find the modulus of something? What operator is used in C++ to do this?
	2. What operator is used in C++ to represent division?

	3. What will be the data type of the result of division between two integers?
	4. What will be the result of the expression 7 / 2 ? What will be different compared to the expression 7.0 / 2?
	---------------------------------------------------------------------------------------------------------------
	*/

	//1. To find the modulus is to find the remainder after the division of two numbers. The operator % is used in C++
	//2. The / operator is used to represent division in C++.

	//3. The data type will be an integer
	//4. 3 - it will be different from the second expression, which is 3.5, since because it is integer division any
	//   numbers after the decimal are ignored.


	/*
	-------------------------------------------------------------------------------
	PROBLEM #3

	What will the variables 'someNum', 'anotherNum', 'lastNum', and 'aBool' contain
	after the execution of the following code?
	-------------------------------------------------------------------------------
	*/

	int someNum = 2, anotherNum = 3, lastNum = 1;
	bool aBool;

	aBool = !(++someNum > (--anotherNum * lastNum++));

	//someNum: 3
	//anotherNum: 2
	//lastNum: 2

	//aBool: false

	/*
	------------------------------------------------------------------------------------------------
	PROBLEM #4

	1. Name the three different types of loops.
	2. For each type of loop, state if the loop is pretest or posttest, and explain what that means.
	------------------------------------------------------------------------------------------------
	*/

	//1. while loop, do-while loop, for loop.

	//2. while loop   : pretest, which means it will evaluate its expression before the loop executes once.
	//   do-while loop: posttest, which means it will evaluate its expression after the loop executes once
	//   for loop     : pretest, which means it will evaluate its expression before the loop executes once.

	/*
	----------------------------------------------------------------------------------
	PROBLEM #5

	What are the three parts of a for loop definition called? What do each of them do?
	----------------------------------------------------------------------------------
	*/

	//The three parts of a for loop definition are initialization, test, and update.

	//initialization - the counter variable is initialized to a value. It executes once, the first time the loop executes
	//test - the expression that evaluates to true or false, which controls the execution of the loop
	//update - the expression that updates the counter variable. It executes at the end of each loop.


	/*
	-------------------------------------------------------------------------------
	PROBLEM #6

	What will be displayed on the screen after the execution of the following code?
	-------------------------------------------------------------------------------
	*/

	int counter = 0;
	bool moreThan20 = false;

	while (!moreThan20)
	{
		if (counter != 6)
		{
			cout << counter << endl;
		}

		if (counter == 14)
		{
			cout << "...Getting close..." << endl;
		}
		else if (counter == 18)
		{
			cout << "...Almost there..." << endl;
		}

		if (counter > 20)
		{
			cout << "...It's over twenty..." << endl;
			moreThan20 = true;
		}

		counter += 2;
	}

	//The code will display the following:
	//0
	//2
	//4
	//8
	//10
	//12
	//14
	//...Getting close...
	//16
	//18
	//...Almost there...
	//20
	//22
	//...It's over twenty...


	/*
	--------------------------------------------------------------------------
	PROBLEM #7

	What do the following statements evaluate to, given the defined variables?
	--------------------------------------------------------------------------
	*/

	string name1 = "John", name2 = "Jane", name3 = "Devin", name4 = "John ";

	name1 < name2; //false

	name2 > "Janet"; //false

	name3 != "devin"; //true

	name3 < "DEVIN"; //false

	name1 == name4; //false


	/*
	-----------------------------------------------------------------------------------------------------
	PROBLEM #8

	Create the code below to open a file named 'testing123.txt' for writing.
	Save the values 1, 2, 20, and 37 into the file. Each value should be on its own line inside the file.

	Then close the file.
	-----------------------------------------------------------------------------------------------------
	*/

	ofstream outputFile;
	outputFile.open("testing123.txt");

	outputFile << 1 << endl;
	outputFile << 2 << endl;
	outputFile << 20 << endl;
	outputFile << 37 << endl;

	outputFile.close();


	/*
	-------------------------------------------------------------------------------------------------------------
	PROBLEM #9

	1. What is a reference variable? When used as function parameters, how do they differ from normal parameters?

	2. What must you use in the variable name when you create a reference variable?
	-------------------------------------------------------------------------------------------------------------
	*/

	//1. A reference variable is a variable that, used as a function parameter, can be changed within the function.
	//   This is unlike normal variables, which any changes in a function to the variable will not remain outside
	//   the function.

	//2. You must use an ampersand (&) when creating a reference variable, both before the name in the function
	//   header and after the data type declaration in the function prototype.


	/*
	---------------------------------------------------------------------------------------------------------
	PROBLEM #10

	Given the function definition below, what will the value of 'x' and 'y' be after the code executes below?

	void refVarFunc(int &num1, int num2)
	{
		for (int i = 0; i < 5; i++)
		{
			num1++;
			num2 += 2;
		}
	}

	---------------------------------------------------------------------------------------------------------
	*/

	int x = 10, y = 2;

	refVarFunc(x, y);

	//x will be 15 after this code is executed, and y will be 2.

	return 0;
}

/*----------------------------------------
Here are the functions for this worksheet
----------------------------------------*/

void refVarFunc(int &num1, int num2)
{
	for (int i = 0; i < 5; i++)
	{
		num1++;
		num2 += 2;
	}
}
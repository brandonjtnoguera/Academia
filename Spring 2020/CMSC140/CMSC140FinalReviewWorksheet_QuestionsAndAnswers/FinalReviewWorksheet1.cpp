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
     
     incrementing something means to increase its value by one, the operator to use in c++ is the "++" operator, called the increment operator
     
	2. What does it mean to decrement something? What operator is used in C++ to do this?
     
     To decrement something menas to decrease its value by one, the operator to do this is called the decrement operator and it is written as following "--"

	3. What is the difference in using a increment/decrement operator in postfix or prefix?
     
     Using either of these operator postfix menas that the value will be changed AFTER it has been used, thus when the variable being incremented or decremented is used, it will have the same value it had before being incremented or decremented.
     Using etiher of these operators prefix menas that the variable's value will change BEFORE the value is used. Thus, when the variable is used it will hold the new incremented or decremented value that has just been assigned to it.
	---------------------------------------------------------------------------------------
	*/
   

	/*
	---------------------------------------------------------------------------------------------------------------
	PROBLEM #2

	1. What does it mean to find the modulus of something? What operator is used in C++ to do this?
     
     To find the modulus of something meansd to find the remainder of the division of two numbers. The operator used for this is the "%" operator, pronmounced as modulus operator.
     
	2. What operator is used in C++ to represent division?
     
     The division operator is a forward slash "/".

	3. What will be the data type of the result of division between two integers?
     
     Dividing two integers will yield an answer of data type integer.
     
	4. What will be the result of the expression 7 / 2 ? What will be different compared to the expression 7.0 / 2?
     
     7 / 2 = 3.
     7.0 / 2 = 3.5.
	---------------------------------------------------------------------------------------------------------------
	*/


	/*
	-------------------------------------------------------------------------------
	PROBLEM #3

	What will the variables 'someNum', 'anotherNum', 'lastNum', and 'aBool' contain 
	after the execution of the following code?
     
     someNum = 3;
     anotherNum = 2;
     lastNum = 2;
     aBool = false;
	-------------------------------------------------------------------------------
	*/

	int someNum = 2, anotherNum = 3, lastNum = 1;
	bool aBool;

	aBool = !(++someNum > (--anotherNum * lastNum++));

	/*
	------------------------------------------------------------------------------------------------
	PROBLEM #4

	1. Name the three different types of loops.
     
     Do/while loop
     For loop
     While loop
     
	2. For each type of loop, state if the loop is pretest or posttest, and explain what that means.
     
     A pretest loop will check if the expression is true BEFORE the body of the loop is executed. A posttest loop will check if the expression is true AFTER the body of the loop is executed.
     Both the for and while loop are pretest loops. The do.while loop is a posttest loop.
     
	------------------------------------------------------------------------------------------------
	*/


	/*
	----------------------------------------------------------------------------------
	PROBLEM #5

	What are the three parts of a for loop definition called? What do each of them do?
     
     The three parts of a for loop are first the initialization of a variable that will help determine how many iterations the loop must go through, second the expression that will compare the previously initialized variable with another value to ensure that the loop will iterate the desired amount of times necessary, and third and increment or decrement expression that will increment the previously initialized variable every time the loop finishes one iteration.
     
	----------------------------------------------------------------------------------
	*/


	/*
	-------------------------------------------------------------------------------
	PROBLEM #6

	What will be displayed on the screen after the execution of the following code?
     
     0
     2
     4
     8
     10
     12
     14
     ...Getting close...
     16
     18
     ...Almost there...
     20
     22
     ...It's over twenty...
     
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


	/*
	--------------------------------------------------------------------------
	PROBLEM #7

	What do the following statements evaluate to, given the defined variables?
     
     false
     false
     true
     FALSE because capitalized letters are less than non-capitalized letters
     false
     
	--------------------------------------------------------------------------
	*/

	string name1 = "John", name2 = "Jane", name3 = "Devin", name4 = "John ";

	name1 < name2;

	name2 > "Janet";

	name3 != "devin";

	name3 < "DEVIN";

	name1 == name4;


	/*
	-----------------------------------------------------------------------------------------------------
	PROBLEM #8

	Create the code below to open a file named 'testing123.txt' for writing.
	Save the values 1, 2, 20, and 37 into the file. Each value should be on its own line inside the file.

	Then close the file.
     
     infile.open("testing123.txt");
     cout << "1\n2\n20\n37\n" << endl;
     file.close();
     
	-----------------------------------------------------------------------------------------------------
	*/


	/*
	-------------------------------------------------------------------------------------------------------------
	PROBLEM #9

	1. What is a reference variable? When used as function parameters, how do they differ from normal parameters?

     Reference variables are like pointers in that they are stored variables in the same memory address that allow the programmer to manipulate the variable and have its new values stored in the same memory address.
     
	2. What must you use in the variable name when you create a reference variable?
     
     You must use the reference operator which is just an ampersand in fron of the variable name "&".
     
	-------------------------------------------------------------------------------------------------------------
	*/


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

     
     x = 15;
     y = 2;
     
	---------------------------------------------------------------------------------------------------------
	*/

	int x = 10, y = 2;

	refVarFunc(x, y);

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

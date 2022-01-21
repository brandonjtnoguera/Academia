// This worksheet practices with more advanced function topics and problems, such as reference variables, overloaded
// functions, and stubs and drivers.

#include <iostream>
#include <string>
using namespace std;

//Function Prototypes:
void makeIt5(int &);
int doubleIt(int);

void circumference(double);

int main()
{
	/*
	--------------------------------------------------------------------------------------------------
	PROBLEM #1

	What is a reference variable? What symbol is used to denote them, and where do you use the symbol?
	--------------------------------------------------------------------------------------------------
	*/


	/*
	-------------------------------------------------------------------------------------
	PROBLEM #2

	When using a reference variable, do you pass data by value to the reference variable?

	Can you pass literals as a actual parameter to a reference variable?
	-------------------------------------------------------------------------------------
	*/


	/*
	-------------------------------------------------------------
	PROBLEM #3

	What is wrong with the following statement?

	(The function "makeIt5()" is defined below the main function)
	-------------------------------------------------------------
	*/

	//makeIt5(10);


	/*
	-------------------------------------
	PROBLEM #4

	What will the following code display?
	-------------------------------------
	*/

	int number = 1;

	cout << "The number is: " << number << endl;
	cout << "Calling makeIt5 and passing 'number' to it..." << endl;
	makeIt5(number);

	cout << "The number is now: " << number << endl;


	/*
	--------------------------------------------------
	PROBLEM #5

	What are overloaded functions? Why do we use them?
	--------------------------------------------------
	*/


	/*
	-------------------------------------------------------------------------------------------------------------
	PROBLEM #6

	1. What is a function signature?

	2. What must be different in two functions for them to be overloaded, instead of a redefinition of the first?
	-------------------------------------------------------------------------------------------------------------
	*/


	/*
	-------------------------------------------------------------------------------------------------------------------
	PROBLEM #7

	Create an overloaded function "doubleIt()". The function should take a double parameter and should return a double.

	The function should multiply the passed value by 2 (doubles the number) and return the result.

	Create the function below the main function, after the first "doubleIt()" function. Also create the function
	prototype.

	Then, call the "doubleIt()" function with the value of 5 and store the value returned in 'doubled1'.
	Call the function again with the value of 23.7 and store the value returned in 'doubled2'.

	Finally, display 'doubled1' and 'doubled2'
	-------------------------------------------------------------------------------------------------------------------
	*/

	int doubled1;
	double doubled2;


	/*
	-----------------------------------
	PROBLEM #8

	What does the 'exit()' function do?
	-----------------------------------
	*/


	/*
	------------------------------------------
	PROBLEM #9

	What are stubs? What are they used for?

	What are drivers? What are they used for?
	------------------------------------------
	*/


	/*
	------------------------------------------------------------------------------------------------
	PROBLEM #10

	Create a stub for the function prototype for the function 'circumference'. Remember to create a
	function comment for it.

	The stub should only display the message:

	"The function circumference has been called, and the value of <value> has been passed into it."

	(where <value> is whatever value is passed into the function)

	Finally, call the stub and pass '25.6' into it.
	------------------------------------------------------------------------------------------------
	*/

	return 0;
}

/*
------------------------------------------
Here are the functions for this worksheet:
------------------------------------------
*/


//**************************************************
// The function makeIt5 sets the parameter to 5.   *
// It uses a reference variable to make sure the   *
// parameter keeps the value outside the function. *
//**************************************************

void makeIt5(int &num)
{
	num = 5;
}


//***********************************************************************************
// The overloaded function doubleIt takes an integer and returns double the amount. *
// **********************************************************************************

int doubleIt(int num)
{
	return num * 2;
}


//**********************************************************************************
// The overloaded function doubleIt takes a double and returns double that amount. *
//**********************************************************************************

/*---------------------------------------------------
	WRITE THE OVERLOADED FUNCTION "doubleIt()" HERE
---------------------------------------------------*/
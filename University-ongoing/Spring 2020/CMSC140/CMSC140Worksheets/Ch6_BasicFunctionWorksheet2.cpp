//This worksheet is used to practice using basic function concepts and coding, such as passing by value and returning.

#include <iostream>
#include <string>
using namespace std;

void changeToFive(int);
int returnSix();

int triple(int);

int main()
{

	/*
	--------------------------------------------------------
	PROBLEM #1

	What does it mean to pass data by value into a function?
	--------------------------------------------------------
	*/


	/*
	-----------------------------------------------------------------------------
	PROBLEM #2

	What will will the variable num be after the execution of these statements?
	-----------------------------------------------------------------------------
	*/

	int num = 1;

	cout << "In the main function, the number is: " << num;
	changeToFive(num);

	/*
	---------------------------------------------------------------------------------
	PROBLEM #3

	Can a void function have a return statement? If so, what does it do? If not, why?
	---------------------------------------------------------------------------------
	*/


	/*
	------------------------------------------------------------------
	PROBLEM #4

	In a function that is not void, what does the return statement do?
	------------------------------------------------------------------
	*/

	/*
	-------------------------------------------
	PROBLEM #5

	What is wrong with the following function?:


	int returnHello()
	{
		return "Hello";
	}
	-------------------------------------------
	*/


	/*
	-----------------------------------------------------------------------------------
	PROBLEM #6

	Complete the function named "returnSix()". The function should return the number 6.

	Then, call the function and display what it returns.
	-----------------------------------------------------------------------------------
	*/


	/*
	----------------------------------------------------------------------------------
	PROBLEM #7

	Write a function for the function prototype "triple()". The function should return
	the cube of the parameter.

	Remember to write a function comment for "triple()".

	Then, call the function and pass the number 3 into it. Store the result in the
	variable "cube" and display "cube".
	----------------------------------------------------------------------------------
	*/

	int cube;


	/*
	--------------------------------------------------------------------------------------------
	PROBLEM #8

	Create a function named "timesPi()". The function should take an argument of type double and
	have return a value of type double.

	The function should then return the passed value times the number pi, where pi is 3.1415.

	Remember to write a function comment for "timesPi()".

	Then, call the function, pass the number 2.0 into it, and display the result.
	--------------------------------------------------------------------------------------------
	*/


	return 0;
}

/*
------------------------------------------------
Here are the functions defined for this program:
------------------------------------------------
*/

//****************************************************
// The changeToFive function changes the data within *
// the passed formal parameter to five.              *
//****************************************************

void changeToFive(int num)
{
	num = 5;
	cout << "The number is now: " << num << endl;
}

//*******************************************
// The returnSix function should return the * 
// number 6 from the function.				*
//*******************************************

int returnSix()
{
	
}
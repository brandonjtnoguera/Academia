// This worksheet is used for practice working with functions. Specifically, it practices using basic terminology,
// the parts of a function, calling a function and working with function prototypes.

#include <iostream>
#include <string>
using namespace std;

void sayHello();
void displayString(string);
void multiplier(int, int);

//******************************************
// The displayName function should display *
// the name of the programmer.			   *
//******************************************

void displayName()
{

}

int main()
{
	/*
	------------------------------------------------
	PROBLEM #1

	What is modular programming? What is a function?
	------------------------------------------------
	*/

	
	/*
	----------------------------------------
	PROBLEM #2

	For the following function, what is the:
	1. return type
	2. name
	3. parameter list
	4. body
	5. function header


	void sayHello()
	{
		cout << "Hello!" << endl;
	}
	
	----------------------------------------
	*/


	/*
	--------------------------------------------------------------------------
	PROBLEM #3

	Write a statment that calls the function named 'sayHello()'. What happens?

	--------------------------------------------------------------------------
	*/


	/*
	-------------------------------------------------------------------------------
	PROBLEM #4

	When creating a function, can you call it before you define it? Why or why not?
	-------------------------------------------------------------------------------
	*/

	/*
	--------------------------------------------------------------------
	PROBLEM #5

	Complete the function named 'displayName()' above the main function.
	The function should display your name.
	Then, call the function in the lines below this problem.
	---------------------------------------------------------------------
	*/


	/*
	-----------------------------------------------------------------------------------------
	PROBLEM #6
	
	Write a function in the lines above the main function. Name the function 'helloWorld()'.
	The function should display the message "Hello World!" and it should not return anything.

	Also, write a function comment for 'helloWorld()' to describe what the function does.

	Then, call the function in the lines below this problem.
	-----------------------------------------------------------------------------------------
	*/


	/*
	----------------------------------------------------------------------------
	PROBLEM #7

	What is a function prototype? Why is it used? Where should the prototype go?
	----------------------------------------------------------------------------
	*/


	/*
	------------------------------------------------------------------------------------
	PROBLEM #8

	Write a statement that calls the function 'sayGoodbye3()'.

	What is the problem? How can we fix the problem?

	Now, fix the problem and then call the function.
	-----------------------------------------------------------------------------------
	*/


	/*
	--------------------------------------------------------------------
	PROBLEM #9

	What are values called that are passed into a function?
	What are variables called that hold the passed values in a function?

	--------------------------------------------------------------------
	*/


	/*
	--------------------------------------------------------------------------------------------
	PROBLEM #10

	Write a statement that calls the function 'displayString()'. 
	Pass the string "Hello from the function displayString()" into the function when calling it.

	--------------------------------------------------------------------------------------------
	*/

	
	/*
	--------------------------------------------
	PROBLEM #11

	What is wrong with the following statements?
	--------------------------------------------
	*/

	/*
	displayString();

	displayString(57);
	*/

	/*
	--------------------------------------------
	PROBLEM #12

	Can a function have more than one parameter?
	--------------------------------------------
	*/


	/*
	----------------------------------------------------------------------------------------
	PROBLEM #13

	Complete the function named 'multiplier()'. 
	The function should display the multiplication of the two ints passed as values into it.

	Then, call the function in the lines below and pass the values 5 and 7 into it.
	----------------------------------------------------------------------------------------
	*/


	/*
	--------------------------------------------------------------------------------------------------------
	PROBLEM #14

	Write a function named 'divideAdd5()'. The function should have two int parameters and should not return
	anything. The function should divide the two passed integers and add 5 to the result. Then the function
	should display the result to the user.
	Make sure to create the function comment as well to detail what the function does.

	Then, create a function prototype for the function.

	Finally, call the function in the lines below this problem. Pass the values 10 and 5 into it.
	
	--------------------------------------------------------------------------------------------------------
	*/


	return 0;
}



/*
-------------------------------------------------
The functions already defined for this worksheet:
-------------------------------------------------
*/

//*********************************************
// The sayHello function displays the message *
// Hello! on the screen.                      *
//*********************************************

void sayHello()
{
	cout << "Hello!" << endl;
}


//-------------------------------------------------------------------------------------//
//-------------------------------------------------------------------------------------//

//************************************************
// The sayGoodbye3 function displays the message *
// Goodbye! on the screen three times.           *
//************************************************

void sayGoodbye3()
{
	cout << "Goodbye!" << endl;
	cout << "Goodbye!" << endl;
	cout << "Goodbye!" << endl;
}

//*************************************************
// The displayString function displays the passed *
// string str on the screen.					  *
//*************************************************

void displayString(string str)
{
	cout << str << endl;
}

//********************************************
//The multiplier function should display the *
//result of num1 times num2					 *
//********************************************

void multiplier(int num1, int num2)
{

}
//This worksheet practices working with more advanced topics with functions, such as returning a boolean, 
//global and local variables, static local variables and default arguments.

#include <iostream>
#include <string>
using namespace std;

//Function Prototypes
bool isEven(int);
double circumference(double);
void counter();


int main()
{
	/*
	------------------------------------------------------------------------------
	PROBLEM #1

	Can a function return a boolean data type? If so, what values can be returned?
	------------------------------------------------------------------------------
	*/


	/*
	----------------------------------------------------------------------------------------------------------------
	PROBLEM #2

	Complete the function 'isEven()' that takes one integer parameter. The function should return true if the passed
	parameter is even, and false if it is odd.

	Then, call the function to determine if the number in the variable 'number' is even or odd.
	----------------------------------------------------------------------------------------------------------------
	*/

	int number = 4;


	/*
	-----------------------------------------------------
	PROBLEM #3

	1. Can a local variable be used outside its scope?

	2. What is the scope of a global variable? 

	3. When is it permissable to use global variables?

	4. What does it mean to shadow a global variable?
	-----------------------------------------------------
	*/

	/*
	----------------------------------------------------------------------------
	PROBLEM #4

	Create a global constant named PI. Initialize it to the value of 3.1415.

	Then, complete the function "circumference()" that is passed a double
	data type. The function should return the circumference of a circle
	with a diameter of the passed data.

	Then, call the function in the space below and pass the number 10.0 to it.

	HINT: to find the circumference, use the equation  PI * diameter
	----------------------------------------------------------------------------
	*/


	/*
	------------------------------------------------------------------
	PROBLEM #5

	How many times is a static variable initialized? 
	Does the data a static variable get erased when the function ends?
	------------------------------------------------------------------
	*/


	/*
	--------------------------------------
	PROBLEM #6

	What will be displayed on the screen?
	--------------------------------------
	*/

	/*
	for (int i = 0; i < 10; i++)
	{
		counter();
	}
	*/

	/*
	--------------------------------------------------------------------------------------------------
	PROBLEM #7

	Complete the function "doubleCount()". The function should have a static variable named "counter"
	that is initialized to 1. Display counter, and then multiply counter by 2 and store the result in
	counter.

	Below, use the for loop to call "doubleCount()" ten times.
	--------------------------------------------------------------------------------------------------
	*/

	/*
	for (int i = 0; i < 10; i++)
	{

	}
	*/


	/*
	--------------------------------------------------------------------------------------
	PROBLEM #8

	1. What are default arguments?

	2. Where do you define the default arguments?

	3. If a function does not have a prototype, where do you define the default arguments?

	4. If a function has default arguments for each parameter, can you call it without
	   passing any values?
	--------------------------------------------------------------------------------------
	*/


	/*
	-----------------------------------------------------------------------------
	PROBLEM #9

	Create a function prototype for the function "showDashes()". Create default
	arguments for the formal parameters, with the value of 5 for each parameter.

	Then, call the function below without passing any values. Then call it
	passing the value 6, and finally call it passing the values 10 and 10.
	-----------------------------------------------------------------------------
	*/

	return 0;
}

/*
------------------------------------------
Here are the functions for this worksheet:
------------------------------------------
*/


//*************************************************************************************
// The function isEven should determine if the passed parameter 'num' is even or not. *
// If 'num' is even, then it returns true. Otherwise, it returns false.				  *
//*************************************************************************************

bool isEven(int num)
{

}


//*************************************************************************************
// The function circumference returns the circumference of a circle with the diameter *
// with the length of the passed parameter.											  *
// The equation to find the circumference is: PI * diameter.						  *
//*************************************************************************************

/*
double circumference(double diameter)
{

}
*/

//*******************************************************************************
// The function counter counts how many times it has been called.				*
// It uses a static variable to have the value persists through function calls. *
//*******************************************************************************

void counter()
{
	static int count = 1;

	cout << "The function has been called: " << count << " time(s)." << endl;
	count++;
}


//**************************************************************************
// The function doubleCount uses a static variable 'count' that is doubled *
// every function call.													   *
//**************************************************************************

void doubleCount()
{

}

//************************************************************************
// The function showDashes displays dash characters on the screen.       *
// It will display a rectangle of dashes that has a size that depends    *
// on the passed parameters. It also has default arguments for the size. *
//************************************************************************

void showDashes(int columns, int rows)
{
	for (int down = 0; down < rows; down++) //The number of rows that will be displayed
	{
		for (int across = 0; across < columns; across++) //The number of columns that will be displayed
		{
			cout << "-" << endl; //Display a dash character
		}

		cout << endl; //Start a new row.
	}
}
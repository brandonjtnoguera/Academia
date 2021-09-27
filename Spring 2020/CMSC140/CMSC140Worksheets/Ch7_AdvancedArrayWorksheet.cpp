// This worksheet practices using more advanced topics and concepts with arrays, such as range-based for loops,
// function arguments, and multi-dimensional arrays.

#include <iostream>
#include <string>
using namespace std;

//Function Prototypes

void turnAllTo5(int[], int);
void countUp(int[], int);

int main()
{
	/*
	--------------------------------------------------------------------------------------------------------------------
	PROBLEM #1

	What is a range-based for loop? What data type or structure (integers, characters, arrays, etc.) can you use it for?
	--------------------------------------------------------------------------------------------------------------------
	*/


	/*
	---------------------------------------------------------------------------------
	PROBLEM #2

	Given the defined array, what does the range-based for loop do in the code below?
	---------------------------------------------------------------------------------
	*/

	const int NUM_SIZE = 5;
	int nums[NUM_SIZE] = {23, 45, 67, 89, 10 };

	for (int value : nums)
	{
		cout << value << endl;
	}


	/*
	--------------------------------------
	PROBLEM #3

	What is wrong with the following code?
	--------------------------------------
	*/

	/*
	int index = 4;
	const int SIZE = 5;
	string names[SIZE] = { "John", "Samantha", "Julia", "David", "Jane" };
	string copyNames[SIZE];

	copyNames = names;
	*/

	
	/*
	---------------------------------------
	PROBLEM #4

	What is wrong with the following code?
	---------------------------------------
	*/

	int array1[] = { 5, 10, 15, 20, 25 };
	int array2[] = { 5, 10, 15, 20, 25 };

	if (array1 == array2)
	{
		cout << "The two arrays are the exact same." << endl;
	}
	else
	{
		cout << "The arrays are different." << endl;
	}


	/*
	------------------------------------------------------------------------------
	PROBLEM #5

	What are parallel arrays? Give an example of how a parallel array can be used.
	------------------------------------------------------------------------------
	*/


	/*
	----------------------------------------------------------------------------------------------
	PROBLEM #6

	Can you pass an array to a function?
	If an array can be passed to a function, is it passed by value? If not, then how is it passed?
	----------------------------------------------------------------------------------------------
	*/


	/*
	--------------------------------------------------------------------------------------------------------------
	PROBLEM #7

	What will be displayed to the user after the following code is executed? What will the values in 'numbers' be?
	--------------------------------------------------------------------------------------------------------------
	*/

	const int SIZE2 = 3;
	int numbers[SIZE2] = { 1, 2, 3 };

	turnAllTo5(numbers, SIZE2);

	for (int i = 0; i < SIZE2; i++)
	{
		cout << numbers[i] << endl;
	}


	/*
	---------------------------------------------------------------------------------------------------------------------
	PROBLEM #8

	Complete the function 'countUp'. The function should change the values in the passed array parameter 'numArray'
	to the index value. That is, the data at index 0 should be 0, the data at index 1 should be 1, and so forth.

	Then, call the method using the defined values below. Display the contents of the array after you call the function.
	---------------------------------------------------------------------------------------------------------------------
	*/

	const int SIZE3 = 10;
	int numbers2[SIZE3] = { 6, 9, 4, 1, 10, 97, 34, 62, 88, 57 };


	/*
	----------------------------------------------------------------
	PROBLEM #9

	Can you have an array that contains arrays? What is this called?
	----------------------------------------------------------------
	*/


	/*
	--------------------------------------------------------------------------------------------------
	PROBLEM #10

	1. How many indexes do you need to get at an individual piece of data in a two-dimensional array?
	2. What must be included in the parameter list when passing a two-dimensional array to a function?
	3. Can an array have more dimensions than two?
	--------------------------------------------------------------------------------------------------
	*/


	return 0;
}


/*-------------------------------------------------
Here are the functions created for this worksheet
-------------------------------------------------*/


void turnAllTo5(int numArray[], int size)
{
	for (int i = 0; i < size; i++)
	{
		numArray[i] = 5;
	}
}


//******************************************************************************
// The function 'countUp' changes the values of the passed array, 'numArray'   *
// The function stores the index values - that is, the number used as an index *
// to get at the value in the array - in that location in the array.		   *
// Thusly, at index 0, the value 0 will be stored; at index 1, the value 1     *
// will be stored, etc.														   *
//******************************************************************************
void countUp(int numArray[], int size)
{

}
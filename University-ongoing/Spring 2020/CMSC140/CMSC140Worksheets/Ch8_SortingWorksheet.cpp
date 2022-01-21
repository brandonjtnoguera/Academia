//This worksheet is used to practice working with and using sorting algorithms

#include <iostream>
#include <string>
using namespace std;

void bubbleSort(int[], int);

int main()
{
	/*
	---------------------------------------------------------------------
	PROBLEM #1

	What are sorting algorithms? What are some reasons why they are used?	
	---------------------------------------------------------------------
	*/


	/*
	--------------------------------------------------
	PROBLEM #2

	What is a bubble sort algorithm? How does it work?
	--------------------------------------------------
	*/

	
	/*
	-------------------------------------------------------------------------------------
	PROBLEM #3

	What are the advantages of using a bubble sort algorithm? What are the disadvantages?
	-------------------------------------------------------------------------------------
	*/


	/*
	-----------------------------------------------------
	PROBLEM #4

	What is a selection sort algorithm? How does it work?
	-----------------------------------------------------
	*/


	/*
	-----------------------------------------------------------------------------------------
	PROBLEM #5

	What are the advantages of using a selection sort algorithm? What are the disadvantages?
	-----------------------------------------------------------------------------------------
	*/


	/*
	-------------------------------------------------------------------------------------------------------------------
	PROBLEM #6
	
	Complete the function named 'bubbleSort'. The function header and prototype are given.

	The function should implement the bubble sort algorithm, and should sort arrays of the type int in ascending order.
	
	Then, call the function using the array 'numbers'.

	First, display the elements in 'numbers' on the screen in one line.
	Call the 'bubbleSort' function and pass 'numbers' and 'SIZE' into it.
	Finally, display the elements in numbers on the screen in one line again.
	-------------------------------------------------------------------------------------------------------------------
	*/

	const int SIZE = 8;
	int numbers[SIZE] = { 12, 3, 67, 100, 1, 21, 39, 2 };

	return 0;
}

/*---------------------------------------------
Here are the functions used in this worksheet.
---------------------------------------------*/


//***********************************************************************************************
// The function bubbleSort implements the bubble sort algorithm to sort arrays of the type int. *
// The pseudocode for the bubble sort algorithm is:												*
//																								*
// Do																							*
//     Set swap flag to false.																	*
//     For count is set to each subscript in array from 0 through the next-to-last subscript.	*
//         If array[count] is greater than array[count + 1]										*
//             Swap the contents of array[count] and array[count + 1]							*
//             Set swap flag to true															*
//         End If																				*
//     End For																					*
// While any elements have been swapped															*
//																								*
//***********************************************************************************************

void bubbleSort(int numArray[], int size)
{
	bool swap;	//Used to determine if the current value should be swapped or not
	int temp;	//Used as a temporary storage place for values being swapped.
}
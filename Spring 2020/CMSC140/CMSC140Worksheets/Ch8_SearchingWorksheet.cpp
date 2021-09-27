//This worksheet is used to practice working with and using search algorithms

#include <iostream>
#include <string>
using namespace std;

int linearSearch(int[], int, int);

int main()
{
	/*
	------------------------------------------------------
	PROBLEM #1

	What is a linear search? What does a linear search do?
	------------------------------------------------------
	*/


	/*
	---------------------------------------------------------------------------------------
	PROBLEM #2

	What are the advantages to using a linear search algorithm? What are the disadvantages?
	---------------------------------------------------------------------------------------
	*/


	/*
	-----------------------------------------
	PROBLEM #3

	What is a binary search? What does it do?
	-----------------------------------------
	*/


	/*
	----------------------------------------------------------------------------
	PROBLEM #4

	When using the binary search algorithm, what must you do first to the array?
	----------------------------------------------------------------------------
	*/


	/*
	---------------------------------------------------------------------------------------
	PROBLEM #5

	What are the advantages of using a binary search algorithm? What are the disadvantages?
	---------------------------------------------------------------------------------------
	*/


	/*
	-------------------------------------------------------------------------------------------------------------
	PROBLEM #6

	Complete the function called 'linearSearch' The function prototype and header are given.

	The function should search the passed integer array using a linear search for the passed value
	'value'. If 'value' is in the array, the function should return the index of 'value' in the array.

	Otherwise, the function should return -1.
	
	Then, call the function below, using the defined array 'numbers' and its size 'SIZE'.
	First call the 'linearSearch' function with the value of 13, and display what is returned from the function.

	Finally, using an if/else statement, determine if the value 5 is in 'numbers'. 
	If so, display the message "The value 5 is in the array."
	Otherwise, display the message "The value 5 is not in the array."
	-------------------------------------------------------------------------------------------------------------
	*/

	const int SIZE = 5;
	int numbers[SIZE] = { 27, 4, 13, 9, 1 };


	return 0;
}

/*---------------------------------------------
 Here are the functions used in this worksheet.
---------------------------------------------*/


//*********************************************************************************
// The function linearSearch is used to determine if a value ('value') is within  *
// an array ('numArray') using the linear search algorithm. If the value is found *
// in the array, the index of the location of the value is returned. Otherwise,	  *
// -1 is returned.																  *
//																				  *
// The pseudocode for the linear search algorithm is:							  *
//																				  *
// while found is false and index < number of elements							  *
//     If array[index] is equal to search value									  *
//         found = true															  *
//         position - index														  *
//     End if																	  *
//     Add 1 to index															  *
// End while																	  *
// Return position																  *
//																				  *
//*********************************************************************************

int linearSearch(int numArray[], int size, int value)
{
	bool foundValue = false; //Used as a flag to determine if the value was found in the array or not.
	int position;			 //Used to hold the position of the value in the array once it has been found, or -1 if not.

}
//This program is used as a review for the final exam.

//--------------------------------------------------------------------------------------------------------
//NOTE: this does not mean that the questions on here will be in the exam, nor does it mean that questions
//      absent will not be on the exam. 
//--------------------------------------------------------------------------------------------------------

#include <iostream>
#include <string>
using namespace std;

void doSomething(int, double&);
double overtimePay(string, int, double);
void arrayFunc(int[], int);

int main()
{
	/*
	------------------------------------------------------------------------------
	PROBLEM #1

	What are global and local variables? What are the differences between the two?
	------------------------------------------------------------------------------
	*/

	//Global variables are variables defined outside of any function, and can be accessed and changed in any function

	//Local variables are defined within a function, and can only be changed and accessed within that function
	//    (unless passed as a parameter)

	//Global variables can be accessed across the whole program after it is created, and a local variable is only
	//accessible within the function that created it after it is created

	/*
	-----------------------------------------------------------------------------------------------
	PROBLEM #2

	Write the function header for a function called overtimePay, that returns a double and has a
	parameter list that takes a string called name, an int named hours, and a double named payrate.

	Then, write the function prototype for this function in the space above the main function.
	-----------------------------------------------------------------------------------------------
	*/

	//Function header:
	//double overtimePay(string name, int hours, double payrate)


	/*
	-----------------------------------------------------------------------
	PROBLEM #3

	What is a function signature? What does it mean to overload a function?
	-----------------------------------------------------------------------
	*/

	//A function signature is the name of the function and the data types of the function's parameters in proper order.
	
	//A function is overloaded when another function is created with the same name as the first function but with
	//  a different parameter list (thusly, a different function signature).


	/*
	----------------------------------------------------------------------------------------------------
	PROBLEM #4

	Given the function definition below (also found after the main function), call the function and pass
	the variables 'firstVal' and 'secondVal' into the function, respectively.

	What will be displayed on the screen after the execution of the code? What will the variables
	'firstVal' and 'secondVal' contain?


	void doSomething(int a, double &b)
	{
		for (int i = 0; i < a; i++)
		{
			cout << ".";
			b += 0.01;
		}

		cout << endl;

		a += 5;

		cout << "A variable a is: " << a << endl;
	}
	----------------------------------------------------------------------------------------------------
	*/

	int firstVal = 4;
	double secondVal = 3.14;

	doSomething(firstVal, secondVal);

	//The code will display:

	//....
	//A variable a is: 9

	//The value of firstVal after the code will be 4
	//The value of secondVal after the code will be 3.18


	/*
	-----------------------------------------------------------------------------
	PROBLEM #5

	Create an array named 'aBunchOfStuff' of type string and with the size of 45.

	Use a constant integer, named SIZE, to define the size.
	-----------------------------------------------------------------------------
	*/

	const int SIZE = 45;
	string aBunchOfStuff[SIZE];


	/*
	-----------------------------------------------------------------------------------------------------
	PROBLEM #6

	Create an array named 'letters' of type char and initialize it with the values of 'a', 'b', 'c', 'd',
	and 'z' in one line.
	-----------------------------------------------------------------------------------------------------
	*/

	char letters[] = { 'a', 'b', 'c', 'd', 'z' };


	/*
	--------------------------------------------------------------------------
	PROBLEM #7

	What is a range-based for loop? How does it differ from a normal for loop?
	--------------------------------------------------------------------------
	*/

	//A range-based for loop is a special for loop that is used on "lists" - in our case, arrays.
	//It differs because there is no update or test statement: only the initialization of a variable which will
	//hold the current element in the array, and the array itself.

	//The loop will go through each element in the array in order, and assign the value of the element to the 
	//initialized variable in the for loop.


	/*
	----------------------------------------------------------------------------------------------------------------
	PROBLEM #8

	Write a range-based for loop that will display every element in an array. Use the array 'numbers' defined below.
	----------------------------------------------------------------------------------------------------------------
	*/

	int numbers[] = { 1, 5, 8, 34, 6, 73, 2 };

	for (int element : numbers)
	{
		cout << element << endl;
	}


	/*
	--------------------------------------------------------------------------------------------------------------
	PROBLEM #9

	Complete the function 'arrayFunc' defined below the main function. The function should first display
	every element in the passed array, and then add 5 each element. Don't forget to create the prototype.

	Then, call the function using the defined array 'numbers2'. What will the values of the elements of 'numbers2'
	be after you call the function 'arrayFunc'?
	--------------------------------------------------------------------------------------------------------------
	*/

	int numbers2[] = { 4, 5, 6, 7, 8 };

	arrayFunc(numbers2, 5);

	//The elements will each be 5 more than their original values.
	//That is, the elements will be 9, 10, 11, 12, 13, respectively.


	/*
	------------------------------------------------------------------------------------
	PROBLEM #10

	What are two algorithms used to search through arrays for a value? How do they work?
	------------------------------------------------------------------------------------
	*/

	//The linear search algorithm, and the binary search algorithm

	//The linear search goes from the beginning of the array to the end and checks each element in order
	//to see if it matches the one being looked for. Once it is found, it is returned and the search ends.

	//The binary search starts in the middle of the array (which must be sorted) and checks if the value
	//is either the element it is on (the middle element), or if not which half the value resides in.
	//If the element is not the middle, it finds the half which the value will be in and goes to the middle of that,
	//and repeats until the element is found. Once the element is found, it is returned and the search ends.


	/*
	--------------------------------------------------------------------
	PROBLEM #11

	What are the two algorithms used to sort an array? How do they work?
	--------------------------------------------------------------------
	*/

	//The bubble sort algorithm and the selection sort algorithm.

	//Bubble Sort:
	//The bubble sort algorithm works by, starting with the first element, checks to see if it should go in a
	//place later in the array than the next element over (i.e. if the array is of ints, and is sorting in ascending
	//order, it checks if the first element is greater than the second element).

	//If so, the elements' positions are swapped. It then goes to the next element over and checks again if the two
	//should be swapped. It goes through the array completely and then goes back through until it does not 
	//swap any more elements.

	//Selection Sort:
	//The selection sort algorithm works by going through the array and finding the smallest (or largest, if in descending
	//order) value in the array. It swaps it with the first element (if it isn't there already) to put it at the beginning.
	//It then looks for the second smallest value and swaps it into the position after the smallest element.
	//It then looks for the third smallest value, swaps it after the second smallest, and so on.


	/*
	---------------------------------------------------------------------------------------------------------------
	PROBLEM #12

	Given the following array 'jumbled', what will the array be after the first swap of a selection sort algorithm?
	(Assume the algorithm sorts in ascending order).
	---------------------------------------------------------------------------------------------------------------
	*/

	int jumbled[] = { 12, 5, 3, 1, 9, 100, 45 };

	//The array's value will be: {1, 5, 3, 12, 9, 100, 45}


	/*
	---------------------------------------------------------------------------------------------------------------
	PROBLEM #13

	Given the following array 'jumbled2', what will the array be after the third swap of a bubble sort algorithm?
	(Assume the algorithm sorts in ascending order).
	---------------------------------------------------------------------------------------------------------------
	*/

	int jumbled2[] = { 5, 9, 50, 6, 1, 70, 0 };

	//The array's value will be: {9, 50, 6, 5, 1, 70, 0}

	return 0;
}


/*------------------------------------------------
Here are the function definitions for this program
------------------------------------------------*/

void doSomething(int a, double &b)
{
	for (int i = 0; i < a; i++)
	{
		cout << ".";
		b += 0.01;
	}

	cout << endl;

	a += 5;

	cout << "A variable a is: " << a << endl;
}


//******************************************************************************
// The function arrayFunc should display all the elements in the passed array. *
// Then, the function should add 5 to each element in the array.			   *
//******************************************************************************
void arrayFunc(int array1[], int size)
{
	for (int i = 0; i < size; i++)
	{
		cout << array1[i] << endl;
		array1[i] += 5;
	}
}
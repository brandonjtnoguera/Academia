//This program is used as a review for the final exam.

//--------------------------------------------------------------------------------------------------------
//NOTE: this does not mean that the questions on here will be in the exam, nor does it mean that questions
//      absent will not be on the exam. 
//--------------------------------------------------------------------------------------------------------

#include <iostream>
#include <string>
using namespace std;

void doSomething(int, double&);

int main()
{
	/*
	------------------------------------------------------------------------------
	PROBLEM #1

	What are global and local variables? What are the differences between the two?
	------------------------------------------------------------------------------
	*/

    // Global variables are variables that have been initialized outside of every function and can be used by any function.
    // Local variables are variables that are initilized inside of a fucntion and thus can only be used inside of that function.

	/*
	-----------------------------------------------------------------------------------------------
	PROBLEM #2

	Write the function header for a function called overtimePay, that returns a double and has a 
	parameter list that takes a string called name, an int named hours, and a double named payrate.

	Then, write the function prototype for this function in the space above the main function.
	-----------------------------------------------------------------------------------------------
	*/

    // double overtimePay(string, int, double);
    // double overtimePay(string name, int hours, double payRate)

	/*
	-----------------------------------------------------------------------
	PROBLEM #3

	What is a function signature? What does it mean to overload a function?
	-----------------------------------------------------------------------
	*/

    // To overload a functions means to initialize a value inside the function's argument
    // idk lol
    
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
    
    // The output will be
    //  ....
    //  A vaiable a is 9


	/*
	-----------------------------------------------------------------------------
	PROBLEM #5

	Create an array named 'aBunchOfStuff' of type string and with the size of 45.

	Use a constant integer, named SIZE, to define the size.
	-----------------------------------------------------------------------------
	*/
    
    // const int SIZE = 45;
    // string aBunchOfStuff[SIZE];

	/*
	-----------------------------------------------------------------------------------------------------
	PROBLEM #6

	Create an array named 'letters' of type char and initialize it with the values of 'a', 'b', 'c', 'd',
	and 'z' in one line.
	-----------------------------------------------------------------------------------------------------
	*/

    // char letters[5] = {'a', 'b', 'c', 'd' ,'z'};

	/*
	--------------------------------------------------------------------------
	PROBLEM #7

	What is a range-based for loop? How does it differ from a normal for loop?
	--------------------------------------------------------------------------
	*/

    // A range-based loop is a for loop that only iterates  as many times as there are elements in the array
    // A normal for loop iterates as many times as the programmer wants it or needs it to iterate.

	/*
	----------------------------------------------------------------------------------------------------------------
	PROBLEM #8

	Write a range-based for loop that will display every element in an array. Use the array 'numbers' defined below.
	----------------------------------------------------------------------------------------------------------------
	*/

	int numbers[] = { 1, 5, 8, 34, 6, 73, 2 };
    
    for (int i = 0; i < 7; i++)
    {
        cout << numbers[1] << " ";
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
    
    // Output will be
    // 9, 10, 11, 12, 13


	/*
	------------------------------------------------------------------------------------
	PROBLEM #10

	What are two algorithms used to search through arrays for a value? How do they work?
	------------------------------------------------------------------------------------
	*/

     // Linear search:
     // You iterate through every element in the aray looking for the target value.
    
     // Bi	nary search:
     // The array must be sorted before you can use this searvhing algorithm
    
	/*
	--------------------------------------------------------------------
	PROBLEM #11

	What are the two algorithms used to sort an array? How do they work?
	--------------------------------------------------------------------
	*/

    // Bubble sort:
    // You iterate through the array and compare the array at array[i] with the adjacent array (array[i+1]). Depending on the programmer's desire to sort the array in descendgin or ascending order, either the smallest or largest number in the array will be at the (size -1)th position of the array.
    
    // Selection sort:
    // Once an array has been

	/*
	---------------------------------------------------------------------------------------------------------------
	PROBLEM #12

	Given the following array 'jumbled', what will the array be after the first swap of a selection sort algorithm?
	(Assume the algorithm sorts in ascending order).
	---------------------------------------------------------------------------------------------------------------
	*/

	int jumbled[] = {12, 5, 3, 1, 9, 100, 45};


	/*
	---------------------------------------------------------------------------------------------------------------
	PROBLEM #13

	Given the following array 'jumbled2', what will the array be after the third swap of a bubble sort algorithm?
	(Assume the algorithm sorts in ascending order).
	---------------------------------------------------------------------------------------------------------------
	*/

	int jumbled2[] = { 5, 9, 50, 6, 1, 70, 0 };


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
    for (int  i = 0; i < size; i++)
    {
        cout << array1[i] << " ";
        array1[i] += 5;
    }
    
}

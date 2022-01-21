//This program is used to demonstrate formatting output in C++ and working with special functions for inputting characters
//and strings, as well as math functions.

/*-------------------------------------------------------------------------------------------------------------------------
STUDENTS:

Note on showpoint:

---------------------------------------------------------------------------------------------------------------------------

The stream manipulater 'showpoint' can be used to make sure that trailing zeros are displayed when printing a double

For example, take this variable:

double price = 9.00;

This variable, when printed on the screen, will look like this:

9

Some stream manipulators, such as setprecision() and fixed, can simulate this in certain circumstances.
However, it will not always work in all circumstances.

To make sure that the decimal point and any trailing zeros (zeros that come after the decimal point) are displayed on the 
screen, use the showpoint stream manipulator. Like fixed, it only has to be passed once.

Example:

cout << setprecision(3) << showpoint << price;

-------------------------------------------------------------------------------------------------------------------------*/

#include <iostream>
using namespace std;

int main()
{
	//Part 1.)

	//Define two variables named 'firstLastName' and 'carType', each with a string data type

	//Display a message to the user telling them to enter their full name

	//Get the user's full name and store it in 'firstLastName'

	//Display a message to the user telling them to enter the type of car they drive

	//Get the user's car and store it in 'carType'

	//Display a message with this format:
	//"So you drive a <carType>, <firstLastName>?"
	//The data contained in 'carType' and 'firstLastName' should be displayed where <carType> and <firstLastName> are shown.


	//Part 2.)

	//Define four variables: 'diameter', 'radius', 'area' and 'PI'
	//Define all four as double data types. Initialize 'PI' as 3.14159, and as a constant

	//Display a message telling the user to enter the diameter of an apple pie, in inches.

	//Get the diameter from the user and store it in 'diameter'

	//Calculate the radius of the apple pie. The radius in half of the diameter

	//Calculate the area of the apple pie using the following formula:
	//:: The area is equal to pi times the radius squared.
	//Store the result in 'area'

	//Display the area of the apple pie to the user in this format:
	//
	//Apple Pie:
	//--------------------
	//Radius  :  <radius>
	//Diameter:  <diameter>
	//Area    :  <area>
	//
	//The data within 'radius', 'diameter', and 'area' should be displayed where <radius>, <diameter>, and <area> are shown.
	//Format the output so that the decimal is fixed, with the decimal always showing, and the number of digits after the decimal is only one.
	//Give each variable a width of 5.

	return 0;
}
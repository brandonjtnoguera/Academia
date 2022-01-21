// This program is a warm-up for using if, if / else, and nested if statements

/*

---------------------------------------------------------------------------------------------------------------------------
Relational Operators
---------------------------------------------------------------------------------------------------------------------------

Operator			Meaning
--------------------------------------------
>			-		Greater than
<			-		Less than
>=			-		Greater than or equal to
<=			-		Less than or equal to
==			-		Equal to
!=			-		Not equal to

---------------------------------------------------------------------------------------------------------------------------
Logical Operators
---------------------------------------------------------------------------------------------------------------------------

Operator		Meaning
-----------------------
&&		-		AND
||		-		OR
!		-		NOT

---------------------------------------------------------------------------------------------------------------------------
Note with ==
---------------------------------------------------------------------------------------------------------------------------

Be careful to note that the relational operator for comparing whether two things are equal is ==, and not =.
The single = sign is used for assignment - to assign data into variables.
For example:

int num;
num = 1;

The single = will assing the integer variable 'num' with the value of 1.

The double == equal sign is used to compare if the two pieces of data on either side of it are the same - are equal. This
results in a bool value.
For example:

num == 1; 

This compares the data within 'num' and sees if its the same as the integer 1. The comparison will result in true if 'num'
is equal to 1 (it contains the value 1) or false if not.

---------------------------------------------------------------------------------------------------------------------------
if statement format
---------------------------------------------------------------------------------------------------------------------------

if (expression)
{
	statement;

	//More statements can follow
}

---------------------------------------------------------------------------------------------------------------------------
if / else statement format
---------------------------------------------------------------------------------------------------------------------------

if (expression)
{
	statement;

	//More statements can follow
}
else
{
	statement;

	//More statements can follow
}


---------------------------------------------------------------------------------------------------------------------------
nested if statement format
---------------------------------------------------------------------------------------------------------------------------

if (expression1)
{
	//Can have statements before or after the nested if statement

	if (expression2)
	{
		statements;

		//More statements can follow
	}
}

---------------------------------------------------------------------------------------------------------------------------
if / else if statement format
---------------------------------------------------------------------------------------------------------------------------

if (expression1)
{
	statement; 

	//More statements can follow
}
else if (expression2)
{
	statement;

	//More statements can follow
}

//More else if statements can follow//

*/

#include <iostream>
using namespace std;

int main()
{
	double price1 = 3.95, price2 = 4.60, price3 = 3.95;

	int num1 = 12, num2 = 5, lowerBound = 25, upperBound = 75;


	/*
	-------------------------------------------------------------------------------------------
	PROBLEM 1:

	Using conditional statements, compare price1 and price2 and if price1 is less than price2,
	display the message "The first price is less than the second price."
	-------------------------------------------------------------------------------------------
	*/


	/*
	--------------------------------------------------------------------------------------------
	PROBLEM 2:

	Use conditional statements to compare price1 and price3 and if price1 is less than price3,
	display the message "The first price is less than the third price."

	Otherwise, display the message "The first price is not less than the third price."
	--------------------------------------------------------------------------------------------
	*/


	/*
	--------------------------------------------------------------------------------------------
	PROBLEM 3:

	Use conditional statements to compare price1 and price3 again, and if price1 is less than price3,
	display the message "The first price is less than the third price."

	Otherwise, check if price1 is equal to price3. If it is, display the message
	"The first price is equal to the third price."

	Otherwise, display the message "The first price is not less than the third price."

	NOTE: Use nested if statements to complete this problem.
	--------------------------------------------------------------------------------------------
	*/


	/*
	------------------------------------------------------------------------------------------------------------
	PROBLEM 4:

	Use conditional statements to compare num1 and num2, and if num1 is equal to num2,
	display the message "The first number and the second number are equal to each other."

	Otherwise, if num1 is less than num2, display the message "The first number is less than the second number."

	Otherwise, display the message "The first number is greater than the second number."

	NOTE: Do NOT use nested if statements to complete this problem.
	-------------------------------------------------------------------------------------------------------------
	*/


	/*
	-----------------------------------------------------------------------------------------------------------
	PROBLEM 5:

	Use conditional statements and logical operators to check if num1 is greater than lowerBound and less than
	upperBound. If it is, display the message "The first number is within range."

	Otherwise, display the message "The first number is out of range."
	-----------------------------------------------------------------------------------------------------------
	*/

	return 0;
}
//Chapter3 Exercise 2-3

//The purpose of this program is to demonstrate the different methods and ways to obtain data through the cin object, and
//also details some logical errors when using certain combinations of these.

/*
---------------------------------------------------------------------------------------------------------------------------

Note on cin.get()

---------------------------------------------------------------------------------------------------------------------------

The cin object is used to obtain input from the user, and so far it has been predominantly with 'cin >> '.
We have also used the getline() function coupled with cin to get a whole line of string data from the user instead of
simply one word, as 'cin >>' is limited to.

There is another way to get specific kind of data using cin. The cin object has a member function called get().
This function can be used to retrieve one char literal of input from the user.

For example, if the program wants the user to enter a letter grade of a student, it can obtain it using cin.get():
(assume letterGrade has already been initialized as a char type variable)

cout << "What is the student's letter grade?: ";
letterGrade = cin.get();

You can also put the variable to hold the retrieved char into the parentheses, and it will work the same:

cout << "What is the student's letter grade?: ";
cin.get(letterGrade);

cin.get() is superior to 'cin >>' in retrieving char data types in the fact that it can retrieve whitespace characters
- which are characters such as a newline character (which is generated when the user hits ENTER), blank spaces, and tabs.
When a program requires the user to enter characters such as these, cin.get() must be used instead of 'cin >> '

---------------------------------------------------------------------------------------------------------------------------

Note on cin.ignore()

---------------------------------------------------------------------------------------------------------------------------

The cin object also has another member function, ignore(). This function, in contrast to get(), ignores the next character
inputted by the user.

For example:

cout << "The next character you enter will be ignored.";
cin.ignore()

cin.ignore() can be helpful in input errors when mixing 'cin >>', cin.get() and/or getline() in the same program.

For example, when the user is asked to enter a numeric grade for a student, and then the letter grade. The code could be
written as (assume numericGrade and letterGrade have both been defined as a double and a char, respectively):

cout << "What is the numeric grade of the student?: ";
cin >> numericGrade;

cout << "What is the letter grade of the student?: ";
cin.get(letterGrade);

cout <<"Student Grade: " << letterGrade << " / " << numericGrade << endl;

When this code is run, the program will ask and get the numeric grade from the user, but will skip over the cin.get()
and will straight away print out the last cout statement, with a blank where letterGrade is.

The reason comes from two things: first is that when the ENTER key is pressed, it automatically sends in a newline
character (\n) after whatever was just inputed by the user. When 'cin >>' reads input, it reads up to the \n but stops
there.
So when cin.get() is called, it reads in \n, which was left by 'cin >>' and puts it into letterGrade, thusly skipping over
any further input from the user.

cin.ignore() can be added after 'cin >>' to ignore the \n character left over so that cin.get() will retrieve the actual
letter grade entered by the user.

---------------------------------------------------------------------------------------------------------------------------

*/

#include <iostream>
#include <string>
using namespace std;

int main()
{
	//Define three variables: studentName, courseTitle, courseNum, and letterGrade with the data types of string, int,
	//and char, respectively

	//Ask the user to enter the full name of a student

	//Get the student's full name and store it in 'studentName'

	//Ask the user to enter the full title of the student's college course

	//Get the full title of the college course and store it in 'courseTitle'

	//Ask the user for the course number of the college course

	//Get the course number of the college course and store it in 'courseNum'

	//Ask the user for the letter grade the student received upon completion of the course

	//Get the letter grade and store it in 'letterGrade' using the get member function of cin

	//Display the information in the following format:
	//Student Name :: <studentName>
	//Course :: <courseTitle>
	//Course # :: <courseNum>
	//Grade :: <letterGrade>

	//The data within 'studentName', 'courseTitle', 'courseNum', and 'letterGrade' should be displayed where <studentName>,
	//<courseTitle>, <courseNum>, and <letterGrade> are shown, respectively.

	return 0;
}
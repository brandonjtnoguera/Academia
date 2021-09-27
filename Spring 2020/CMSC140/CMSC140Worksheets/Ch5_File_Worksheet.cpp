//This worksheet is used to practice using files in a program

#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main()
{ 
	/* 
	----------------------------------------------------------------------- 
	PROBLEM #1
			 
	What library do you need to include to open a file for input or output? 
	----------------------------------------------------------------------- 
	*/

			 
	/* 
	------------------------------------------------------- 
	PROBLEM #2
			
	Write a statement that opens a file named 'tester.txt'.
	Use the variable 'myFile' to accomplish this 
	-------------------------------------------------------
	*/

	ofstream myFile;


	/* 
	-----------------------------------------------------------------------------------
	PROBLEM #3
	Write a statement that writes the line "I'm coding in C++." to the file outputFile.
	After you write to the file, close the file. 
	-----------------------------------------------------------------------------------
	*/

	ofstream outputFile;
	outputFile.open("tester.txt");


	/*
	----------------------------------------------------------------------------------- 
	PROBLEM #4
	Write a statement to read data from the file inputFile into the variable 'value1'. 
	Then display the data to the user.
	-----------------------------------------------------------------------------------
	*/
	ifstream inputFile; 
	string value1;

	inputFile.open("tester.txt");
	

	/* 
	------------------------------------------------------------------------------------
	PROBLEM #5

	Use an if / else statement to determine if the file "BadTest.txt" was opened or not.
	If the file was opened, display the message "The file was opened." 
	Otherwise, display the message "The file could not be opened." 
	------------------------------------------------------------------------------------ 
	*/

	ifstream inputFile2;
	inputFile2.open("BadTest.txt");

	/*
	-----------------------------------------------------------------------------------------
	PROBLEM #6

	Open the file "numbers.txt". Check if the file exists, and if it does,
	read the numbers in the file and display them until the end of the file has been reached.

	Once the end of the file is reached, close the file.

	If the file does not exist, show an error message to the user.
	-----------------------------------------------------------------------------------------
	*/  

	ifstream numberFile;
	int num;


	return 0;
}
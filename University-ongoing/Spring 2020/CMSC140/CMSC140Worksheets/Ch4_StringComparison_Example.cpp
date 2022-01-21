// This program uses relational operators to compare two strings
// - one entered by the user and the other defined as a constant
#include <iostream>
#include <string>
using namespace std;
int main() 
{ 
	const string MY_NAME = "Robert Gray"; //The name of the programmer 
	string userName;					  //The name that the user enters

	cout << "Please enter your name: "; 
	getline(cin, userName);

	if (MY_NAME == userName) //If the names are equal, display "You are right." 
	{ 
		cout << "You are right." << endl; 
	}
	else //Otherwise, display "You missed it." 
	{
		cout << "You missed it." << endl; 
	}

	return 0;
}
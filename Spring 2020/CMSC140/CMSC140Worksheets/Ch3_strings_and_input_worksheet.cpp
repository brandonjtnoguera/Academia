/*
Materials from Chapter 3
- cin.get(), getline, cin.ignore()
- concatenating strings
*/

#include<iostream>
#include<string> // used with string type
using namespace std;

int main() {

	// Variables to use
	string firstName, lastName, fullName, fullName2;
	char c;

	/*
	#1: Prompt the user to enter their first name and store the result in the variable, firstName.
		Prompt the user to enter their last name and store the result in the variable, lastName.
		Your output should look like this:
			Enter your first name: (first name)
			Enter your last name: (last name)
	*/
	

	/*
	#2: Combine the values of firstName and lastName with a space between them.
		(The result would be the string, "first last")
		Store this in the variable fullName. Then output in the following format:
			Your name is (fullName)
	*/
	

	/*
	#3: We can also get the user's first and last name in one line.
		Prompt the user to enter their first and last name. Store this in the 
		variable, fullName2. Don't use the standard "cin >>". 
		Output the result of fullName2 as follows:
			Enter your first and last name: (first and last name)
			Your name is (fullName2)

		Note: Before getting fullName2, you may need to consume the leading
		newline character
	*/
	

	/*
	#4: Prompt the user to enter a character, and store this character in the
		variable, c. Don't use the standard "cin >>". Output in the following format:
			Enter a character: (some character)
			Your character is (character)
		
		Try entering the word "cat" in the place of a character. What happens?
	*/
	

	return 0;
}
//This program works with char input from 'cin >>' and cin.get()
#include <iostream>
using namespace std;
int main()
{
	//Examples of using cin >> and cin.get() to get char's
	char ch1, ch2; 

	cout << "Enter a character:";
	cin >> ch1;

	cout << "Enter another character:";
	ch2 = cin.get();

	cout << "Thank you." << endl;

	return 0;
}
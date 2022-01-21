//This worksheet is for practicing correct indentation - correcting incorrect indentation
#include <iostream>
using namespace std;

int main()
{
	double temperature = 34.0;
	double BillyGrade = 91.5, JoshGrade = 89.7;
	int dividend = 10, divisor = 0;
	double quotient;

	//Correct the indentation error(s) in this if statement
	if (temperature < 50.0)
	{
cout << "Wear a coat when you go outside." << endl;
	}

	//Correct the indentation error(s) in this if / else statement
	if (BillyGrade < JoshGrade)
	{
		cout << "Josh's grade is higher than Billy's." << endl;
	}
	else
	{
	cout << "Billy's grade is higher than Josh's." << endl;
}

	//Correct the indentation error(s) in this if / self - nested if statements
	if (divisor == 0)
	{
			cout << "You can't divide by zero." << endl;
	}
	else
	{
		quotient = dividend / divisor;
		cout << "The quotient is: " << quotient << endl;

	if (dividend % divisor == 0)
		{
			cout << "The dividend is divisible by the divisor." << endl;
		}
		else
			{
				cout << "The dividend is not divislbe by the divisor." << endl;
			}
	}
}
/*
 * Class: CMSC140
 * CRN: 30556
 * Instructor: Cwhen-Huey Wu
 * Project: Common Project1
 * Description: The Department plans to purchase a humanoid robot. The Chairman would like you to write a program to show a greeting script the robot can use later. Your first task is to use the following script to prototype the robot for presentation
 * Due Date: 02/10/2020
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Brandon Tenorio
 

 * Pseudocode or Algorithm for the program:
    I just did it without a flowchart. 
    (be sure to indent items with control structure)
    (need to match flow chart submitted in documentation.
*/

#include <iostream> // To use cin and cout
#include <string>   // To use the string class
#include <iomanip> // To manipulate outputs

using namespace std;

int main()
{
    const string programmerName = "Brandon Tenorio";
    const string assignmentNumber = "Project 1";
    const string dueDate = "2/10/2020";
    string userName; // Declaring the name of the user
    string robotName = "Chwen-Huey Wu"; // The name of the robot
    long age, num1, num2; // Age of the user's significant other, and the two numbers that will be used to perform the mathematical operations. I used long because if the age of the person or pet is greater than 68, the value for how old the person is in seconds will be negative.
    float num3, num4; // These are the variables where the user's inputs will be placed once they are converted into decimal numbers.
    
    cout << "Hello, welcome to Montgomery College! My name is " << robotName << ".\n"
         << "May I have your name? \n";
    getline(cin, userName);
    cout << "\n";
    /* The section above is to introduce the name of the robot and obtain user's name */
    cout << "Nice to have you with us today, " << userName << "! Let me impress you with a small game!\n";
    cout << "Give me the age of a person or a pet who's important in your life. Please put numbers only.\n";
    cin >> age;
    cout << "\n";
    /* The section above is to obtain the age of the user's special pet or person t*/
    cout << "You have entered the number " << age << ".\n"
         << "If this is for a person, the age can be expressed as:\n"
         << age << " years\n"
         << "or " << age * 12 << " months\n"
         << "or " << age * 365 << " days\n"
         << "or " << age * 365 * 24 << " hours\n"
         << "or " << age * 365 * 24 * 60 << " minutes\n"
         << "or " << age * 365 * 24 * 60 * 60 << " seconds\n\n"
         << "If this is a dog, his/her age is " << age * 7 << " years old.\n"
         << "If this is a goldfish, his/her " << age * 5 << " years old.\n\n";
    /* The section above is converting the age into deifferent measurements */
    cout << "Now let's play another game, " << userName << ". Give me a whole number.\n";
    cin >> num1;
    cout << "\n";
    cout << "Very well. Now, give me another number, " << userName << ".\n";
    cin >> num2;
    cout << "\n";
    /* The section above is to obtain the user's number inputs AS INTEGERS to use them for mathematical operations later on */
    cout << "Using the operator '+' in C++, the result of " << num1 << " + " << num2 << " is "    << num1 + num2 << ".\n"
         << "Using the operator '/', the result of " << num1 << "/" << num2 << " is " << num1 / num2 << ".\n";
    /* The section above is performing addition and division to the user's number inputs; only integers were used */
    num3 = (float)(num1); // Converting the user's first number into a float
    num4 = (float)(num2); // Converting the user's second number into a float
    
    cout << setprecision(1) << fixed;
    cout << "However, the result of " << num3 << "/" << num4 << " is about " << num3 / num4;
    /* The section above is to perform division to the user's number inputs once they have been converted to floating points */
    cout << "\n\nThank you for using my program!"
         << "\nProgrammer: " << programmerName
         << "\nCMSC140 Common " << assignmentNumber
         << "\nDue date: " << dueDate;
    cout << "\n";
    return 0;
}

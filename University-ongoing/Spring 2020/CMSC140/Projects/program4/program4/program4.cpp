#include <iostream>
#include <iomanip>
#include <string>


using namespace std;



int main()

{

    //Define three variables: studentName, courseTitle, courseNum, and letterGrade with the data types of string, int,

    //and char, respectively

    string studentName, courseTitle;
    int courseNum;
    char letterGrade;

    //Ask the user to enter the full name of a student

    cout << "What is your name? ";
    
    //Get the student's full name and store it in 'studentName'
    cout << "\n";
    getline(cin, studentName);

    //Ask the user to enter the full title of the student's college course
    cout << "\n";
    cout << "What compuer science course are you taking? Do not include the number. ";
    cout << "\n";
    //Get the full title of the college course and store it in 'courseTitle'
    
    getline(cin, courseTitle);

    //Ask the user for the course number of the college course
    cout << "\n";
    cout << "What level is the computer science course that you're taking? ";
    cout << "\n";
    //Get the course number of the college course and store it in 'courseNum'
    
    cin >> (cin, courseNum);
    cin.ignore();

    //Ask the user for the letter grade the student received upon completion of the course
    cout << "\n";
    cout << "What is your letter grade in " << courseTitle << " " << courseNum << "? ";
    cout << "\n";
    //Get the letter grade and store it in 'letterGrade' using the get member function of cin

    cin >> (cin, letterGrade);
    cin.ignore();

    //Display the information in the following format:

    cout << "\n";
    cout << "----------------------------------------------------------------------------------------" << "\n";
    cout << "\n";
    cout << "Student Name :: " << studentName << "\n"
         << "Course Title :: " << courseTitle << "\n"
         << "Course #     :: " << courseNum << "\n"
         << "Grade        :: " << letterGrade << endl;
    //Student Name :: <studentName>

    //Course :: <courseTitle>

    //Course # :: <courseNum>

    //Grade :: <letterGrade>



    //The data within 'studentName', 'courseTitle', 'courseNum', and 'letterGrade' should be displayed where <studentName>,

    //<courseTitle>, <courseNum>, and <letterGrade> are shown, respectively.

    
    return 0;

}


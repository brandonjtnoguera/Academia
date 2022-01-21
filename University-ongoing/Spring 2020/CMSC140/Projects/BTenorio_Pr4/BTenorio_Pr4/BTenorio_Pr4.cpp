/*
* Class: CMSC140
* Instructor: Dr. Alyssa Wu
* Project 4
* Description: Write a program that calculates the average number of days a company's employees are absent during the year and outputs a report on a file named "employeeAbsences.txt".
* Due Date: 4/21/2020
* I pledge that I have completed the programming assignment independently.
  I have not copied the code from a student or any source.
  I have not given my code to any student.
  Print your Name here: Brandon Tenorio


* Pseudocode or Algorithm for the program:
        see attached files.
*/

#include <iostream>
#include <string>
#include <fstream>
#include <iomanip>
using namespace std;


const string programmerName = "Brandon Tenorio";
const string assignmentNumber = "Project 4";
const string dueDate = "4/21/2020";


ofstream absencesReport;


int NumOfEmployees();
int TotDaysMissed(int);
double averageAbsent(int, int);


int main()
{
    int totalEmployees;
    int daysMissed;
    double averageAbsences;

    totalEmployees = NumOfEmployees();
    daysMissed = TotDaysMissed(totalEmployees);
    averageAbsences = averageAbsent(totalEmployees, daysMissed);

    absencesReport << endl << endl << "The " << totalEmployees << " employees were absent for a total of " << daysMissed << " days." << endl
        << "The average number of days absent is "
        << fixed << showpoint << setprecision(1)
        << averageAbsences << " days. " << endl << endl;
    absencesReport.close();
    
    cout << "\n\nThank you for using my program!"
        << "\nProgrammer: " << programmerName
        << "\nCMSC140 Common " << assignmentNumber
        << "\nDue date: " << dueDate;
    cout << "\n";

    return 0;
}



int NumOfEmployees() {
    int totalEmployees;
    cout << "Enter the number of employees in the company:" << endl;
    cin >> totalEmployees;
    while (totalEmployees < 1) {
        cout << "You must have one or more employees at your company." << endl
            << "Re-enter the number of employees at this company:" << endl;
        cin >> totalEmployees;
    }
    return totalEmployees;
}


int TotDaysMissed(int TOTAL_EMPLOYEES) {
    int daysMissed;
    int employeeID;
    int daysCounter = 0;

    absencesReport.open("employeeAbsences.txt");
    absencesReport << setw(45) << "Employee Absence Report" << endl
        << setw(22) << "Employee ID" << setw(33) << "Days Absent" << endl;
       

    for (int i = 1; i <= TOTAL_EMPLOYEES; i++) {
        cout << "Enter employee number ID:" << endl;
        cin >> employeeID;
        absencesReport << setw(18) << employeeID << setw(33);

        cout << "Enter the number of days this employee has been absent:" << endl;
        cin >> daysMissed;
        while (daysMissed < 0) {
            cout << "Number of days missed must be greater than or equal to 0. Re-enter the number of days this employee has been absent:" << endl;
            cin >> daysMissed;
        }
        absencesReport <<  daysMissed << endl;
        daysCounter += daysMissed;
    }
    return daysCounter;
}


double averageAbsent(int e, int d) {
    double TOTAL_EMPLOYEES = static_cast<double>(e);
    double DAYS_MISSED = static_cast<double>(d);
    double average = (DAYS_MISSED / TOTAL_EMPLOYEES);
    return average;
}


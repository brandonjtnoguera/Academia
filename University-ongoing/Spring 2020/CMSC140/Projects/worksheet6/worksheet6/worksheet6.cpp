#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
   /*  long seconds;
    double minutes, hours, days, months, years;
    
    cout << "Enter the number of seconds that have\nelapsed since some time in the past and\nI will tell you how many minutes, hours\ndays months, and years have passed: ";
    cin >> seconds;
    
    
    minutes = seconds / 60;
    hours = minutes / 60;
    days = hours / 24;
    years = days / 365;
    months = years * 12;
    
    cout << setprecision(4) << fixed << showpoint << right;
    cout << "Minutes: " << setw(6) << minutes << endl;
    cout << "Hours: " << setw(6) << hours << endl;
    cout << "Days: " << setw(6) << days << endl;
    cout << "Months: " << setw(6) << months << endl;
    cout << "Years: " << setw(6) << years << endl;
    */
    
    
    double salary, monthly;
    cout << "What is your annual salary? ";
    cin >> salary;
    monthly = static_cast<int>(salary) / 12;
    cout << "Your monthly wages are: " << monthly << endl;
     
    return 0;
}

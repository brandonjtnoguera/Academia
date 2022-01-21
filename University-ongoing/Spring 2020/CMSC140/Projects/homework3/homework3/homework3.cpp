#include <iostream>
#include <cmath>
#include <string>
#include <iomanip>
using namespace std;

int main()
{
    string studentName;
    float classParticipation,
          testScore,
          assignmentScore,
          examScore,
          practiceScore;
    
    cout << "Please, enter the student's name: " << endl;
    getline(cin, studentName);
    
    // The section below obtains the user's input, then checks that the user has input a number between 0-100. If the input is not between 0-100, the user will be prompted to enter a number between the given range.
    cout << "\nEnter a Class Participation Score ranging from 0 to 100: \n";
    cin >> classParticipation;
    
    if (classParticipation < 0 || classParticipation > 100){
        do {cout << "\nNumber is not between 0 and 100. " << "Please enter a Class Participation Score ranging from 0 to 100: \n";
        cin >> classParticipation;}
        while (classParticipation < 0 || classParticipation > 100);
    }
    
    cout << "\nEnter a Test Score ranging from 0 to 100: \n";
    cin >> testScore;
    
    if (testScore < 0 || testScore > 100){
        do {cout << "\nNumber is not between 0 and 100. " << "Please enter a Test Score ranging from 0 to 100: \n";
            cin >> testScore;}
        while (testScore < 0 || testScore > 100);
    }
    
    cout << "\nEnter an Assignment Score ranging from 0 to 100: \n";
    cin >> assignmentScore;
    
    if (assignmentScore < 0 || assignmentScore > 100){
        do {cout << "\nNumber is not between 0 and 100. " << "Please enter a Assignment Score ranging from 0 to 100: \n";
            cin >> assignmentScore;}
        while (assignmentScore < 0 || assignmentScore > 100);
    }
    
    cout << "\nEnter an Exam Score ranging from 0 to 100: \n";
    cin >> examScore;
    
    if (examScore < 0 || examScore > 100){
        do {cout << "\nNumber is not between 0 and 100. " << "Please enter an Exam Score ranging from 0 to 100: \n";
            cin >> examScore;}
        while (examScore < 0 || examScore > 100);
    }
    
    cout << "\nEnter a Practice Score ranging from 0 to 100: \n";
    cin >> practiceScore;
    
    if (practiceScore < 0 || practiceScore > 100){
        do {cout << "\nNumber is not between 0 and 100. " << "Please enter a Pratice Score ranging from 0 to 100: \n";
            cin >> practiceScore;}
        while (practiceScore < 0 || practiceScore > 100);
        }
    
    float finalScore = classParticipation + testScore + assignmentScore + examScore + practiceScore;
    float avgFinal_score = (classParticipation + testScore + assignmentScore + examScore + practiceScore) / 5;
    
    
    
    cout << "\nStudent name: \t" << studentName << "\nFinal score: \t" << finalScore;
    cout << fixed << showpoint << setprecision(2);
    cout << "\nAverage score: \t" << avgFinal_score << "\n\n";
    return 0;
}

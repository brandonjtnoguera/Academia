/*
 * Class: CMSC140 CRN
 * Instructor: Alyssa-Wu
 * Project 5
 * Description: Create an algorithm that tests if a series of 9 numbers are a Lo Shu magic square
 * Due Date: 5/6/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Brandon Tenorio
 

 * Pseudocode or Algorithm for the program:
    (be sure to indent items with control structure)
    (need to match flow chart submitted in documentation)
  1.
  2.
  3.
  4.
  5.
 (more as needed)
*/

#include<iostream>
using namespace std;

// Global constants
const int MIN = 1;  // The value of the smallest number
const int MAX = 9;  // The value of the largest number

// Function prototypes
bool isMagicSquare(int row1[], int row2[], int row3[], int size);
bool checkRange(int row1[], int row2[], int row3[], int size, int min, int max);
bool checkUnique(int row1[], int row2[], int row3[], int size);
bool checkRowSum(int row1[], int row2[], int row3[], int size);
bool checkColSum(int row1[], int row2[], int row3[], int size);
bool checkDiagSum(int row1[], int row2[], int row3[], int size);
void fillArray(int row1[], int row2[], int row3[], int size);
void showArray(int row1[], int row2[], int row3[], int size);

// Array size
const int size = 3;
    
// Credentials
const string programmerName = "Brandon Tenorio";
const string assignmentNumber = "Project 5";
const string dueDate = "5/6/2020";

int main()
{

    /* Define a Lo Shu Magic Square using 3 parallel arrays corresponding to each row of the grid */
    // Your code goes here
    
    // Arrays for rows
    int row1[size];
    int row2[size];
    int row3[size];
    
    // To store bool values
    bool a, b, c, d, e, f;
    
    fillArray(row1, row2, row3, size);
    showArray(row1, row2, row3, size);
    a = checkRange(row1, row2, row3, size, MIN, MAX);
    b = checkUnique(row1, row2, row3, size);
    c = checkRowSum(row1, row2, row3, size);
    d = checkColSum(row1, row2, row3, size);
    e = checkDiagSum(row1, row2, row3, size);
    f = isMagicSquare(row1, row2, row3, size);
    
    cout << endl;
    
    if (f == true){
        cout << "This is a Lo Shu Magic Square" << endl;
    }
    else{
        cout << "This is not a Lo Shu Square" << endl;
    }
    
    
    cout << "\n\nThank you for using my program!"
          << "\nProgrammer: " << programmerName
          << "\nCMSC140 Common " << assignmentNumber
          << "\nDue date: " << dueDate;
      cout << "\n";
    
    
    return 0;
}
// Function definitions go here
void fillArray(int row1[], int row2[], int row3[], int size){
    
    int col = 1;
    for (int i = 0; i < size; i++){
 
        cout << "Enter the number for row 1 and column " << col << ":" << endl;
        cin >> row1[i];
        col++;
    }
    col = 1;
    
    for (int i = 0; i < size; i++){
    
           cout << "Enter the number for row 2 and column " << col << ":" << endl;
           cin >> row2[i];
           col++;
       }
    
    col = 1;
    for (int i = 0; i < size; i++){
    
           cout << "Enter the number for row 3 and column " << col << ":" << endl;
           cin >> row3[i];
           col++;
       }
}

void showArray(int row1[], int row2[], int row3[], int size){
    
    cout << endl;
    for (int i = 0; i < size; i++){
        cout << row1[i] << " ";
    }
    cout << endl;
    
    for (int i = 0; i < size; i++){
        cout << row2[i] << " ";
    }
    cout << endl;
    
    for (int i = 0; i < size; i++){
        cout << row3[i] << " ";
    }
    cout << endl;
}

bool checkRange(int row1[], int row2[], int row3[], int size, int min, int max){
    bool a, b, c;
    bool d;
    
    for (int i = 0; i < size; i++){
        if (row1[i] < MIN || row1[i] > MAX){
            a = false;
        }
        else{
            a = true;
        }
    }
    
    for (int i = 0; i < size; i++){
        if (row2[i] < MIN || row2[i] > MAX){
            b = false;
        }
        else{
            b = true;
        }
    }
    
    for (int i = 0; i < size; i++){
        if (row3[i] < MIN || row3[i] > MAX){
            c = false;
        }
        else{
            c = true;
        }
    }
   
    if (a && b && c){
        d = true;
    }
    else{
        d = false;
    }
    
    return d;
}


bool checkUnique(int row1[], int row2[], int row3[], int size){
    
    bool a;
    
    if (row1[0] == row1[1] || row1[0] == row1[2] || row1[1] == row1[2] || row2[0] == row2[1] || row2[0] == row2[2] || row2[1] == row2[2] || row3[0] == row3[1] || row3[0] == row3[2] || row3[1] == row3[2])
    {
        a = false;
    }
    else{
        a = true;
    }
    
    return a;
}


bool checkRowSum(int row1[], int row2[], int row3[], int size){
    
    int sum1 = row1[0] + row1[1] + row1[2];
    int sum2 = row2[0] + row2[1] + row2[2];
    int sum3 = row3[0] + row3[1] + row3[2];
    
    if (sum1 == sum2 && sum1 == sum3){
        return true;
    }
    else{
        return false;
    }
    
}


bool checkColSum(int row1[], int row2[], int row3[], int size){
    
    int sum1 = row1[0] + row2[0] + row3[0];
    int sum2 = row1[1] + row2[1] + row3[1];
    int sum3 = row1[2] + row2[2] + row3[2];
    
    if (sum1 == sum2 && sum1 == sum3){
        return true;
    }
    else{
        return false;
    }
}

bool checkDiagSum(int row1[], int row2[], int row3[], int size){
    
    int sum1 = row1[0] + row2[1] + row3[2];
    int sum2 = row3[0] + row2[1] + row1[2];
    
    if (sum1 == sum2){
        return true;
    }
    else{
        return false;
    }
}

bool isMagicSquare(int row1[], int row2[], int row3[], int size){
    
    bool a, b, c, d, e;
    a = checkRange(row1, row2, row3, size, MIN, MAX);
    b = checkUnique(row1, row2, row3, size);
    c = checkRowSum(row1, row2, row3, size);
    d = checkColSum(row1, row2, row3, size);
    e = checkDiagSum(row1, row2, row3, size);
    
    if (a && b && c && d && e){
  
        return true;
    }
    else{
        return false;
    }
}

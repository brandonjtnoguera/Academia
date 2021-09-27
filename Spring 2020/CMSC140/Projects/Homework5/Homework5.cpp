#include<iostream>
using namespace std;

int main(){
    
    cout << "Part 1" << endl << endl;
    
    cout << "(i)" << endl;
    
    for (int row = 1; row <= 10; row++)
    {
        cout << "*";
    }
    cout << endl << endl;
    
    
    cout << "(ii)" << endl;
    
    for (int row1 = 1; row1 <= 20; row1++)
    {
        cout << "*";
    }
    cout << endl << endl;
    
    
    cout << "(iii)" << endl;
    
    for (int row2 = 1; row2 <= 10; row2++)
    {
        for (int col = 1; col <= row2; col++)
        {
            cout << "*";
        }
        cout << endl;
    }
    cout << endl << endl;
    
    
    cout << "(iv)" << endl;
    for (int row3 = 1; row3 <= 20; row3++)
    {
        for (int col1 = 1; col1 <= row3; col1++)
        {
            cout << "*";
        }
        cout << endl;
    }
    cout << endl << endl;
    
    
    cout << "(v)" << endl;
    for (int row4 = 10; row4 >= 1; row4--)
    {
        for (int col2 = 1; col2 <= row4; col2++)
        {
            cout << "*";
        }
        cout << endl;
    }
    cout << endl << endl;
    
    
    cout << "(vi)" << endl;
    for (int row4 = 20; row4 >= 1; row4--)
    {
        for (int col2 = 1; col2 <= row4; col2++)
        {
            cout << "*";
        }
        cout << endl;
    }
    return 0;
}

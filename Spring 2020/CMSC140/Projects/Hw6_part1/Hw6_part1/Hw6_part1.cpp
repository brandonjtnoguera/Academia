#include <iostream>
using namespace std;


int getChoice();
void getNumbers(int&, int&);
int addition(int&, int&);
int subtraction(int&, int&);


int main()
{
    int result;
    int num1 = 0;
    int num2 = 0;
    int choice = getChoice();
    getNumbers(num1, num2);
    
    if (choice == 1)
    {
        result = addition(num1, num2);
    }
    else
    {
        result = subtraction(num1, num2);
    }
    
    cout << "The result from the operation is " << result << ".\n";
    return 0;
}


int getChoice(){
    int c;
    cout << "Enter 1 for addition, or 2 for subtraction:" << endl;
    cin >> c;
    return c;
}

void getNumbers(int &num1, int &num2){
    cout << "Enter your first number:" << endl;
    cin >> num1;
    
    cout << "Enter your second number:" << endl;
    cin >> num2;
}

int addition(int &num1, int &num2){
    int result = num1 + num2;
    return result;
}

int subtraction(int &num1, int &num2){
    int result = num1 - num2;
    return result;
}

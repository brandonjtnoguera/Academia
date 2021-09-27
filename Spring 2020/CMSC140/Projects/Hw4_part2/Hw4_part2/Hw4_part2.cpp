#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    int subjects;
    float basePrice;
    float totalPrice;
    char answer1;
    char answer2;
    
    
    // Section below is to store the number of subjects in the variable "subjects"
    cout << "Enter the number of subjects in the portrait: " << endl;
    cin >> subjects;
    
    // Section below is for input validation
    while (subjects <= 0)
    {
        cout << "You're a dumbass; choose a number greater than 1." << endl;
        cin >> subjects;
    }
    
    // Section below is to check how many subjects the user has chosen
    switch (subjects)
   {
       case 1:
           basePrice = 100;
           break;
       case 2:
           basePrice = 130;
           break;
       case 3:
           basePrice = 150;
           break;
       case 4:
           basePrice = 160;
           break;
   }

    // Section below is to assign a value to subjects if subjects is greater than or equal to 5
    if (subjects >= 5)
        basePrice = 165;
    
    // Section below is to store the user's answer in "answer1"
    cout << "Do you want a fancy background? (y/n): " << endl;
    cin >> answer1;
    
    // Section below is to check what it is that the user inputted and what to do with that info
    if (answer1 == 'y')
        totalPrice = basePrice * 0.10 + basePrice;
    else if (answer1 == 'n')
        totalPrice = basePrice;
    
    // Section below is to check the second question and perform the necessary operations.
    cout << "Do you want an appointment date? (y/n): " << endl;
    cin >> answer2;
    
    if (answer1 == 'y' && answer2 == 'y' )
        totalPrice = basePrice * 0.20 + basePrice;
    else if ((answer1 == 'n' && answer2 == 'y') || (answer1 == 'y' && answer2 == 'n'))
        totalPrice = basePrice * 0.10 + basePrice;
    else if (answer1 == 'n' && answer2 == 'n')
        totalPrice = basePrice;
    
    cout << fixed << showpoint << setprecision(2);
    cout << "The price is: " << totalPrice << endl;
    
    return 0;
}


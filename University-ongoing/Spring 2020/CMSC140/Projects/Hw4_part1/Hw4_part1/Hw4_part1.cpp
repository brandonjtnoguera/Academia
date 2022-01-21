#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    const float packagePrice = 99.00;
    float quantity;
    
    
    cout << "How many units were sold? " << endl;
    cin >> quantity;                                // This will hold the quantity
    while ( quantity <= 0)  //To validate input
    {
        cout << "Units sold must be greater than zero. Please re-enter the units sold." << endl;
        cin >> quantity;
    }
    float totalPrice = packagePrice * quantity;  // This will hold the total price of purchase
    
    cout << setprecision(2) << fixed << showpoint; // To ensure output is rounded to 2 decimal points
    if (quantity >= 1 && quantity <= 9)
        cout << "The total cost of the purchase is $" << totalPrice << endl;
    else if (quantity >= 10 && quantity <= 19)
        cout << "The total cost of the purchase is $" << totalPrice * 0.80 << endl;
    else if (quantity >= 20 && quantity <= 49)
        cout << "The total cost of the purchase is $" << totalPrice * 0.70 << endl;
    else if (quantity >= 50 && quantity <= 99)
        cout << "The total cost of the purchase is $" << totalPrice * 0.60 << endl;
    else if (quantity >= 100)
        cout << "The total cost of the purchase is $" << totalPrice * 0.50 << endl;
    
    return 0;
}

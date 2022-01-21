#include <iostream>
#include <iomanip>
using namespace std;

const double tax = 0.06;
const double coke = 1.25;
const double pepsi = 1.00;
const double water = 2.00;
const double coffee = 1.50;

double showMenu();
double takePurchase(double&);
double takePayment();
void displayInfo(double&, double&);

double price;
int choice;

int main()
{
    double price;
    double totalPurchase;
    double totalPayment;
    
    do
    {
        price = showMenu();
        totalPurchase = takePurchase(price);
        totalPayment = takePayment();
        displayInfo(totalPurchase,totalPayment);
    }while (choice != 5);
    
    return 0;
}


double showMenu(){
    int choice;
    cout << fixed << showpoint << setprecision(2);
    cout << "*****Vending Machine*****" << endl
         << "1. Coke \t$" << coke << endl
         << "2. Pepsi \t$" << pepsi << endl
         << "3. Water \t$" << water << endl
         << "4. Coffee \t$" << coffee << endl
         << "5. Exit menu" << endl;
    
    cout << endl << "Enter your choice:" << endl;
    cin >> choice;
    
    switch(choice){
        case 1:
            price = coke;
            choice = 1;
            break;
        case 2:
            price = pepsi;
            choice = 2;
            break;
        case 3:
            price = water;
            choice = 3;
            break;
        case 4:
            price = coffee;
            choice = 4;
            break;
        case 5:
            choice = 5;
            exit(0);
            break;
    }
    return price;
}


double takePurchase(double &price){
    int q;
    cout << "How many do you want?" << endl;
    cin >> q;
    return price * q;
}


double takePayment(){
    int p;
    cout << "How much is your payment?" << endl;
    cin >> p;
    return p;
}


void displayInfo(double &totalPurchase, double &totalPayment){
    double purchaseTax = totalPurchase * tax;
    double totalPurchase1 = totalPurchase + purchaseTax;
    double change = totalPayment - totalPurchase;
    cout << endl << "Tax amount:\t\t$" << purchaseTax << endl
         << endl << "Total purchase:\t\t$" << totalPurchase1 << endl
         << endl << "Change:\t\t$" << change << endl << endl;
}

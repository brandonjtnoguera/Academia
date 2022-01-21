#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    
    const float pi = 3.14159,
                sliceArea = 14.125;
    float pizzaDiameter;


    cout << "Please enter the diameter of the pizza in inches: " << endl;
    cin >> pizzaDiameter;
    
    
    float pizzaRadius = pizzaDiameter / 2,
          pizzaArea = pi * pow(pizzaRadius, 2.0),
          sliceQuantity = pizzaArea / sliceArea;
    
    
    cout << "\nThe number of slices that this pizza can be divided into is: \n" << sliceQuantity << " slices.\n\n";
               
    return 0;
}

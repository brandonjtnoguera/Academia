#include <iostream>
using namespace std;

int main()
{
    double a,b,c;
    
    cout << "Give me a number: " << endl;
    cin >> a;
    cout << "\nGive me another number: \n";
    cin >> b;
    
    if (a > b)
    {
        c = a;
    }
    else
    {
        c = b;
    }
        
    cout << a << " " << b << endl;
    
    
    return 0;
}

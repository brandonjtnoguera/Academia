#include<iostream>
using namespace std;


int main()
{
    for (int i = -1; i < 2; i++){
        for (int j = 4; j > 0; j--){
            cout << i+j << " ";
        }
    }
    
    
    cout << endl << endl << endl;
    
    
    int i = -1;
    while (i < 2){
        int j = 4;
        while (j > 0){
            cout << i+j << " ";
            j--;
        }
        i++;
    }
    return 0;
}


#include<iostream>
#include<fstream>
#include<string>
using namespace std;

int main() {


    string name,
        number,
        address,
        city,
        state,
        zipCode;
    // This part is to gather the user's information and store it.
    cout << "What is your name?" << endl;
    getline(cin, name);
    cout << endl;

    cout << "What is your phone number? Please, write it without dashes nor parentheses." << endl;
    getline(cin, number);
    cout << endl;

    cout << "What is you address?" << endl;
    getline(cin, address);
    cout << endl;

    cout << "What city do you live in?" << endl;
    getline(cin, city);
    cout << endl;

    cout << "What state do you live in?" << endl;
    getline(cin, state);
    cout << endl;

    cout << "What's your zip code?" << endl;
    getline(cin, zipCode);
    cout << endl;


    // This part creates a file and inserts the user's information into it.
    ofstream outFile;

    outFile.open("list.txt");
    outFile << "Name:\t\t\t" << name << endl
            << "Phone number:\t\t" << number << endl
            << "Address\t\t\t" << address << ", " << city << ", " << state << ", " << zipCode;
    outFile.close();



    ifstream inFile;
    inFile.open("list.txt");

      if (!inFile)
    {
        cout << "Wrong file name or file extension. Could not open the file." << endl;
    }
    else
    {
        string s;
        while (getline(inFile, s))
        {
            cout << s << endl;
        }
        inFile.close();
    }
    
    return 0;
}






#include <iostream>
using namespace std;

void displayArray(int array[], int size);
void selectionSort(int array[], int size);
void swap(int &a, int &b);

int findMax(int array[], int size);
int findMin(int array[], int size);

double findAvg(int array[], int size);

int main()
{
    int scores, max, min;
    double avg;
    
    
    cout << "How many scores do you want to enter?" << endl;
    cin >> scores;
    int arr[scores];
    
    cout << endl;
    
    for (int i = 1; i < (scores + 1); i++)
    {
        cout << "Enter score #" << i << ":" << endl;
        cin >> arr[i-1];
    }
    
    cout << "Original order scores are: ";
    displayArray(arr, scores);
    cout << endl << endl;
    
    selectionSort(arr, scores);
    
    cout << "Scores ordered from high to low: ";
    displayArray(arr, scores);
    cout << endl << endl;
    
    
    max = findMax(arr, scores);
    cout << "Highest scores is: " << max << endl << endl;
   
    
    min = findMin(arr, scores);
    cout << "Lowest scores is: " << min << endl << endl;
    
    avg = findAvg(arr, scores);
    cout << "Average scores is: " << avg << endl << endl;
    

    
    return 0;
}


double findAvg(int array[], int size)
{
      int sum = 0;
    
      for (int i = 0; i < size; i++)
      {
         sum += array[i];
      }
    
    double avg = (double)sum/size;
    return avg;
}


int findMin(int array[], int size)
{
    int min;
    for (int i = 0; i < size; i++)
    {
        if (array[i] < array[i+1])
        {
            min = array[i];
        }
    }
    
    return min;
}


int findMax(int array[], int size)
{
    int max;
    for (int i = 0; i < size; i++)
    {
        if (array[i] > array[i+1])
        {
            max = array[i];
        }
    }
    
    return max;
}


void displayArray(int array[], int size)
{
    cout << endl;
    
    for (int i = 0; i < size; i++)
    {
        cout << array[i] << " ";
    }
}


void swap(int &a, int &b)
{
    int temp = a;
    a = b;
    b = temp;
}


void selectionSort(int array[], int size)
{
    int minIndex, minValue;
    
    for (int start = 0; start < (size - 1); start++)
    {
        minIndex = start;
        minValue = array[start];
        
        for (int index = start + 1; index < size; index++)
        {
            if (array[index] > minValue)
            {
                minValue = array[index];
                minIndex = index;
            }
        }
        swap(array[minIndex], array[start]);
    }
}

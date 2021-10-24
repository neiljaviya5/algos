#include <iostream>
using namespace std;

int main() {
    int len;
    int array[100];
    cout << "Enter the length of the array : ";
    cin >> len;
    for(int i=0; i<len; i++ ) {
        cout << "Enter the ("<< i+1 <<") Element : ";
        cin >> array[i];
    }

    // Bubble shot loop 
    for(int i=0; i<len; i++) {
        for(int j=0; j < len-i-1; j++) {
            if(array[j] > array[j+1]) {
                int  swap;
                swap = array[j];
                array[j] = array[j+1];
                array[j+1] = swap;
            }
        }
    }

    for(int i=0; i< len; i++) {
        cout << i+1 << " Element : " << array[i] << endl;

    }
    return 0;
}
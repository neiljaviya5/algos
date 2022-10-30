#include <stdio.h>
#include <conio.h>

void quickSort(int a[], int first, int last) {
    int temp, low, high, p;
    low = first;
    high = last;
    p = a[(first+last)/2];

    do {
        while(a[low] < p) {
            low++;
        }
        while (a[high] > p) {
            high--;
        }
        if(low <= high) {
            temp= a[low];
            a[low] = a[high];
            a[high]= temp;
            low++;
            high--;
        }
    }while(low<=high);

    if(first < high){
        quickSort(a, first, high);
    }
    if(low < last) {
        quickSort (a, low, last);
    }

}



void main() {
    
    int  n;
    int a[20];
    printf("\n Enter Number of elements : ");
    scanf("%5d", &n);

    printf("\n Enter %d element: ", n);
    for( int i=0;i<n;i++) {
        printf ("Enter the [%d] Element : ", i+1);
        scanf("%5d", &a[i]);
    }
    
    printf("\n Original array is : ");
    for(int i=0; i<n; i++) {
        printf("%5d   ", a[i]);
    }

    quickSort(a, 0, n-1);

    printf("\n Sorted array is : ");
    for (int i=0; i<n;i++) {
        printf("%5d   ", a[i]);
    }

    getch()
}







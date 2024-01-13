//
// Created by Aqib Mughal on 11/28/23.
//

#include "Sorting.h"

int main(){
    Sorting obj;


    cout<<"1. Selection Sort"<<endl;
    cout<<"2. Insertion Sort"<<endl;
    cout<<"3. Bubble Sort"<<endl;
    cout<<"4. Quick Sort"<<endl;
    cout<<"5. Merge Sort"<<endl;
    cout<<"6. Display"<<endl;
    cout<<"7. Add Elements in the array"<<endl;
    cout<<"8. Exit"<<endl;

    int choice;
    cin>>choice;

    switch (choice) {
        case 1:
            //selectionSort();
            break;
        case 2:
            //insertionSort();
            break;
        case 3:
            //bubbleSort();
            break;
        case 4:
            //quickSort();
            break;
        case 5:
            //mergeSort();
            break;
        case 6:
            //printArray();
            break;
        case 7:
            int aa[10];
            for(int i=0;i<10;i++){
                cout<<"Enter the element"<<endl;
                cin>>aa[i];
            }
            break;
        case 8:
            exit(0);
        default:
            cout<<"Invalid Choice"<<endl;
    }
}
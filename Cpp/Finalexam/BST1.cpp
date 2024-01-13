//
// Created by Aqib Mughal on 12/26/23.
//

#include "BST1.h"

int main() {
    BST1 bst;
    int choice, data;
    while(true) {
        cout << "1. Add new course codes to the system\n2. Display all the course codes in the system using pre-order traversal\n3. Search for a specific course code\n4. Display course code having smallest Value\n5. Exit\n";
        cin >> choice;
        switch(choice) {
            case 1:
                cout << "Enter course code: ";
                cin >> data;
                bst.insert(data);
                break;
            case 2:
                bst.preOrder();
                break;
            case 3:
                cout << "Enter course code: ";
                cin >> data;
                if(bst.search(data))
                    cout << "Course found\n";
                else
                    cout << "Course not found\n";
                break;
            case 4:
                try {
                    cout << "Smallest course code: " << bst.findMin() << "\n";
                } catch(const char* msg) {
                    cout << msg << "\n";
                }
                break;
            case 5:
                return 0;
            default:
                cout << "Invalid choice\n";
        }
    }
    return 0;
}

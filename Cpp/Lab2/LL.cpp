#include "LL.h"
#include <iostream>
using namespace std;

int main(){
    LL Linklist;

//    Linklist.insertAtStart(1);
//    Linklist.insertAtEnd(2);
//    Linklist.insertAtEnd(3);
//    Linklist.insertAtEnd(4);
//    Linklist.insertAtEnd(5);
//    Linklist.insertAtEnd(6);
//    Linklist.insertAtEnd(7);
//    Linklist.insertAtEnd(8);
//    Linklist.delAlternate();

    Linklist.add5Nodes(2,3,4,5,6);
    Linklist.Display();
    return 0;
};


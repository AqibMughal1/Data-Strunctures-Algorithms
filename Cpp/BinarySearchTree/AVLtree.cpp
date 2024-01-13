//
// Created by Aqib Mughal on 11/28/23.
//

#include "AVLtree.h"

#include <iostream>
using namespace std;


int main() {
    AVLtree obj;
    Node *root = nullptr;
    root = obj.insertNode(root, 33);
    obj.insertNode(root, 13);
    obj.insertNode(root, 53);
    obj.insertNode(root, 9);
    obj.insertNode(root, 21);
    obj.insertNode(root, 61);
    obj.insertNode(root, 8);
    obj.insertNode(root, 11);
    obj.printTree(root);


};

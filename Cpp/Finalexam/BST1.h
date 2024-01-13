//
// Created by Aqib Mughal on 12/26/23.
//

#ifndef DATA_STRUNCTURES_ALGORITHMS_BST1_H
#define DATA_STRUNCTURES_ALGORITHMS_BST1_H

#include<iostream>
using namespace std;

struct Node {
    int data;
    Node* left;
    Node* right;
};

class BST1 {
private:
    Node* root;

    Node* insert(Node* node, int data) {
        if(node == NULL) {
            node = new Node();
            node->data = data;
            node->left = node->right = NULL;
        }
        else if(data <= node->data)
            node->left = insert(node->left, data);
        else
            node->right = insert(node->right, data);
        return node;
    }

    void preOrder(Node* node) {
        if(node == NULL)
            return;
        cout << node->data << " ";
        preOrder(node->left);
        preOrder(node->right);
    }

    Node* search(Node* node, int data) {
        if(node == NULL || node->data == data)
            return node;
        if(data < node->data)
            return search(node->left, data);
        return search(node->right, data);
    }

    Node* findMin(Node* node) {
        while(node->left != NULL)
            node = node->left;
        return node;
    }

public:
    BST1() {
        root = NULL;
    }

    void insert(int data) {
        root = insert(root, data);
    }

    void preOrder() {
        preOrder(root);
        cout << "\n";
    }

    bool search(int data) {
        return (search(root, data) != NULL);
    }

    int findMin() {
        Node* node = findMin(root);
        if(node == NULL)
            throw "BST is empty!";
        return node->data;
    }
};



#endif //DATA_STRUNCTURES_ALGORITHMS_BST1_H

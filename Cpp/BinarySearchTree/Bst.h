//
// Created by Aqib Mughal on 11/14/23.
//

#ifndef DATA_STRUNCTURES_ALGORITHMS_BST_H
#define DATA_STRUNCTURES_ALGORITHMS_BST_H
#include <iostream>
#define nullptr NULL

class Bst {
struct  Node{
    int data;
    Node* left;
    Node* right;
};

Node* root;

void insert(int data){
    Node* newNode = new Node();
    newNode->data = data;
    newNode->left = nullptr;
    newNode->right = nullptr;
    if(root == nullptr){
        root = newNode;
    }else{
        Node* temp = root;
        while(temp != nullptr){
            if(temp->data > data){
                if(temp->left == nullptr){
                    temp->left = newNode;
                    break;
                }else{
                    temp = temp->left;
                }
            }else{
                if(temp->right == nullptr){
                    temp->right = newNode;
                    break;
                }else{
                    temp = temp->right;
                }
            }
        }
    }
};

void findmin(){
    Node* temp = root;
    while(temp->left != nullptr){
        temp = temp->left;
    }
    std::cout << "Min: " << temp->data << std::endl;
};

void findmax(){
    Node* temp = root;
    while(temp->right != nullptr){
        temp = temp->right;
    }
    std::cout << "Max: " << temp->data << std::endl;
};


};


#endif //DATA_STRUNCTURES_ALGORITHMS_BST_H

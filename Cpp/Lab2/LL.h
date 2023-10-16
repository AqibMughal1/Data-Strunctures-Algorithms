#ifndef CPP_LL_H
#define CPP_LL_H

#include <iostream>

using namespace std;

class Node {
public:
    int data;
    Node* next;

    Node() : data(), next(nullptr) {}
};

class LL {
private:
    Node* head;
    Node* tail;

public:
    LL() : head(nullptr), tail(nullptr) {}

    void insertAtStart(int val) {
        Node* temp = new Node();
        temp->data = val;
        temp->next = head;
        head = temp;

        if (tail == nullptr)
        {
            tail = head;
        }
    }

    void insertAtEnd(int val) {
        Node* temp = new Node();
        temp->data = val;
        temp->next = nullptr;
        if (head == nullptr) {
            head = tail = temp;
        } else {
            tail->next = temp;
            tail = temp;
        }
    }

    void insertAtPos(int val,int pos){
        Node* Current;
        Node* Pre;
        Node* temp = new Node();
        temp->data = val;
        Current = head;

        for(int i=0;i<=pos;i++){
            Pre = Current;
            Current = Current->next;
        }

        Pre->next = temp;
        temp->next = Current;
    }

    void delAtStart(){
        Node* Current;
        Current = head;
        head = head->next;
        delete Current;
    }

    void delAtEnd(){
        Node* curr;
        Node* pre;
        curr = head;
        while(curr->next!= nullptr){
            pre = curr;
            curr = curr->next;
        }
        tail = pre;
        pre->next = nullptr;
        delete curr;
    }

    void delAtPos(int Pos){
        Node* pre;
        Node* curr;
        curr = head;
        for(int i=0;i<Pos;i++){
            pre = curr;
            curr = curr->next;
        }
        pre->next = curr->next;
        delete curr;
    }

    void Display() {
        Node* current = head;

        if (current == nullptr) {
            cout << "LinkedList is Empty" << endl;
            return;
        }

        cout << "LinkedList elements are: ";

        while (current != nullptr) {
            cout << current->data << "  ";
            current = current->next;
        }
        cout << endl;
    }


    void delAlternate(){
        Node* curr = head;
        Node* temp ;
        Node* prev;
        prev=curr;

        while(curr->next!= nullptr && curr->next->next!= nullptr ){
            temp = curr->next;
            curr = curr->next->next;
            prev->next = curr;

            delete temp;
            prev=curr;
        }
    }



};

#endif //CPP_LL_H

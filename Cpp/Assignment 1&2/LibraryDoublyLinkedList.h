//
// Created by I T world on 10/16/2023.
//

#ifndef DSA_LIBRARYDOUBLYLINKEDLIST_H
#define DSA_LIBRARYDOUBLYLINKEDLIST_H

#include "DoublyBooknode.h"


class 	LibraryDoublyLinkedList
{
private:
    DoublyBooknode *head;
    DoublyBooknode *tail;
public:
    LibraryDoublyLinkedList()
    {
        head=NULL;
        tail=NULL;
    }

    void createDoublyBooknode(Book book1)
    {
        DoublyBooknode *temp=new  DoublyBooknode;
        DoublyBooknode *current;
        temp->data=book1;
        temp->next=NULL;
        if(head==NULL)
        {
            temp->prev=NULL;
            head=temp;
        }
        else
        {
            current=head;
            while(current->next!=NULL)
            {
                current=current->next;
            }
            current->next=temp;
            temp->prev=current;

        }
    }
    void insertDoublyBooknodeatstart(Book book1)
    {
        DoublyBooknode *temp=new 	DoublyBooknode;
        DoublyBooknode *current;
        temp->data=book1;
        temp->next=head;
        temp->prev=NULL;
        head->prev=temp;
        head=temp;
    }
    void deleteDoublyBooknodeatend()
    {
        DoublyBooknode *temp = new 	DoublyBooknode;
        DoublyBooknode *current;
        temp=head;
        while(temp->next!=NULL)
        {
            temp=temp->next;
        }
        temp->prev->next=NULL;
        delete temp;
    }
    void displayDoublyBook()
    {
        DoublyBooknode *temp= new DoublyBooknode;
        temp=head;
        while(temp!=NULL)
        {
            temp->data.displayinfo();
            temp=temp->next;
        }
    }
};


#endif //DSA_LIBRARYDOUBLYLINKEDLIST_H

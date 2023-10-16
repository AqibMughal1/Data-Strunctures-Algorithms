//
// Created by I T world on 10/16/2023.
//

#ifndef DSA_LIBRARYLINKEDLIST_H
#define DSA_LIBRARYLINKEDLIST_H

#include "Book.h"
#include "BookNode.h"



class LibraryLinkedlist {
private:
    Booknode *head;
    Booknode *tail;

public:
    LibraryLinkedlist()
    {
        head=NULL;
        tail=NULL;
    }

    void createBooknode(Book book1)
    {
        Booknode *temp=new Booknode;
        Booknode *current;
        temp->data=book1;
        temp->next=NULL;
        if(head==NULL)
        {
            head=temp;
            tail=temp;
        }
        else
        {
            tail->next=temp;
            tail=temp;
        }
    }
    void insertbookatend(Book book1)
    {
        Booknode *temp=new Booknode;
        temp->data=book1;
        temp->next=NULL;
        if(head==NULL)
        {
            head=temp;
            tail=temp;

        }
        else
        {
            tail->next=temp;
            tail=temp;
        }
    }
    void deletebookatstart()
    {
        Booknode *temp=new Booknode;
        temp=head;
        head=head->next;
        delete temp;
    }

    void displayBooks()
    {
        Booknode *temp=new Booknode;
        temp=head;
        while(temp!=NULL)
        {
            temp->data.displayinfo();
            temp=temp->next;
        }
    }
};


#endif //DSA_LIBRARYLINKEDLIST_H

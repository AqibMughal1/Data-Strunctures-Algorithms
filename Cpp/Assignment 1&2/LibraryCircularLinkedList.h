//
// Created by I T world on 10/16/2023.
//

#ifndef DSA_LIBRARYCIRCULARLINKEDLIST_H
#define DSA_LIBRARYCIRCULARLINKEDLIST_H
#include "CircularBookNode.h"


class LibraryCircularLinkedList {

    private :
        CircularBookNode *head;
        CircularBookNode *tail;
    public:
        LibraryCircularLinkedList()
        {
            head=NULL;
            tail=NULL;
        }
        void createLibraryCircularLinkedList(Book book1)

        {
            CircularBookNode *temp=new 	CircularBookNode;
            temp->data=book1;
            temp->next=NULL;
            if(head==NULL)
            {
                head=temp;
                temp->next=head;
                tail=temp;
            }
            else
            {

                tail->next=temp;
                tail=temp;
                tail->next=head;
            }


        }


        void insertbookatend(Book book1)
        {
            CircularBookNode *temp=new CircularBookNode;
            CircularBookNode * current;
            current=head;
            temp->data=book1;
            temp->next=head;
            while(current->next!=head)
            {
                current=current->next;

            }
            current->next=temp;
            tail=temp;
        }

        void deletebookatstart()
        {
            CircularBookNode  *current=new 	CircularBookNode;
            current=head;
            head=current->next;
            delete current;

        }
        void display()
        {
            CircularBookNode *temp= new 	CircularBookNode;
            temp=head;
            do
            {
                temp->data.displayinfo();
                temp=temp->next;
            }
            while(temp!=head);
        }


};


#endif //DSA_LIBRARYCIRCULARLINKEDLIST_H

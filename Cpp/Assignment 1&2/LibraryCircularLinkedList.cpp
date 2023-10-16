//
// Created by I T world on 10/16/2023.
//

#include "LibraryCircularLinkedList.h"

int main()
{
    LibraryCircularLinkedList obj;
    cout<<" Display books"<<endl;
    Book  book1("anderson", "season 1", "vol 1", 2011);
    Book  book2("jane eyre", "twin cities", "vol 2", 2016);
    Book book3("david henry","the mind","vol 3",2020);

    obj.createLibraryCircularLinkedList(book1);
    obj.createLibraryCircularLinkedList(book2);
    obj.createLibraryCircularLinkedList(book3);
    obj.display();

    cout<<"Insert at end"<<endl;
    Book book4("Kelay","DSA","Vol 5",1998);
    obj.insertbookatend(book4);
    obj.display();

    cout<<"-----------------------------------"<<endl;

    cout<<"Deleting at start"<<endl;
    obj.deletebookatstart();
    obj.display();
    cout<<endl;

};

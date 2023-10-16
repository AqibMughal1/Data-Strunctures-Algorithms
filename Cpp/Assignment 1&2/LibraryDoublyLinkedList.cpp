//
// Created by I T world on 10/16/2023.
//

#include "LibraryDoublyLinkedList.h"
    int main()
    {
        LibraryDoublyLinkedList obj;
        cout<<" displlay of a books in a linked list"<<endl;
        Book  book1("anderson", "season 1", "vol 1", 2011);
        Book  book2("jane eyre", "twin cities", "vol 2", 2016);
        Book book3("david henry","the mind","vol 3",2020);
        obj.createDoublyBooknode(book1);
        obj.createDoublyBooknode(book2);
        obj.createDoublyBooknode(book3);
        obj.displayDoublyBook();
        cout<<endl;
        cout<<"---------------------"<<endl;


        cout<<" insert book at start"<<endl;
        cout<<"---------------------"<<endl;
        Book  book4("author 4", "Book title 4", "Genre 4", 400);
        obj.insertDoublyBooknodeatstart(book4);
        obj.displayDoublyBook();
        cout<<endl;

        cout<<"---------------------"<<endl;
        cout<<"delete book at end"<<endl;
        cout<<"---------------------"<<endl;
        obj.deleteDoublyBooknodeatend();
        obj.displayDoublyBook();
        cout<<endl;
    }

//
// Created by I T world on 10/16/2023.
//

#include<iostream>
using namespace std;
#include "Book.h"

#include "LibraryLinkedlist.h"

int main() {
    LibraryLinkedlist obj;
    cout << " display of  books in the linked list " << endl;
    Book  book1("anderson", "season 1", "vol 1", 2011);
    Book  book2("jane eyre", "twin cities", "vol 2", 2016);
    Book book3("david henry","the mind","vol 3",2020);
    obj.createBooknode(book1);

    obj.createBooknode(book2);

    obj.createBooknode(book3);
    obj.displayBooks();

    cout << " insert book at end in a linked list" << endl;
    Book book5("author 4", "Book title 4", "Genre 4", 900);
    obj.createBooknode(book5);
    obj.displayBooks();

    cout << " remove the book at start the linked list" << endl;
    obj.deletebookatstart();
    obj.displayBooks();
    cout << endl;
};
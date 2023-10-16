//
// Created by I T world on 10/16/2023.
//
#include<iostream>
#include<string>
using namespace std;
#include "Library.h"
#include "Book.h"


int main()
{
    Library c1;
    Book  book1("anderson", "season 1", "vol 1", 2011);
    Book  book2("jane eyre", "twin cities", "vol 2", 2016);
    Book book3("david henry","the mind","vol 3",2020);
    c1.addbook(book1);
    c1.addbook(book2);
    c1.addbook(book3);
    cout<<" the books in the library"<<endl;
    c1.displaybooks();
}

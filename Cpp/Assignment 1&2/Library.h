//
// Created by I T world on 10/16/2023.
//

#ifndef DSA_LIBRARY_H
#define DSA_LIBRARY_H
#include<iostream>
#include<string>

#include "Book.h"

using namespace std;


class Library
{
private:
    int size;
    Book books[100];
public:
    Library()
    {
        size=0;
    }

    bool addbook(Book book1)
    {
        if(size<100)
        {
            books[size]=book1;
            size++;
            return true;
        }

        return false;
    }
    void displaybooks()
    {
        for(int x=0;x<size;x++)
        {
            cout<<" BOOK "<<(x+1)<<endl;
            books[x].displayinfo();
            cout<<endl;

        }
    }
};




#endif //DSA_LIBRARY_H

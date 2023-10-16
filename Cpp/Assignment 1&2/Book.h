//
// Created by I T world on 10/16/2023.
//

#ifndef DSA_BOOK_H
#define DSA_BOOK_H
#include<iostream>
#include<string>
using namespace std;



class Book
{
private:
    string author;
    string title;
    string genre;
    int year;
public:
    Book()
    {
        author="";
        title="";
        genre="";
        year=0;
    }
public:
    Book(string author,string title,string genre,int year)
    {
        this->author=author;
        this->title=title;
        this->genre=genre;
        this->year=year;

    }
    string getauthor()
    {
        return author;
    }
    void setauthor(string author)
    {
        this->author=author;
    }
    string gettitle()
    {
        return title;
    }
    void settitle(string title)
    {
        this->title=title;
    }
    void setgenre(string genre)
    {
        this->genre=genre;
    }

    string getgenre()
    {
        return genre;
    }

    int getyear()
    {
        return year;
    }
    void setyear(int year)
    {
        this->year=year;
    }
    void displayinfo()
    {
        cout<<"title = "<<title<<endl;
        cout<<"genre = "<<genre<<endl;
        cout<<"year = "<<year<<endl;
        cout<<"author = "<<author<<endl;
    }
};



#endif //DSA_BOOK_H

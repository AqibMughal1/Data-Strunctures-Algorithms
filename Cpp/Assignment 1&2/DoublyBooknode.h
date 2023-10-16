//
// Created by I T world on 10/16/2023.
//

#ifndef DSA_DOUBLYBOOKNODE_H
#define DSA_DOUBLYBOOKNODE_H


#include "Book.h"

class DoublyBooknode
{
public:
    Book data;
    DoublyBooknode *next;
    DoublyBooknode *prev;
};



#endif //DSA_DOUBLYBOOKNODE_H

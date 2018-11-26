#ifndef LINKEDLIST_H
#define LINKEDLIST_H
#include <iostream>
#include <vector>
using namespace std;
class linkedList{
    private:
        struct node{
            int data;
            node *next;
        };
        unsigned int size;
        node *start;
    public:
        linkedList(int t);
        void insert(int t);
        void prnt();
        void removeDups();
};

#endif

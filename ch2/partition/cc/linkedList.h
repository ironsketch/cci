#ifndef LINKEDLIST_H
#define LINKEDLIST_H
#include <iostream>
using namespace std;

class linkedList{
    public:
        linkedList(int t);
        void insert(int t);
        void prnt();
        void partition(int p);
        int size();
    private:
        struct node{
            int data;
            node *next;
        };
        node *start = new node;
        void swap(node *first, node *second);
        int sizeOfList;
};

#endif

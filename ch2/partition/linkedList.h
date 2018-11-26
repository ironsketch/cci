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
        node *start;
        void move(node *first, node *second);
};

#endif

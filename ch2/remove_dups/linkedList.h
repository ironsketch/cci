#ifndef LINKEDLIST_H
#define LINKEDLIST_H
#include <iostream>
#include <vector>
#include <stdio.h>
using namespace std;
class linkedList{
    private:
        struct node{
            int data;
            node *next;
        };
        int s;
        node *start;
    public:
        linkedList(int t);
        void insert(int t);
        void prnt();
        void removeDups();
};

#endif

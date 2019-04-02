#ifndef LINKEDLIST_H
#define LINKEDLIST_H
#include <iostream>
#include <vector>
#include <stdio.h>
using namespace std;

struct node{
    int data;
    node *next;
};

class linkedList{
    public:
        int s;
        node *start = new node;
        linkedList(int t);
        void insert(int t);
        void prnt();
        void removeDups();
};

#endif

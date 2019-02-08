#include "linkedList.h"

linkedList::linkedList(int t){
    start->data = t;
    start->next = nullptr;
    size = 0;
}

void linkedList::insert(int t){
    node *newNode = new node;
    newNode->data = t;
    newNode->next = nullptr;

    node *trav = start;
    while(trav->next != nullptr){
        trav = trav->next;
    }
    trav->next = newNode;
    size ++;
}

void linkedList::p(){
    node *trav = start;
    while(trav->next != nullptr){
        cout << trav->data << " ";
        trav = trav->next;
    }
    cout << trav->data << endl;
}

int linkedList::kth(int k){
    node *trav = start;
    for(int i = 0; i < k; i++){
        trav = trav->next;
    }
    return trav->data;
}

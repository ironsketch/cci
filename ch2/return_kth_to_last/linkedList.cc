#include "linkedList.h"

linkedList::linkedList(int t){
    start->data = t;
    start->next = nullptr;
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
}

void linkedList::p(){
    node *trav = start;
    while(trav->next != nullptr){
        cout << trav->data;
        trav = trav->next;
    }
    cout << trav->data << endl;
}

int linkedList::size(){
    node *trav = start;
    int count = 0;
    while(trav->next != nullptr){
        count++;
        trav = trav->next;
    }
    return count + 1;
}

int linkedList::kth(int k){
    int s = size() - k - 1;
    node *trav = start;
    for(int i = 0; i < s; i++){
        trav = trav->next;
    }
    return trav->data;
}

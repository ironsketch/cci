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

void linkedList::prnt(){
    node *trav = start;
    while(trav != nullptr){
        cout << trav->data << " ";
        trav = trav->next;
    }
    cout << endl;
}

void linkedList::delMnode(){
    int middle = (size() / 2) - 1;
    if(middle >= 0){
        node *trav = start;
        for(int i = 0; i < middle; i++){
            trav = trav->next;
        }
        trav->next = trav->next->next;
    }
}

int linkedList::size(){
    node *trav = start;
    int count = 0;
    while(trav != nullptr){
        count++;
        trav = trav->next;
    }
    return count;
}

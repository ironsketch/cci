#include "linkedList.h"

linkedList::linkedList(int t){
    start->data = t;
    start->next = nullptr;
    sizeOfList = 1;
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
    sizeOfList++;
}

void linkedList::prnt(){
    node *trav = start;
    while(trav != nullptr){
        cout << trav->data << " ";
        trav = trav->next;
    }
    cout << endl;
}

void linkedList::swap(node *first, node *second){
    int temp = first->data;
    first->data = second->data;
    second->data = temp;
}

void linkedList::partition(int p){
    node *trav = start;
    int count = sizeOfList;
    for(int i = count; i > 0; i--){
        if(trav->next->data >= p){
            insert(trav->next->data);
            trav->next = trav->next->next;
            sizeOfList--;
        } else {
            trav = trav->next;
        }
    }
    trav = start;
    if(trav->data >= p){
        insert(trav->data);
        start = trav->next;
    }
}
int linkedList::size(){
    return sizeOfList;
}

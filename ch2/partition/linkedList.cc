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

void linkedList::swap(node *first, node *second){
    int temp = first->data;
    first->data = second->data;
    second->data = temp;
}

void linkedList::partition(int p){
    node *trav = start;
    node *temp = new node;
    while(trav != nullptr){
        if(trav->data <= p){
            
        }
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

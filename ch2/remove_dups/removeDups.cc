#include "linkedList.h"

int main(){
    linkedList ll(1);
    ll.insert(1);
    ll.insert(3);
    ll.insert(3);
    ll.insert(3);
    ll.insert(3);
    ll.insert(3);
    ll.insert(3);
    ll.insert(3);
    ll.insert(3);
    ll.insert(3);
    ll.insert(2);
    ll.insert(2);
    ll.insert(2);
    ll.insert(2);
    cout << "The Singly LinkedList before duplication removal:" << endl;
    ll.prnt();
    ll.removeDups();
    cout << "After duplication removal" << endl;
    ll.prnt();
    int test = 0;
    return 0;
}

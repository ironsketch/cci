#include "linkedList.h"

int main(){
    cout << "meow" << endl;
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
    ll.prnt();
    return 0;
}

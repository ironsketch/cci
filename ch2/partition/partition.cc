#include "linkedList.h"

int main(){
    linkedList ll(3);
    ll.insert(5);
    ll.insert(8);
    ll.insert(5);
    ll.insert(10);
    ll.insert(2);
    ll.insert(1);
    ll.prnt();
    cout << endl;
    cout << endl;
    ll.partition(5);
    ll.prnt();
    return 0;
}

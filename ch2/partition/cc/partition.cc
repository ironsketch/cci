#include "linkedList.h"

int main(){
    linkedList ll(44);
    ll.insert(5);
    ll.insert(8);
    ll.insert(5);
    ll.insert(10);
    ll.insert(2);
    ll.insert(1);
    cout << "The data inserted" << endl;
    ll.prnt();
    cout << endl;
    cout << "Partitioning over 5" << endl;
    ll.partition(5);
    ll.prnt();
    return 0;
}

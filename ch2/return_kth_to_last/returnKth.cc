#include "linkedList.h"

int main(){
    linkedList ll(1);
    ll.insert(2);
    ll.insert(3);
    cout << ll.kth(0) << endl;
    cout << ll.kth(1) << endl;
    return 0;
}

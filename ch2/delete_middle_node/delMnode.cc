#include "linkedList.h"

int main(){
    linkedList ll(4);
    ll.insert(3);
    ll.insert(2);
    ll.insert(4342);
    ll.prnt();
    ll.delMnode();
    ll.prnt();
    ll.delMnode();
    ll.prnt();
    ll.delMnode();
    ll.prnt();
    ll.delMnode();
    ll.prnt();
    return 0;
}

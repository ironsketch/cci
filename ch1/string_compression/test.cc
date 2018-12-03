#include <string>
#include <iostream>
using namespace std;

int main(){
    string a = "aabb";
    string b = "";
    cout << b << endl;
    b += a[0] + a;
    cout << b << endl;
    return 0;
}

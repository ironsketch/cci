#include <string>
#include <iostream>
#include <typeinfo>
using namespace std;

int main(){
    string meow = "Blink Mother Fucker";
    for(int i = 0; i < meow.length(); i++){
        if(meow[i] == ' '){
            meow.erase(meow.begin() + i);
        }
    }
    cout << typeid(abs(-6 + 2)).name() << endl;
    cout << typeid(double(meow.length())).name() << endl;
}

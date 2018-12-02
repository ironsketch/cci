#include <string>
#include <iostream>
using namespace std;

void urlify(string &str){
    for(int i = 0; i < str.length(); i++){
        if(str[i] == ' '){
            str.erase(str.begin() + i);
            str.insert(i,"%20");
        }
    }
}

int main(){
    string a = "Thishasnospaces";
    string b = "THis has a lot of spaces and such ok.";
    cout << "a before: " << a << " b before: " << b << endl;
    urlify(a);
    urlify(b);
    cout << "a after: " << a << " b after: " << b << endl;
    return 0;
}

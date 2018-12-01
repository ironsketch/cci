#include <string>
#include <iostream>
using namespace std;

bool isUnique(string str){
    for(int i = 0; i < str.length(); i++){
        for(int j = i + 1; j < str.length(); j++){
            if(str[j] == str[i]){
                return false;
            }
        }
    }
    return true;
}

int main(){
    string abc = "abc";
    string abcba = "abcba";
    cout << noboolalpha << isUnique(abc) << endl;
    cout << noboolalpha << isUnique(abcba) << endl;
    return 0;
}

#include <string>
#include <iostream>
using namespace std;

bool checkPermutations(string &str1, string str2){
    if(str1.length() != str2.length()){
        return false;
    }
    for(int i = 0; i < str1.length(); i++){
        for(int j = 0; j < str2.length(); j++){
            if(str1[i] == str2[j]){
                str2.erase(str2.begin() + j);
            }
        }
    }
    if(str2.length() > 0){
        return false;
    }
    return true;
}

int main(){
    string a = "abcda";
    string b = "bacda";
    string c = "abcde";
    cout << noboolalpha << checkPermutations(a, b) << endl;
    cout << noboolalpha << checkPermutations(a, c) << endl;
    return 0;
}

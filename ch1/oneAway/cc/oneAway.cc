#include <string>
#include <iostream>
#include <cmath>
#include <algorithm>
using namespace std;

int replace(string &str1, string str2){
    int count = 0;
    int len = str2.length();
    for(int i = 0; i < str1.length(); i++){
        for(int j = 0; j < str2.length(); j++){
            if(str1[i] == str2[j]){
                count++;
                str2.erase(str2.begin() + j);
            }
        }
    }
    return abs(double(count - min(double(str1.length()), double(len))));
}

bool oneAway(string &str1, string &str2){
    int count = 0;
    if(str1.compare(str2) == 0){
        return true;
    } else {
        count += abs(double(str1.length() - str2.length()));
        count += replace(str1, str2);
    }
    if(count > 1){
        return false;
    }
    return true;
}

int main(){
    string str1a = "pale";
    string str1b = "ple";
    string str2a = "pales";
    string str3b = "bale";
    string str4b = "bake";

    cout << noboolalpha << oneAway(str1a, str1b) << endl;
    cout << noboolalpha << oneAway(str2a, str1a) << endl;
    cout << noboolalpha << oneAway(str1a, str3b) << endl;
    cout << noboolalpha << oneAway(str1a, str4b) << endl;
    return 0;
}

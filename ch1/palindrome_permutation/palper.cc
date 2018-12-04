#include <string>
#include <iostream>
#include <algorithm>
using namespace std;

bool isPal(string &word){
    string tmp = word;
    reverse(tmp.begin(), tmp.end());
    return word.compare(tmp) == 0;
}

void swap(string &word, int i, int j){
    char tmp = word[i];
    word[i] = word[j];
    word[j] = tmp;
}

void permute(string &word, int l, int r){
    if(l == r){
        if(isPal(word)){
            cout << word << endl;
        }
    } else {
        for(int i = 0; i < word.length(); i++){
            swap(word, l, i);
            permute(word, l + 1, r);
            swap(word, l, i);
        }
    }
}

int main(){
    string s = "tacocat";
    string abc = "abcab";
    permute(abc, 0, abc.length());
    return 0;
}

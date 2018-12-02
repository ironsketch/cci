#include <string>
#include <iostream>
#include <vector>
#include <typeinfo>
using namespace std;

vector<int> letters(26,0);

bool canBePalindrome(string &str){
    string tmp = str;
    int count = str.length();
    for(int i = 0; i < str.length(); i++){
        for(int j = i + 1; j < tmp.length(); j++){
            if(str[i] == tmp[j]){
                letters[int(str[i]) - 97]++;
                tmp.replace(tmp.begin() + j, tmp.begin() + j, " ");
                count--;
                break;
            }
        }
    }

    if(count > 1){
        return false;
    }
    return true;
}

void permutation(string &str){
    if(canBePalindrome(str)){
        for(int i = 0; i < letters.size(); i++){
            cout << char(i+97) << ":" << letters[i] << ", ";
        }
        cout << endl;
    } else {
        cout << "False: " << str << endl;
    }
    letters.clear();
    letters.resize(26,0);
}

int main(){
    string yes = "jwjeiwi";
    string no = "kfjgueh";
    string test = "aabhhjjiioopp";
    permutation(yes);
    permutation(no);
    permutation(test);
    return 0;
}

#include <string>
#include <iostream>
using namespace std;

string stringComp(string str){
    int count = 0;
    int total = 0;
    string tmp = "";
    for(int i = 0; i < str.length() - 1; i++){
        count++;
        total++;
        if(str[i] != str[i + 1]){
            tmp += str[i] + to_string(count);
            count = 0;
        }
    }
    tmp += str[str.length() - 1] + to_string(count + 1);
    total += count + 1;
    if(total == str.length()){
        return str;
    }
    return tmp;
}

int main(){
    string a = "aabcccccaaa";
    string b = "meow";
    string c = "aaadjddjjjjjfff9493fcnnnn44444jj;;f''''''";
    cout << stringComp(a) << endl;
    cout << stringComp(b) << endl;
    cout << stringComp(c) << endl;
    return 0;
}

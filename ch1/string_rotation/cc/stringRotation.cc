#include <iostream>
#include <string>
#include <iomanip>
using namespace std;

bool stringRotation(string a, string b){
    for(int i = 0; i < b.length(); i++){
        if(a == b){
            return true;
        }
        b = b.substr(1,b.length()) + b[0];
    }
    return false;
}

int main(int argc, char** argv){
    if(argc != 3){
        printf("Usage: $ ./stringRotation word1 word2\n");
        return 1;
    }
    cout << boolalpha << stringRotation(argv[1],argv[2]) << endl;
    return 0;
}

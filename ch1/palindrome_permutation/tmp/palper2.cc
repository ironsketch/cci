#include "palper2.h"

void permute(string &s){
    cout << ": ";
    permute(s, 0, s.length() - 1);
    cout << endl;
}

void permute(string &s, int l, int h){
    string tmp = s;
    if(l == h){
        cout << s << " : ";
    } else {
        for(int i = l; i < h + 1; i++){
            swap(s, l, i);
            permute(s, l + 1, h);
            swap(s, l, i);
        }
    }
}

void swap(string &s, int i, int j){
    char tmp = s[i];
    s[i] = s[j];
    s[j] = tmp;
}

int main(int argc, char *argv[]){
    if(argc < 2){
        cout << "[Usage] ./palper2 word1 word2 word3 etc." << endl;
        return 1;
    } else {
        for(int i = 1; i < argc; i++){
            string str(argv[i]);
            permute(str);
        }
        return 0;
    }
}

#include <vector>
#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <ctime>
using namespace std;
void setUp(vector< vector<int> >& v){
    for(int i = 0; i < v.size(); i++){
        for(int j = 0; j < v[0].size(); j++){
            v[i][j] = rand() % ((v.size() * v[0].size())/5);
        }
    }
}

void printArr(vector< vector<int> >& v){
    for(int i = 0; i < v.size(); i++){
        for(int j = 0; j < v[0].size(); j++){
            printf("%3d", v[i][j]);
        }
        printf("\n");
    }
    printf("\n");
}

void zero(vector< vector<int> >& v, int row, int col){
    for(int i = 0; i < v.size(); i++){
        for(int j = 0; j < v[0].size(); j++){
            if(i == row){
                v[i][j] = 0;
            }
            if(j == col){
                v[i][j] = 0;
            }
        }
    }
}

vector< vector<int> > zeroMatrix(vector< vector<int> >& v){
    vector< vector<int> > tmp = v;
    for(int i = 0; i < v.size(); i++){
        for(int j = 0; j < v[0].size(); j++){
            if(v[i][j] == 0){
                zero(tmp, i, j);
            }
        }
    }
    return tmp;
}

int main(int argc, char** argv){
    srand(time(NULL));
    if(argc != 3){
        cout << "Usage: $ ./zeroMatrix col row" << endl;
        return 1;
    } 
    vector< vector<int> > v(stoi(argv[1]), vector<int>(stoi(argv[2])));
    setUp(v);
    printArr(v);
    vector< vector<int> > newV = zeroMatrix(v);
    printArr(newV);
    return 0;
}

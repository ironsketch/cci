#include <string>
#include <iostream>
#include <iomanip>
#include <vector>
using namespace std;

// Printing the vector for understanding and aesthetics
void print(vector< vector<int> >& v){
    for(int i = 0; i < v.size(); i++){
        for(int j = 0; j < v[0].size(); j++){
            cout << setw(4) << v[i][j];
        }
        cout << endl;
    }
    cout << "\n" << endl;
}

// For learning purposes, I am setting up an arbitrary vector to see the affects of my rotate :D
void setUp(vector< vector<int> >& v){
    for(int i = 0; i < v.size(); i++){
        for(int j = 0; j < v[0].size(); j++){
            v[i][j] = (i * 4) + j;
        }
    }
}

vector< vector<int> > rotate(vector< vector<int> >& v){
    setUp(v);
    vector< vector<int> > newV(v[0].size(), vector<int>(v.size()));
    for(int i = 0; i < v.size(); i++){
        for(int j = 0; j < v[0].size(); j++){
            cout << v[0].size() - j << " vsize - j:i " << i << endl;
            newV[v[0].size() - j - 1, j][i] = v[v.size() - i - 1][j];
        }
    }
    return newV;
}

int main(int argc, char** argv){
    if(argc != 3){
        cout << "Usage: ./rotate int int" << endl;
        return 1;
    }
    vector< vector<int> > v(stoi(argv[1]), vector<int>(stoi(argv[2])));
    cout << "The vector created:" << endl;
    print(v);
    vector< vector<int> > newV = rotate(v);
    cout << "The vector with numbers" << endl;
    print(v);
    cout << "The new vector with rotation" << endl;
    print(newV);

    return 0;
}

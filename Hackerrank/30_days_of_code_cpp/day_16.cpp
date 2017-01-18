#include <iostream>
#include <string>
#include <stdexcept>

using namespace std;

int main(){
    string S;
    int num;
    cin >> S;
    try {
        num = stoi(S);
        cout << num << endl;
    }
    catch(invalid_argument&) {
        cout << "Bad String" << endl;
    }
    return 0;
}

#include <iostream>

using namespace std;


int main(){
    int n;
    cin >> n;
    if (n % 2) cout << "Weird" << endl;
    else if (n <= 5) cout << "Not Weird" << endl;
    else if (n <= 20) cout << "Weird" << endl;
    else cout << "Not Weird" << endl;
    return 0;
}

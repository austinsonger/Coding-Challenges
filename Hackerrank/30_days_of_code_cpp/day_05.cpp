#include <iostream>

using namespace std;

int main(){
    int n;
    cin >> n;
    for(int i = 1; i <= 10; i++){
        int aux = i * n;
        cout << n << " x " << i << " = " << aux << endl;
    }
    return 0;
}

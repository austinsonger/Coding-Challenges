#include <iostream>

using namespace std;

int main(){
    int t;
    cin >> t;
    for (int a_0 = 0; a_0 < t; a_0++){
        int n, k;
        int maximal = 0;
        cin >> n >> k;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n + 1; j++) {
                int value = i & j;
                if (maximal < value && value < k) {
                    maximal = value;
                }
            }
        }
        cout << maximal << endl;
    }
    return 0;
}

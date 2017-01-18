#include <vector>
#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> A(n);
    for (int i = 0; i < n; i++) {
        cin >> A[i];
    }
    for (int i = 0; i < n; i++) {
        cout << A[n - i - 1] << " ";
    }
    return 0;
}

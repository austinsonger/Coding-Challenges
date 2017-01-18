#include <cmath>
#include <iostream>

using namespace std;

string is_prime(int x) {
    if (x == 1) return "Not prime";
    int k = int(sqrt(x));
    for (int i = 2; i <= k; i++) {
        if (x % i == 0) return "Not prime";
    }
    return "Prime";
}

int main() {
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        cout << is_prime(x) << endl;
    }
    return 0;
}

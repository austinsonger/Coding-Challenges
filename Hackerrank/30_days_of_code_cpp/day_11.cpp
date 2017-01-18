#include <vector>
#include <iostream>
#include <climits>
#include <algorithm>

using namespace std;

int get_value(vector<vector<int>> A, int i, int j){
    int value = 0;
    for (int k = 0; k < 3; k++) {
        value = value + A[i][j + k] + A[i + 2][j + k];
    }
    value = value + A[i + 1][j + 1];
    return value;
}

int main() {
    int A_size = 6;

    // Fill A
    vector<vector<int>> A(6, vector<int>(6));
    for (int i = 0; i < A_size; i++) {
        for (int j = 0; j < A_size; j++) {
            cin >> A[i][j];
        }
    }

    // Check Hour Glasses
    int max_hg = INT_MIN;
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            max_hg = max(max_hg, get_value(A, i, j));
        }
    }

    // Print result
    cout << max_hg << endl;
    return 0;
}

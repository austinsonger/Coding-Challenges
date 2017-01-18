#include <vector>
#include <iostream>
#include <utility>

using namespace std;

pair<vector<int>, int> bubble_sort_swaps(vector<int> A) {
    int total_swaps = 0;
    int n = A.size();
    for (int i = 0; i < n; i++) {
        int swaps = 0;
        for (int j = 0; j < n - 1; j++) {
            if (A[j] > A[j + 1]) {
                int aux = A[j];
                A[j] = A[j + 1];
                A[j + 1] = aux;
                swaps++;
            }
        }
        if (swaps == 0) {
            break;
        }
        total_swaps = swaps + total_swaps;
    }
    return pair<vector<int>, int>(A, total_swaps);
}

int main(){
    int n, swaps;
    cin >> n;
    vector<int> A(n);
    for (int i = 0; i < n; i++) {
        cin >> A[i];
    }
    pair<vector<int>, int> p = bubble_sort_swaps(A);
    A = p.first;
    swaps = p.second;
    cout << "Array is sorted in " << swaps << " swaps." << endl;
    cout << "First Element: " << A[0] << endl;
    cout << "Last Element: " << A[n - 1] << endl;
    return 0;
}

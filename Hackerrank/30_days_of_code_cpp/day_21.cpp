#include <iostream>
#include <vector>

using namespace std;

template <typename T>

void printArray(vector<T> A) {
    for (int i = 0; i < A.size(); i++) {
        cout << A[i] << endl;
    }
}

int main() {
    vector<int> vector_int{1, 2, 3};
    vector<string> vector_str{"Hello", "World"};
    printArray<int>(vector_int);
    printArray<string>(vector_str);
    return 0;
}

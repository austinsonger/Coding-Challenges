#include <iostream>
#include <algorithm>

using namespace std;

int main(){
    int n;
    int max_count = 0;
    int count = 0;
    cin >> n;
    while (n != 0) {
        if (n & 1) {
            count++;
        } else {
            max_count = max(max_count, count);
            count = 0;
        }
        n = n >> 1;
    }
    max_count = max(max_count, count);
    cout << max_count << endl;
    return 0;
}

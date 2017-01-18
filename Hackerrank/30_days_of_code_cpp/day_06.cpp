#include <iostream>
#include <string>

using namespace std;

void print_words(string line){
    string even, odd;
    int j = 0;
    while (j < line.length() - 1) {
        even.append(1, line[j]);
        odd.append(1, line[j + 1]);
        j = j + 2;
    }
    if (j == line.length() - 1) {
        even.append(1, line[j]);
    }
    cout << even << " " << odd << endl;
}

int main() {
    int t;
    cin >> t;
    cin.ignore();
    for (int i = 0; i < t; i++) {
        string line;
        getline(cin, line);
        print_words(line);
    }
    return 0;
}

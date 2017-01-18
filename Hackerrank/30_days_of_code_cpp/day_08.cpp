#include <map>
#include <iostream>

using namespace std;

int main() {
    map<string,int> phone_book;
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        string key;
        int value;
        cin >> key;
        cin >> value;
        phone_book[key] = value;
    }
    cin.ignore();

    string query;
    while (getline(cin, query)) {
        if (phone_book.find(query) == phone_book.end()) {
            cout << "Not found" << endl;
        }
        else {
            cout << query << "=" << phone_book[query] << endl;
        }
    }
    return 0;
}

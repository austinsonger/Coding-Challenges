#include <regex>
#include <vector>
#include <iostream>

using namespace std;

int main(){
    int n;
    vector<string> names;
    regex domain ("@gmail\\.com$");
    cin >> n;
    for (int i = 0; i < n; i++) {
        string name;
        string email;
        cin >> name >> email;
        if (regex_search(email, domain)) {
            names.push_back(name);
        }
    }
    sort(names.begin(), names.end());
    for (int i = 0; i < names.size(); i++) {
        cout << names[i] << endl;
    }
    return 0;
}

#include <vector>
#include <iostream>

using namespace std;

class Difference {
    private:
        vector<int> elements;

    public:
        int maximumDifference;

        Difference (vector<int> elements) {
            this->elements = elements;
        }

        void computeDifference() {
            int max_element = this->elements[0];
            int min_element = this->elements[0];
            for (int i = 1; i < this->elements.size(); i++) {
                int a = this->elements[i];
                if (max_element < a) {
                    max_element = a;
                }
                if (a < min_element) {
                    min_element = a;
                }
            }
            maximumDifference = max_element - min_element;
        }
};

int main() {
    int n;
    cin >> n;
    vector<int> a;
    for (int i = 0; i < n; i++) {
        int e;
        cin >> e;
        a.push_back(e);
    }
    Difference d(a);
    d.computeDifference();
    cout << d.maximumDifference;
    return 0;
}

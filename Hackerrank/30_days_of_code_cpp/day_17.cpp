#include <cmath>
#include <iostream>
#include <exception>
#include <stdexcept>

using namespace std;

class PowerException: public exception {
    virtual const char* what() const throw() {
        return "n and p should be non-negative";
    }
};

class Calculator {
    public:
        int power(int n, int p) {
            if(n < 0 || p < 0) {
                throw PowerException();
            }
            return int(pow(n, p));
        }
};

int main() {
    Calculator calc = Calculator();
    int T, n, p;
    cin >> T;
    while (T-->0) {
        if (scanf("%d %d", &n, &p) == 2) {
            try {
                cout << calc.power(n,p) << endl;
            }
            catch (exception &e) {
                cout << e.what() << endl;
            }
        }
    }
}

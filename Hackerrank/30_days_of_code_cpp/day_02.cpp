#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    float meal_cost;
    float tip;
    float tax;
    float total_cost;

    cin >> meal_cost;
    cin >> tip;
    cin >> tax;

    total_cost = meal_cost * (1 + tip/100 + tax/100);
    cout << "The total meal cost is " << round(total_cost) << " dollars." << endl;
    return 0;
}

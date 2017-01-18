#include <iostream>

using namespace std;

int main() {
    int d, m, y;
    int d_e, m_e, y_e;
    cin >> d >> m >> y;
    cin >> d_e >> m_e >> y_e;
    if (y > y_e) {
        cout << 10000;
    } else if (y == y_e && m > m_e) {
        cout << (m - m_e) * 500;
    } else if (y == y_e && m == m_e && d > d_e) {
        cout << (d - d_e) * 15;
    } else {
        cout << 0;
    }
    return 0;
}

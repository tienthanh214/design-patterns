#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    vector<int> elements({1, 2, 3, 3, 2, 1});
    for (int x : elements) cout << x << " "; cout << endl;
    elements.erase(std::remove(elements.begin(), elements.end(), 2), elements.end());
    for (int x : elements) cout << x << " ";

    return 0;
}
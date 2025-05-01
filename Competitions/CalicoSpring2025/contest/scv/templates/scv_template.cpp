#include <iostream>
#include <vector>

using namespace std;

/**
 * Return the shape displayed by the picture represented by G of dimensions N x M
 *
 * S: a string representing an ASCII picture
 * N: integer for number of rows
 * M: integer for number of columns
 */
string solve(int N, int M, vector<string> G) {
    // YOUR CODE HERE
    return "";
}

int main() {
    int T;
    cin >> T;
    for (int c = 0; c < T; c++) {
        int N, M;
        cin >> N >> M;
        vector<string> G(N);
        for (int i = 0; i < N; i++) {
            cin >> G[i];
        }
        cout << solve(N, M, G) << '\n';
    }
}
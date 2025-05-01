#include <iostream>
#include <queue>
#include <unordered_map>
#include <set>
#include <tuple>
#include <climits>
using namespace std;

struct State {
    int x, y, next, drift, moves;
};

int solve(int h, int w, const string& drift, const unordered_map<int, pair<int, int>>& button_pos) {
    queue<State> q;
    set<tuple<int, int, int, int>> visited;
    q.push({0, 0, 1, 0, 0});
    visited.insert({0, 0, 1, 0});

    while (!q.empty()) {
        State s = q.front();
        q.pop();
        if (s.next > h * w) {
            return s.moves;
        } if (button_pos.count(s.next) && 
            button_pos.at(s.next) == make_pair(s.x, s.y)) {
            auto new_state = make_tuple(s.x, s.y, s.next + 1, s.drift);
            if (visited.find(new_state) == visited.end()) {
                visited.insert(new_state);
                q.push({s.x, s.y, s.next + 1, s.drift, s.moves});
            }
            continue;
        }
        char drift_dir = drift[s.drift % drift.size()];
        int nx = s.x, ny = s.y;
        switch (drift_dir) {
            case 'U': ny = (ny - 1 + h) % h; break;
            case 'D': ny = (ny + 1) % h; break;
            case 'L': nx = (nx - 1 + w) % w; break;
            case 'R': nx = (nx + 1) % w; break;
        } int moves[5][2] = {{0,-1}, {0,1}, {-1,0}, {1,0}, {0,0}};
        for (int i = 0; i < 5; i++) {
            int dx = moves[i][0], dy = moves[i][1];
            int new_x = (nx + dx + w) % w;
            int new_y = (ny + dy + h) % h;
            int new_drift = (s.drift + 1) % drift.size();
            auto new_state = make_tuple(new_x, new_y, s.next, new_drift);
            if (visited.find(new_state) == visited.end()) {
                visited.insert(new_state);
                q.push({new_x, new_y, s.next, new_drift, s.moves + 1});
            }
        }
    } // if were here we fucked up
    return -1;
}

int main() {
    int testcases;
    cin >> testcases;
    for (int i=0;i<testcases;i++) {
        int h, w;
        string drift;
        cin >> h >> w >> drift;
        unordered_map<int, pair<int, int>> button_pos;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int val;
                cin >> val;
                button_pos[val] = {j, i};
            }
        } int result = solve(h, w, drift, button_pos);
        cout << result << endl;
    }
    
    return 0;
}
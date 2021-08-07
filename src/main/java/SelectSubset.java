public class SelectSubset {
}

/*
* #include<bits/stdc++.h>
#define int long long int
using namespace std;

int CeilIndex(std::vector<int>& v, int l, int r, int key)
{
    while (r - l > 1) {
        int m = l + (r - l) / 2;
        if (v[m] >= key)
            r = m;
        else
            l = m;
    }

    return r;
}

int LongestIncreasingSubsequenceLength(std::vector<int>& v)
{
    if (v.size() == 0)
        return 0;

    std::vector<int> tail(v.size(), 0);
    int length = 1;

    tail[0] = v[0];
    for (size_t i = 1; i < v.size(); i++) {

        if (v[i] < tail[0])
            tail[0] = v[i];

        else if (v[i] > tail[length - 1])
            tail[length++] = v[i];
        else
            tail[CeilIndex(tail, -1, length - 1, v[i])] = v[i];
    }

    return length;
}

void solve(){
    int n;
    cin >> n;

    int a[n + 1];
    int b[n + 1];
    for(int i = 1 ; i <= n ; i++) cin >> a[i];
    for(int i = 1 ; i <= n ; i++) cin >> b[i];

    vector<pair<int,int> >v;
    for(int i = 1 ; i <= n ; i++) v.push_back(make_pair(a[i], b[i]));

    sort(v.begin(), v.end());

    vector<int> temp;
    for(int i = 0 ; i < n ; i++) temp.push_back(v[i].second);

    cout << LongestIncreasingSubsequenceLength(temp) << endl;
}

signed main(){
    int t;
    cin >> t;
    while(t--){
        solve();
    }
}*/
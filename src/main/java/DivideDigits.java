public class DivideDigits {
}

/*

2
1321
42255

25
270


*#include<bits/stdc++.h>
#define int long long int
using namespace std;

void solve(){
    int n;
    cin >> n;

    vector<int>dig;
    while(n)
    {
        dig.push_back(n%10);
        n /= 10;
    }

    sort(dig.begin(), dig.end());

    int x = 0;
    int y = 0;
    for(int i = 0 ; i < (int)dig.size() ; i++){
        if(i&1) x = (x*10 + dig[i]);
        else y = (y*10 + dig[i]);
    }

    cout << (x + y) << endl;
}

signed main(){
    int t;
    cin >> t;
    while(t--){
        solve();
    }
}
*/
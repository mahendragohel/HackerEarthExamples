public class CountArray {
}

/*
#include<bits/stdc++.h>
using namespace std;
vector<int> primes;
int spf[1000001];

void pre()
{
    int i, j;
    for(i=2;i<1000001;i++)
        if(spf[i] == 0){
            primes.push_back(i);
            for(j = i ; j < 1000001 ;j+=i)
                spf[j] = i;
        }
}

void solve(int i, int curr_prod, int dp[], int p)// keep ith element
{
    for(auto j : primes)
    {
        if(j*1ll*curr_prod > p)
            break;
        // can keep 'j' here
        int x = j*curr_prod;  // extend it to 2*x
        if(x*1ll*x > p) // cannot extend
            break;
        dp[2*i]++;
        solve(i+1, curr_prod*j, dp, p);
        int y = x*x; // check if we can extend it to 2*i + 1
        for(auto k : primes)
        {
            if(y*1ll*k > p)
                break;
            dp[2*i + 1]++;
        }
    }
}

vector<int> prime_palindrome (int P, int Q, vector<int> query) {
    assert(1 <= P && P <= 1e6);
    assert(1 <= Q && Q <= 2e5);
    int dp[25] = {0};
    solve(1, 1, dp, P);
    dp[1] = upper_bound(primes.begin(), primes.end(), P) - primes.begin();
    vector<int> ans;
    for(int i = 1; i <= 24 ; i++)
        dp[i] = dp[i] + dp[i-1];
    for(int i = 0; i < Q ; i++)
    {
        int len = query[i];
        len = min(len, 24);
        ans.push_back(dp[len]);
    }
    return ans;
}

int main() {

    ios::sync_with_stdio(0);
    cin.tie(0);
    pre();
    int T;
    T = 1;
    assert(1 <= T && T <= 10);
    for(int t_i = 0; t_i < T; t_i++)
    {
        int P;
        cin >> P;
        int Q;
        cin >> Q;
        vector<int> query(Q);
        for(int i_query = 0; i_query < Q; i_query++)
        {
            cin >> query[i_query];
            assert(1 <= query[i_query] && query[i_query] <= 1e9);
        }

        vector<int> out_;
        out_ = prime_palindrome(P, Q, query);
        cout << out_[0];
        for(int i_out_ = 1; i_out_ < out_.size(); i_out_++)
        {
            cout << " " << out_[i_out_];
        }
        cout << "\n";
    }
}
* */

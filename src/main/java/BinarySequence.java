public class BinarySequence {
}

/*
* #include "bits/stdc++.h"
#ifdef LOCAL
#include "pprint.hpp"
#endif
#define endl '\n';
#define pb push_back
#define mod 1000000007
#define int long long int
#define prn(x) cerr<<x<<endl;
#define all(x) x.begin(),x.end()
using namespace std;
#define test_case 1

int dp[52][52][102][3], k, Z;

int solve(int z, int o, int con, int prev){
    if(z<0 || o<0)
        return 0;
    if(z==0 && o==0)
        return (con>=k);
    int &ans = dp[z][o][con][prev];
    if(ans!=-1)
        return ans;
    ans=0;
    if(prev==0){
        ans += solve(z-1,o,max(Z-z+1,con),0);
        ans += solve(z,o-1,con+1,1);
    }
    if(prev==1){
        ans += solve(z-1,o,max(con,Z-z+1),0);
        ans += solve(z,o-1,con+1,1);
    }
    return ans%mod;
}

void solution(){
    memset(dp,-1,sizeof(dp));
    // cout<<dp<<endl;
    int z,o;
    cin>>z>>o>>k;
    assert(z>=1 && z<=50);
    assert(o>=1 && o<=50);
    assert(k>=1 && k<=100);
    Z=z;
    int ans = solve(z-1,o,1,0) + solve(z,o-1,1,1);
    cout<<ans%mod<<endl;
}

signed main()
{
    int t=1;
    if(test_case)
        cin>>t;
    assert(t>=1 && t<=10);
        while(t--){
            solution();
        }
    return 0;
}*/

public class MInimizeProduct {
}

/*#include<bits/stdc++.h>
#define int long long int
#define mod 1000000007
using namespace std;

struct node{
    int f_mn;
    int s_mn;
    int f_ct;
    int s_ct;
};

node seg[400505];
int a[100005];

node mer(node left, node right)
{
    node answer;
    vector<pair<int,int> >a;
    a.push_back(make_pair(left.f_mn, left.f_ct));
    a.push_back(make_pair(right.f_mn, right.f_ct));
    a.push_back(make_pair(left.s_mn, left.s_ct));
    a.push_back(make_pair(right.s_mn, right.s_ct));

    sort(a.begin(), a.end());
    vector<pair<int,int> >b;
    for(int i = 0 ; i < 4 ; i++){
        int value = a[i].first;
        int count = a[i].second;
        int j = i + 1;
        while(j < 4 and a[j].first == value)
        {
            count += a[j].second;
            j++;
        }
        if(value != INT_MAX)
            b.push_back(make_pair(value, count));
        i = j - 1;
    }

    sort(b.begin(), b.end());
    int sz = b.size();
    if(sz >= 2)
    {
        answer.f_mn = b[0].first;
        answer.f_ct = b[0].second;

        answer.s_mn = b[1].first;
        answer.s_ct = b[1].second;
    }
    else{
        answer.f_mn = answer.s_mn = b[0].first;
        answer.f_ct = b[0].second;
        answer.s_ct = 0;
    }

    return answer;
}

void build(int l, int r, int index)
{
    if(l == r)
    {
        seg[index].f_mn = a[l];
        seg[index].f_ct = 1;
        seg[index].s_mn = INT_MAX;
        seg[index].s_ct = 0;
        return;
    }

    int mid = (l + r)/2;
    build(l, mid, 2*index + 1);
    build(mid + 1, r, 2*index + 2);
    seg[index] = mer(seg[2*index + 1], seg[2*index + 2]);
}

void update(int l, int r, int index, int ind)
{
    if(r < ind or ind < l) return;
    if(l == r and l == ind)
    {
        seg[index].f_mn = a[l];
        seg[index].f_ct = 1;
        seg[index].s_mn = INT_MAX;
        seg[index].s_ct = 0;
        return;
    }

    int mid = (l + r)/2;
    update(l, mid, 2*index + 1, ind);
    update(mid + 1, r, 2*index + 2, ind);
    seg[index] = mer(seg[2*index + 1], seg[2*index + 2]);
}

node query(int l, int r, int ql, int qr, int index)
{
    if(qr < l or r < ql)
    {
        node temp;
        temp.f_mn = INT_MAX;
        temp.f_ct = 0;
        temp.s_mn = INT_MAX;
        temp.s_ct = 0;
        return temp;
    }

    if(ql <= l and r <= qr)
    {
        return seg[index];
    }

    int mid = (l + r)/2;
    return mer(query(l, mid, ql, qr, 2*index + 1), query(mid + 1, r, ql, qr, 2*index + 2));
}

void solve()
{
    int n;
    cin >> n;
    assert(1 <= n and n <= 100000);

    int q;
    cin >> q;
    assert(1 <= q and q <= 100000);

    for(int i = 1 ; i <= n ; i++){
        cin >> a[i];
        assert(1 <= a[i] and a[i] <= 1000000);
    }

    build(1, n, 1);
    int answer = 0;
    while(q--){
        int type;
        cin >> type;
        assert(1 <= type and type <= 2);
        if(type == 1)
        {
            int x, v;
            cin >> x >> v;
            assert(1 <= x and x <= n);
            assert(1 <= v and v <= 1000000);
            a[x] = v;
            update(1, n, 1, x);
        }
        else if(type == 2)
        {
            int l, r;
            cin >> l >> r;
            assert(1 <= l and l < r and r <= n);
            node temp = query(1, n, l, r, 1);

            if(temp.f_ct > 1)
            {
                int cnt = temp.f_ct;
                answer += (((cnt)*(cnt - 1))/2)%mod;
                answer %= mod;
            }
            else{
                int cnt_1 = temp.f_ct;
                int cnt_2 = temp.s_ct;
                answer += (cnt_2*cnt_1)%mod;
                answer %= mod;
            }
        }
    }
    cout << answer << endl;
}

signed main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin >> t;
    assert(1 <= t and t <= 5);
    while(t--){
        solve();
    }
}*/

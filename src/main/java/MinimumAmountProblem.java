import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
1000
575 426 445
72 81 47

output 9400

10
2 2 1
5 5 20

output 20
*/
public class MinimumAmountProblem {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S=Integer.parseInt(br.readLine().trim());
        int cnt1,cnt2,cnt3,cost1,cost2,cost3;
        String[] inp1=br.readLine().split(" ");
        cnt1=Integer.parseInt(inp1[0]);
        cnt2=Integer.parseInt(inp1[1]);
        cnt3=Integer.parseInt(inp1[2]);

        String[] inp2=br.readLine().split(" ");
        cost1=Integer.parseInt(inp2[0]);
        cost2=Integer.parseInt(inp2[1]);
        cost3=Integer.parseInt(inp2[2]);
        int ans=solve(S,cnt1,cnt2,cnt3,cost1,cost2,cost3);
        System.out.println(ans);
    }
    static int solve(int s,int cnt1,int cnt2,int cnt3,int cost1,int cost2,int cost3) {
        //Your code goes here
        int res = Integer.MAX_VALUE;
        for(int i=0;i<=cnt1;i++)
        {
            for(int j=0;j<=cnt2;j++)
            {
                int rem = s-(i*2)-(j*3);
                if(rem>=0 && rem%5==0)
                {
                    rem/=5;
                    if(rem<=cnt3)
                    {
                        long val = (i*cost1)+(j*cost2)+(rem*cost3);
                        if(res>val)
                        {
                            res=(int)val;
                        }
                    }
                }
            }
        }
        return (res==Integer.MAX_VALUE?-1:res);
    }
}

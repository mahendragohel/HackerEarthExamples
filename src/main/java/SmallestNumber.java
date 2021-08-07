
import java.math.BigInteger;
import java.util.*;
/*
* Input
* 23213113313123122133231231313111231323323112132133312113231323---
1121221123213123133333333322111331312231232322122---
32133213133313233123131123131121322211233313212322233313232212222211211313133---
3123131231212323311311332133331322312131213212113113313213212111312132221333---
232221313332121122113111231321221232133311122322233113331123313112333123212122333212232111222---
2231132332233213222123321111131111332231332131222123112233332123131333123212322122221322313---
3211211332321112232---
1221313323322---
22322232133121332311321223323133212121112---
*
* 232121211---
* */

public class SmallestNumber {
    public static void main(String args[] ) throws Exception {

        //Scanner
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while(test > 0){
            solve();
            test--;
        }
    }

    static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = sc.nextLine().split("");

        int cnt1 = 0;
        int cnt2 = 0;
        int flag = n+1;

        for(int i = 0 ; i < n ; i++){
            if(s[i].equals("2")) {
                cnt2++;
            }
            else if(s[i].equals("1") && flag == (n + 1)) {
                cnt1++;
            }
            else if(s[i].equals("3") && flag == (n + 1)) {
                flag = i;
            }
        }

        String answer = "";
        while(cnt1 > 0) {
            answer += "1";
            cnt1--;
        }
        while(cnt2 > 0){
            answer += "2";
            cnt2--;
        }

        for(int i = flag ; i < n ; i++){
            if(s[i].equals("2"))
                continue;
            answer += s[i];
        }
        System.out.println(answer);
    }
}

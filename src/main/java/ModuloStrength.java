import java.math.BigInteger;
import java.util.*;
public class ModuloStrength {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String[] line1 = s.nextLine().split(" ");
        int N = Integer.parseInt(line1[0]);
        int K = Integer.parseInt(line1[1]);
        String[] line2 = s.nextLine().split(" ");
        int[] SP = new int[K];
        long res = 0;
        for(int i=0; i< N; i++){
            SP[Integer.parseInt(line2[i]) % K] = SP[Integer.parseInt(line2[i]) % K] + 1;
        }
        for(int i=0; i<K; i++){
            if(SP[i] > 0){
                long one = SP[i];
                long two = SP[i] - 1;
                res += (one*two);
            }
        }
        System.out.println(res);
    }
}


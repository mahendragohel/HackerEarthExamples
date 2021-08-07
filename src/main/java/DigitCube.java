
import java.util.*;


class DigitCube {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while(T>0){

            long n = sc.nextLong();
            long k = sc.nextLong();
            long res = 0;
            long temp = n;
            int c = 0;
            for(int i=0; i<k; i++){
                c++;
                long sum = sumOfDigits(n);
                res = ((long)Math.pow(sum, 3));
                if(n == res){
                    break;
                }
                if(temp == res){
                    c = c-3;
                    if((k%2!=0 && c%2==0) || (k%2==0 && c%2!=0)) {
                        res = temp;
                    }else {
                        res = n;
                    }
                    break;
                }
                temp = n;
                n = res;
            }

            System.out.println(res);
            T--;
        }

    }

    static long sumOfDigits(long num){
        long sum = 0;
        while(num > 0){
            sum += num%10;
            num = num/10;
        }
        return sum;
    }
}

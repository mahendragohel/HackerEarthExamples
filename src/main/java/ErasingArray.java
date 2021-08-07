import java.util.Scanner;
/*
* input
* 1
* 4
* 0 0 1 0
*
* output 2
* */
public class ErasingArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int N = sc.nextInt();
            sc.nextLine();
            String[] A = sc.nextLine().split(" ");
            int ans = 1;
            for(int j=0; j<N; j++){
                if((j+1)< N && A[j].equals("1") && A[j+1].equals("0")){
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}

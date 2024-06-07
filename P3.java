
import java.util.Scanner;

public class P3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre a number");
        int n = sc.nextInt();
        int ans = 1;
        int count =0;
        for (int i = n; i>=1; i--) {
            ans = ans*i;
        }
        // System.out.println(ans);
        String str = ans + "";
        char[] f = str.toCharArray();
        for (int idx = 0; idx< str.length(); idx++) {
            if(str.charAt(idx)=='0'){
                count++;
            }
        }
        System.out.println(count);
    }
}
import java.util.*;
public class P5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre a:");
        int a = sc.nextInt();
        int ans = 1;
        System.out.print("1,");
        for (int i = 2; i <=a; i++) {
            ans= ans+i;
            System.out.print(ans);
            System.out.print(",");
        }
    }
}
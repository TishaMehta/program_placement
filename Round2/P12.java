import java.util.*;
public class P12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre a n1");
        int n1 = sc.nextInt();
        System.out.println("entre a n2");
        int n2 = sc.nextInt();
         n1 = n1%10;
        n2 = n2%10;
        int ans = n1+n2;
        System.out.println("last digit sum: "+ans);        
    }
}
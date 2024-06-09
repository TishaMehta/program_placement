import java.util.*;

public class Ascending{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n1");
        int n1 = sc.nextInt();
         System.out.println("enter n2");
        int n2 = sc.nextInt();
         System.out.println("enter n3");
        int n3 = sc.nextInt();
        int[] ar = new int[3];
         ar[0] = ((n1>n2)?(n1>n3?n1:n3):(n2>n3?n2:n3));
         ar[1] = ((n1<n2)?(n1<n3?n1:n3):(n2<n3?n2:n3));
         ar[2] = n1+n2+n3-ar[0]-ar[1];
        System.err.println(ar[0]+" "+ar[2]+" "+ar[1]);
    }
}
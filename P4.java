import java.util.*;
public class P4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre a number");
        int n  = sc.nextInt();
        String s1="";

        for (int i = 1; i <= 100; i++) {
             s1 = s1+i +"";
           
        }
         System.out.println(s1);

        System.out.println(s1.charAt(n-1));
        

    }
}
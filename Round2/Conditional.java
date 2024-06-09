import java.util.*;
public class Conditional{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("entrea a:");
        int a = sc.nextInt();
         System.out.println("entrea b:");
        int b = sc.nextInt();
         System.out.println("entrea c:");
        int c = sc.nextInt();
        int ans = ((a>b)?(a>c?a:c):(b>c?b:c));
        System.out.println("gretest number:"+ans);
   
    }
}
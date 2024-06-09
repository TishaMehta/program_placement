import java.util.*;
public class Palindrom{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre a number:");
        int a = sc.nextInt();

        int temp =a,ans =0;
        while(a>0){
            int no = a%10;
            ans = ans*10+no;
            a = a/10;
        }
        if(ans == temp){
            System.out.println("number is palidrom");
        }
        else{
            System.out.println("number is not palidrom");
        }
    }
}
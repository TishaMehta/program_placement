import java.util.*;
public  class P4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre a number");
        int n= sc.nextInt();
        if((n&1)==1){
            System.out.println("numer is odd");
        }
        else{
            System.out.println("number is even");
        }
    }
}
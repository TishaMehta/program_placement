import java.util.*;
public  class PrimeOrNot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre a :");
        int a = sc.nextInt();
        boolean flag = false;
        for (int i =0; i < a; i++) {
            if(a%2 ==0){
                flag =true;
            }
        }
        if(flag==true){
            System.out.println(a+" is not prime");
        }
        else{
            System.out.println(a+" is prime");
        }
    }
}
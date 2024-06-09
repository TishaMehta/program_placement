import java.util.*;
public class P6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre a array length:");
        int n= sc.nextInt();
        int[] arr = new int[n];
        int iseven = 0, isOdd = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]%2==0){
                iseven = iseven+arr[i];
            }
            else{
                isOdd = isOdd+arr[i];
            }
        }
         
         System.out.println("Even number sum:"+iseven);
            
            System.out.println("odd number sum:"+isOdd);

       
    }
}
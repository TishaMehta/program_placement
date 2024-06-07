import java.util.*;
public class RemoveDuplicate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre a number");
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
                Arrays.sort(arr);
        System.out.println("Arrays");
        System.out.println(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                System.out.println(arr[i]);
            }
        }
    }
}
import java.util.*;
class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("haystack = ");
       String haystack = sc.next();
        System.out.println("needle = ");
       String needle = sc.next();
       boolean flag = false;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Check if the substring of haystack starting from i matches needle
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                System.out.println(i);
                flag = true;
                break;
            }
           
        }
        if(flag==false){
        System.out.println("-1");

        }
    }
}

import java.util.Scanner;

public class  StringPattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre a string");
        String word = sc.next();
        for (int i = 1; i <= word.length(); i++) {
            System.out.println(word.substring(0, i));
        }
    }
}
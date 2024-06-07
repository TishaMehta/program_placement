import java.util.*;
public class BillAmount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre a unit consumed");
        int unit = sc.nextInt();
        double billAMount =0;
        if(unit<=200){
            billAMount = unit*0.8;
        }
        else if (unit<=300) {
            billAMount = 200*0.8 + (unit-200)*0.9;
        }
        else{
            
            billAMount = 200*0.8 + 100 *0.9 + (unit-300)*1;
        }
        if(billAMount>300){
            billAMount += billAMount*0.1236;
        }
        System.out.println(billAMount);
    }
}
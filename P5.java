import java.util.*;
public class P5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("entre a binary number:");
        String binary = sc.nextLine();
        double decimal  = binaryToDecimal(binary);
        System.out.println(decimal);

    }
    static double binaryToDecimal(String binary){
        String[] parts = binary.split("\\.");  
        String integerPart = parts[0];
        String fractionalPart = parts.length > 1 ? parts[1] : "";

        int intValue = Integer.parseInt(integerPart,2);

        double fractionalvalue = 0;
        for (int i = 0; i < fractionalPart.length(); i++) {
           char bit = fractionalPart.charAt(i);
            if (bit == '1') {
                fractionalvalue += Math.pow(2, -(i+1));
            }
        }

       double decimalValue = intValue + fractionalvalue ;
        return decimalValue; 
        }
}

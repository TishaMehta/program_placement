public class P7{
    public static void main(String[] args) {
        int a =150;
        int b= 445;
        for (int i = a; i <=b; i++) {
            if(i%2!=0 && i%7==0 && i%3!=0){
                System.out.println(i);
            }
        }        
    }
}
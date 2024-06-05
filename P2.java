public class P2{
    public static void main(String[] args) {
        String[] oprations= {"MinStack","push","push","push","getMin","pop","top","getMin"};
        String[] values = {"[]","-2","0","-3","[]","[]","[]","[]"};
        String[] ans = new String[oprations.length];
        int i = 0;
        MinStack ms = new MinStack();
        for (String string : oprations) {
            switch (string) {
                case "MinStack":
                     ms = new MinStack();
                     ans[i] = "null";
                     i++;
                     break;
                case "push":
                    ms.push(Integer.parseInt(values[i]));
                    ans[i] = "null";
                    i++;
                    break;
                case "pop":
                    ms.pop();
                    ans[i] = "null";
                    i++;
                    break;
                case "top":
                    ans[i] = ms.top() + "";  
                    i++;
                    break;
                case "getMin":
                    ans[i] = ms.getMin()+"";
                    i++;
                    break;
                default:
                    throw new AssertionError();

                    
            }
        }
        System.out.print("oprations : [");
        for (String string : oprations) {
            System.out.print(string + ",");
            string = string.substring(0, string.length() - 1);  // Remove the last character
            
        }
        System.out.println("]");

        System.out.print("values : [");
        for (String string : values) {
            System.out.print(string +",");
            string =  string.substring(0,string.length() -1);
            
        }
        System.out.println("]");
         System.out.print("Output    : [");
        for (String string : ans) {
            System.out.print(string + ",");
            if (string.endsWith(",")) {
                string = string.substring(0, string.length() - 1);  // Remove the last character
            }
        }
        System.out.println("]");
   

    }
}
 class MinStack{
    int top = -1;
    int[] st = new int[200];

    public void push(int n){
        top++;
        st[top] = n;
    }

    public int  top(){
        return st[top];
    }

    public void pop(){
        int t = st[top];
        top--;
    }

    public int  getMin(){
        int min = st[0];
        for(int i=0;i<=top;i++){
            if(min>st[i]){
                min = st[i];

            }
           
        }
        return min;
    }

}
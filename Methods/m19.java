import java.util.*;

class Main {

    static String showNumbers(int n) {
       
       StringBuilder string=new StringBuilder();
       for(int i=0;i<=n;i++)
       {
           if(i%2==0)
           {
               string.append(i).append(" EVEN").append("\n");
           }
           else{
               string.append(i).append(" ODD").append("\n");
           }
           
       }
       return string.toString();
       
       
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       String store=showNumbers(n);
     System.out.println(store);   

    }
}
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long A=sc.nextLong();
        long B=sc.nextLong();
       while(A>0 || B>0)
       {
           long s=A%10;
           long q=B%10;
           if((s+q)>=10)
           {
              System.out.println("Hard");
              System.exit(0);
           }
           A=A/10;
           B=B/10;
       }
       System.out.println("Easy");
    }
}
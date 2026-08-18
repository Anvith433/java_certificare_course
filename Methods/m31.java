import java.util.*;
class main{
    public static int Pow(int A,int B)
    {
         double a=Math.pow(A,B);
         int d=(int) a;
         return d;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int value=Pow(A,B);
        System.out.println(value);
    }
    
}
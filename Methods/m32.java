import java.util.*;
class main{
    public static long Factorial(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else 
        {
            return n*Factorial(n-1);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long val=Factorial(n);
        
        System.out.println(val);
    }
}
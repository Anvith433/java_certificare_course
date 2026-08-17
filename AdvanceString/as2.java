import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       double p=0;
       double s=0;
       for(int i=1;i<=N;i++)
       {
           p=p+2*Math.pow(10,i-1);
           s+=p;
       }
       long k=(long)s;
       System.out.println(k);
    }
}
import java.util.Scanner;
class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long N=sc.nextInt();
        long s=0;
        for(long i=1;i<=N;i++)
        {
            if(i%2==0)
            {
            s+=i;
            }
        }
        System.out.print(s);
    }
}
import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int M=sc.nextInt();
        int N=sc.nextInt();
        int s=0;
        for(int i=M;i<=N;i++)
        {
            if(i%T==0)
            {
                s+=i;
            }
        }
        System.out.printf("%d",s);
        
    }
}
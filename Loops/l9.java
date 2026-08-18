import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        long M=s.nextInt();
        long N=s.nextInt();
        long sh=0;
        for(long i=M;i<=N;i++)
        {
            sh+=i;
        }
        System.out.printf("%d",sh);
    }
}
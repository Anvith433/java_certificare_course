import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        int s=1;
        for(int i=1;i<=M;i++)
        {
            for(int j=1;j<=N;j++)
            {
                System.out.printf("%d ",s);
                s=s+1;
            }
            System.out.println();
        }
    }
}
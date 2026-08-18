import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        for(int i=1;i<=K;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.printf("%d ",N);
                N=N+1;
            }
            System.out.println();
        }
    }
}
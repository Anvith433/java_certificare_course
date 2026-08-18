import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
          int c=(N)+((K*(K+1))/2)-1;
        for(int i=1;i<=K;i++)
        {
            for(int j=1;j<=i;j++)
            {
               System.out.printf("%d ",c);
               c--;
            }
            System.out.println();
        }
    }
}
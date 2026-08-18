import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=N;i++)
        {
            int s=1;
            for(int j=1;j<=i;j++)
            {
                
                System.out.printf("%d ",s);
                s=s+1;
            }
            System.out.println();
        }
    }
}
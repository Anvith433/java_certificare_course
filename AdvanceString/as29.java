import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        for(int i=1;i<=M;i++)
        {
            if(i%2!=0)
            {
            for(int j=1;j<=N;j++)
            {
                System.out.print("+ ");
            }
            System.out.println();
        }
        else 
        {
           for(int j=1;j<=N;j++)
            {
                System.out.print("- ");
            }
            System.out.println();
        } 
        }
    }
}
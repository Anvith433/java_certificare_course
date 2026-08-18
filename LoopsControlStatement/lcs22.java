import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=(2*N)+1;i++)
        {
            if(i==1 || i==(2*N)+1 || i==N+1)
            {
                for(int j=1;j<=N;j++)
                {
                    System.out.printf("* ");
                }
                System.out.println();
            }
            else 
            {
                for(int j=1;j<=N;j++)
                {
                    if(j==1 || j==N)
                    {
                        System.out.print("* ");
                    }
                    else 
                    {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        
        }
    }
}
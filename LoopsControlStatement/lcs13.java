import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=N;i++)
        {
            int c=1;
            if(i==N)
            {
            for(int j=1;j<=N;j++)
            {
                System.out.printf("%d ",c);
                c++;
            }
            System.out.println();
            }
            else 
            {
                int d=1;
                for(int j=1;j<=N;j++)
                {
                    if(j<N-i+1)
                    {
                        System.out.print(" ");
                    }
                    else 
                    {
                        System.out.printf("%d ",d);
                        d++;
                    }
                }
                System.out.println();
            }
            
        }
    }
}
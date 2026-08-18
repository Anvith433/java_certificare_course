import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        if(M<N)
        {
            for(int i=M;i>0;i--)
            {
                if(M%i==0 && N%i==0)
                {
                    System.out.print(i);
                    System.exit(0);
                }
            }
            
        }
        else if(M>N)
        {
            for(int i=N;i>0;i--)
            {
                if(N%i==0 && M%i==0)
                {
                    System.out.print(i);
                    System.exit(0);
                }
                
            }
        }
        else if(M==N)
        {
            System.out.print(M);
        }
        }
    }

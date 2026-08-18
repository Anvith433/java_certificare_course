import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=(2*N)-1;i++)
        {
            if(i==N)
            {
                for(int j=1;j<=N;j++)
                {
                    System.out.printf("%d ",j);
                }
                System.out.println();
            }
            else if(i<N){
                int k=1;
                for(int j=1;j<=N;j++)
                {
                    
                    if(j>=N-i+1)
                    {
                        System.out.printf("%d ",k);
                        k++;
                    }
                    else 
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            else 
            {   
                int u=1;
            for(int j=1;j<=N;j++)
            {
                
                if(j>=i-N+1)
                {
                    System.out.printf("%d ",u);
                    u++;
                }
                else 
                {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
            }
        }
    }
}
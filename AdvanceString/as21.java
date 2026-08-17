import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=(2*N)-1;i++)
        {
            
                if(i==1 || i==(2*N)-1)
                {
                    for(int o=1;o<=(2*N)-1;o++)
                    {
                        if(o==N)
                        {
                        System.out.print("*");
                        }
                        else 
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                    
                }
                else if(i<N){
                    for(int k=1;k<=N;k++)
                    {
                        if(k>=N-i+1)
                        {
                            System.out.print("* ");
                        }
                        else 
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                else if(i==N)
                {
                    for(int x=1;x<=N;x++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                else 
                {
                    for(int l=1;l<=N;l++)
                    {
                        if(l>=i-N+1)
                        {
                            System.out.print("* ");
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
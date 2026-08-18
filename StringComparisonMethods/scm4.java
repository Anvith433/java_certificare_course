import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        char S='A';
        
        for(int i=1;i<=(2*N)-1;i++)
        {
            if(i<=N)
            {
                for(int j=1;j<=(2*N)-1;j++)
                {
                    if(j==(N-i+1) || j==(N+i-1))
                    {
                        System.out.print(S);
                    }
                    else 
                    {
                        System.out.print(" ");
                    }
                }
            
                S++;
                System.out.println();
            }
            else 
            {
                S= (char) (65+(N-1)-(i-N));
                for(int j=1;j<=(2*N)-1;j++)
                {
                    if(j==(i-N+1) || j==(2*N)-(i-N)-1)
                    {
                        System.out.print(S);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                
                
                System.out.println();
            }
        }
    }
}
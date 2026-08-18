import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        
        for(int i=0;i<N;i++){
            int A=sc.nextInt();
            int c=0;
            if(A==1)
            {
                continue;
            }
    
                int M=(int) Math.sqrt(A);
                for(int j=2;j<=M;j++)
                {
                    
                    if(A%j==0)
                    {
                        c++;
                        break;
                    }
                }
            
                if(c==0)
                {
                    System.out.print(A);
                    System.exit(0);
                }
            }
        }
}
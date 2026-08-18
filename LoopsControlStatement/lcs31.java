import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        for(int i=M;i<=N;i++)
        {
            int c=0;
            int a=(int) Math.sqrt(i);
            for(int j=2;j<=a;j++)
            {
                if(i%j!=0)
                {
                    c++;
                }
            }
            if(c==a-1)
            {
                if(i==1)
                {
                    System.out.print(i+1);
                    System.exit(0);
                }
                else 
                {
                    System.out.print(i);
                    System.exit(0);
                }
                
                
            }
        }
        System.out.println("No prime numbers in the given range");
    }
}
import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=0;
        
        for(int i=1;i<=N;i++)
        {
            int c=0;
            for(int j=2;j<=10;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==0)
            {
                K++;
            }
        }
        System.out.print(K);
    }
}
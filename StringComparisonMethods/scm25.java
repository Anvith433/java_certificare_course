import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int e=0;
        for(int i=A;i<=B;i++)
        {
            int c=0;
            int sum=0;
            int S=i;
            int X=S;
            while(S!=0)
            {
                S=S/10;
                c++;
            }
            int T=X;
            while(X!=0)
            {
                int f=X%10;
                sum+=Math.pow(f,c);
                X=X/10;
            }
            if(sum==T)
            {
                System.out.print(T+" ");
                e++;
            }
            
        }
        if(e==0)
        {
            System.out.print("-1");
        }
        
    }
}
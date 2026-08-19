import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] s=new int[N];
        for(int i=0;i<N;i++)
        {
            s[i]=sc.nextInt();
        }
        int p=sc.nextInt();
        for(int i=0;i<p;i++)
        {
            int x=sc.nextInt();
            int v=sc.nextInt();
            int sum=0;
            for(int j=0;j<N;j++)
            {
                if(s[j]>=x && s[j]<=v)
                {
                    sum=sum+s[j];
                }
            }
            System.out.println(sum);
        }
    }
}
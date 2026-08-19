import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long[] pyramids=new long[N];
        for(int i=0;i<N;i++)
        {
            pyramids[i]=sc.nextLong();
        }
        int j=0;
        long min=Integer.MAX_VALUE;
        while(j!=N)
        {
        for(int i=j+1;i<N;i++)
        {
            if(Math.abs(pyramids[j]-pyramids[i])<min)
            {
                min=Math.abs(pyramids[j]-pyramids[i]);
            }
        }
        j++;
    }
    System.out.println(min);
    }
}
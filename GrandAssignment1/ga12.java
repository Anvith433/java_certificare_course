import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Q=sc.nextInt();
        int[] heights=new int[N];
        for(int i=0;i<N;i++)
        {
            heights[i]=sc.nextInt();
        }
        for(int i=0;i<Q;i++)
        {
            int X=sc.nextInt();
            int count=0;
            for(int j=0;j<N;j++)
            {
                if(heights[j]>=X)
                {
                    count++;
                }
            }
            System.out.println(count);
       
        }
    }
}
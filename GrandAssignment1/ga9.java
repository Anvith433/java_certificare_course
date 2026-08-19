import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=3;
        int[][] arr=new int[N][M];
        int[] result=new int[3];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<N;i++)
        {
            int add=0;
            for(int j=0;j<M;j++)
            {
                add=add+arr[i][j];
            }
            if(add>maxsum)
            {
                maxsum=add;
                for(int j=0;j<M;j++)
                {
                    result[j]=arr[i][j];
                }
            }
        }
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
       
        
    }
}
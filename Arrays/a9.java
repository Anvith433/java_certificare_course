import java.util.Arrays;
import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        int[][] array=new int[M][N];
        int Minimum=Math.min(M,N);
        int[] arr=new int[Minimum];
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(i==j)
                {
                    arr[i]=array[i][j];
                    
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
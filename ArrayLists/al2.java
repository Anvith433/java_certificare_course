import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        int[][] arr=new int[M][N];
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<M;i++)
        {
             int[] arr11=new int[i+1];
            for(int j=0;j<N;j++)
            {
                if(j<=i)
                {
                arr11[j]=arr[i][j];
            }
            else {
                break;
            }
            }
            System.out.println(Arrays.toString(arr11));
        }
    }
}
import java.util.Arrays;
import java.util.Scanner;
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
         for(int j=0;j<N;j++)
         {
             for(int i=0;i<M;i++)
             {
                 System.out.print(arr[i][j]+" ");
             }
             System.out.println();
         }
    }
}
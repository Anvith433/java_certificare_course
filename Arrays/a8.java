import java.util.Arrays;
import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        int[][] Arr=new int[M][N];
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                Arr[i][j]=sc.nextInt();
                
            }
        }
        int A=sc.nextInt();
        int B=sc.nextInt();
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(Arr[i][j]==A)
                {
                    System.out.print(B+" ");
                }
                else 
                {
                    System.out.print(Arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
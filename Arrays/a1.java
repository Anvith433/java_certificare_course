import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
         int X=sc.nextInt();
        int Y=sc.nextInt();
        int[][] array=new int[M][N];
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
       
      System.out.println(array[X][Y]);
        
        
        
    }
}
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[][] matrix=new int[N][N];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        int upperSum=0;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N-i;j++)
            {
                upperSum+=matrix[i][j];
            }
        }
        int lowerSum=0;
        for(int i=0;i<N;i++)
        {
            for(int j=N-1;j>=N-i-1;j--)
            {
                lowerSum+=matrix[i][j];
            }
        }
        System.out.println(upperSum);
        System.out.println(lowerSum);
    }
}
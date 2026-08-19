import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        int[][] matrix=new int[M][N];
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<M;i++)
        {
                for(int j=0;j<N;j++)
                {
                    if(i==0 || i==M-1 || j==0 || j==N-1)
                    {
                        sum+=matrix[i][j];
                    }
                    else 
                    {
                        continue;
                    }
                }
            }
            System.out.println(sum);
            
        }
    }

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        int[][] arr=new int[M][N];
        
        ArrayList<Integer> min=new ArrayList<>();
        ArrayList<Integer> max=new ArrayList<>();
        ArrayList<Integer> cols=new ArrayList<>();
        
        for(int i=0;i<M;i++)
        {
           
            for(int j=0;j<N;j++)
            {
               arr[i][j]=sc.nextInt(); 
            }
        }
        for(int i=0;i<N;i++)
        {
            int s=0;
            
            int MIN=Integer.MAX_VALUE;
            int MAX=Integer.MIN_VALUE;
            for(int j=0;j<M;j++)
            {
                s+=arr[j][i];
             if(arr[j][i]<MIN)
             {
                 MIN=arr[j][i];
             }
             if(arr[j][i]>MAX)
             {
                 MAX=arr[j][i];
             }
        }
        min.add(MIN);
        max.add(MAX);
        cols.add(s);
        
        
    }
    System.out.println(max);
    System.out.println(min);
    System.out.println(cols);
    
}
}
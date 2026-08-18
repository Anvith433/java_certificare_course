import java.util.*;
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
      int[] arr1=new int[M];
      int[] arr2=new int[M];
      int[] arr3=new int[M];
      for(int i=0;i<M;i++)
      {
          int max=arr[i][0];
          int min=arr[i][0];
          int sum=arr[i][0];
          for(int j=1;j<N;j++)
          {
             sum+=arr[i][j];
             if(arr[i][j]<min)
             {
                 min=arr[i][j];
             }
             if(arr[i][j]>max)
             {
                 max=arr[i][j];
             }
          }
          arr1[i]=min;
          arr2[i]=max;
          arr3[i]=sum;
      }
      System.out.println(Arrays.toString(arr2));
      System.out.println(Arrays.toString(arr1));
      System.out.println(Arrays.toString(arr3));
    }
}
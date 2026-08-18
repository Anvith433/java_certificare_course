import java.util.*;
class main{
    public static void Sort(int[] arr)
    {
        int a=arr.length;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static int KthSmallestNumber(int []arr,int K)
    {
        int a=arr.length;
        return arr[K-1];
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] arr1=s.split(",");
        int K=sc.nextInt();
        int[] arr=new int[arr1.length];
        for(int i=0;i<arr1.length;i++)
        {
            arr[i]=Integer.parseInt(arr1[i]);
        }
        Sort(arr);
        int value=KthSmallestNumber(arr,K);
        System.out.println(value);
    }
}
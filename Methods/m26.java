import java.util.*;
class main{
    public static void Sort(int []arr)
    {
        int a=arr.length;
        for(int i=0;i<a-1;i++)
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
    public static int KthLargest(int[] arr,int K)
    {
        int b=arr.length;
        return arr[b-K];
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Integer K=sc.nextInt();
        String[] ss=s.split(",");
        int[] arr=new int[ss.length];
        for(int i=0;i<ss.length;i++)
        {
            arr[i]=Integer.parseInt(ss[i]);
        }
        Sort(arr);
        int val=KthLargest(arr,K);
        System.out.println(val);
    }
}
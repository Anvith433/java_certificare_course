import java.util.*;
class main{
    public static int Diff(int[] arr)
    {
        int a=arr.length;
        int MAX=arr[0];
        int MIN=arr[0];
        for(int i=1;i<a;i++)
        {
            if(arr[i]>MAX)
            {
                MAX=arr[i];
            }
            if(arr[i]<MIN)
            {
                MIN=arr[i];
            }
        }
        return MAX-MIN;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] arr1=s.split(",");
        int[] arr=new int[arr1.length];
        for(int i=0;i<arr1.length;i++)
        {
            arr[i]=Integer.parseInt(arr1[i]);
        }
        int val=Diff(arr);
        System.out.println(val);
    }
}
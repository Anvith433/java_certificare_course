import java.util.*;
class main{
    public static int SmallestNum(int[] arr)
    {
        int a=arr.length;
        int small=arr[0];
        for(int i=1;i<a;i++)
        {
            if(arr[i]<small)
            {
                small=arr[i];
            }
        }
        return small;
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
        int value=SmallestNum(arr);
        System.out.println(value);
    }
    
}
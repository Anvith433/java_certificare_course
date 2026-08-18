import java.util.Scanner;

class main{
    public static int LargestElement(int []arr2)
    {
        int a=arr2.length;
        int large=arr2[0];
        for(int i=1;i<a;i++)
        {
            if(arr2[i]>large)
            {
                large=arr2[i];
            }
        }
        return large;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String se=sc.nextLine();
        String[] arr1=se.split(",");
        int[] arr2=new int[arr1.length];
        for(int i=0;i<arr1.length;i++)
        {
            arr2[i]=Integer.parseInt(arr1[i]);
        }
        int val=LargestElement(arr2);
        System.out.println(val);
    }
}
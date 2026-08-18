import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        int[] arr1=new int[4];
        int k=0;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            if(i==0 ||i==1 || i==N-2 || i==N-1)
            {
                arr1[k]=arr[i];
                k++;
            }
        }
        System.out.print(Arrays.toString(arr1));
    }
}
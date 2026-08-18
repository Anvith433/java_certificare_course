import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int T=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<T;i++)
        {
            int S=sc.nextInt();
            System.out.println(arr[S]);
        }
            
        }
    }

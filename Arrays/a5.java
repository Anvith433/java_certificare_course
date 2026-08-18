import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.nextLine();
        int B=N;
        String[] arr=new String[N];
        for(int i=0;i<N;i++)
        {
           arr[i]=sc.nextLine();
            
        }
        
        for(int i=B-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}
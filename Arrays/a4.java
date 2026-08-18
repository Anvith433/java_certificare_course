import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        int[] array=new int[N];
        for(int i=0;i<N;i++)
        {
            array[i]=M;
            
        }
        System.out.println(Arrays.toString(array));
        
    }
}
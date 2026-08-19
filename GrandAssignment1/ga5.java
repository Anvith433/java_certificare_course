import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
       
        int[] s=new int[N];
        for(int i=0;i<N;i++)
        {
            s[i]=sc.nextInt();
        }
        int S=sc.nextInt();
        for(int i=S;i<N;i++)
        {
            System.out.print(s[i]+" ");
        }
        System.out.println();
        for(int i=0;i<N-S;i++)
        {
            System.out.print(s[i]+" ");
        }
        System.out.println();
    }
}
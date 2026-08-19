import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] nums=new int[M];
        for(int i=0;i<M;i++)
        {
            nums[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<M;i++)
        {
            if((i+1)%N==0)
            {
                sum+=nums[i];
            }
        }
        System.out.println(sum);
    }
}
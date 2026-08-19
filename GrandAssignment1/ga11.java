import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] nums=new int[N];
        for(int i=0;i<N;i++)
        {
            if(i%2!=0)
            {
                nums[i]=1;
            }
            else 
            {
                nums[i]=0;
            }
        }
        int k=0;
        while(k!=N)
        {
        for(int i=0;i<N;i++)
        {
           if(nums[i]==0)
           {
               nums[i]=1;
               System.out.print(1+" ");
           }
           else if(nums[i]==1)
           {
               nums[i]=0;
               System.out.print(0+" ");
           }
        }
        System.out.println();
        k++;
    }
}
}
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] nums=new int[N];
        for(int i=0;i<N;i++)
        {
            nums[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int min=0;
        int max=0;
        for(int i=0;i<N;i++)
        {
            if(map.get(nums[i])==1 && min==0 )
            {
                min=nums[i];
            }
            else if(map.get(nums[i])>1 && max==0)
            {
                max=nums[i];
            }
        }
        if(min==0 && max!=0)
        {
            System.out.println("None");
            System.out.println(max);
        }
        else if(min!=0 && max==0)
        {
            System.out.println(min);
            System.out.println("None");
        }
        else if(min!=0 && max!=0)
        {
            System.out.println(min);
             System.out.println(max);
        }
        
    }
}
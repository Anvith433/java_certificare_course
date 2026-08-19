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
        for(int k : map.keySet())
        {
            if(map.get(k)==1)
            {
                System.out.println(k);
            }
            
        }
    }
}
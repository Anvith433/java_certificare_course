import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=N;i++)
        {
            map.put(i,i*i);
        }
        for(int key:map.keySet())
        {
            System.out.println(key+": "+map.get(key));
        }
    }
}
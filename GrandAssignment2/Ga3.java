import java.util.*;
class Main{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int F=sc.nextInt();
    int[] numbers=new int[F];
    for(int i=0;i<F;i++)
    {
        numbers[i]=sc.nextInt();
    }
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<numbers.length;i++)
    {
        map.put(numbers[i],map.getOrDefault(numbers[i],0)+1);
    }
    int friend=-1;
    int enemy=-1;
    for(int i=1;i<=F;i++)
    {
        if(!map.containsKey(i))
        {
            friend=i;
        }
        else if(map.get(i)>1)
        {
            enemy=i;
        }
    }
    
    System.out.print(enemy+" ");
    System.out.println(friend);
}
}
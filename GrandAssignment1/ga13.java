import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<s.length();i++)
      {
          Integer val=Integer.parseInt(s.substring(i,i+1));
          map.put(val,map.getOrDefault(val,0)+1);
      }
        int count=0;
        for(int key:map.keySet())
        {
            if(map.get(key)>1)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
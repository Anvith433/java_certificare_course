import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String names=sc.nextLine();
        String ids=sc.nextLine();
        String[] namess=names.split(",");
        String[] idss=ids.split(",");
        TreeMap<String,String> map=new TreeMap<>();
        for(int i=0;i<namess.length;i++)
        {
            map.put(namess[i],idss[i]);
        }
        for(String key:map.keySet())
        {
            System.out.println(key+":"+map.get(key));
        }
    }
}
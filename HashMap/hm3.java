import java.util.*;

class Main {
    public static void main(String[] args) { 
        
        String[] names = {"Ram","Naresh","Vani","Rahim","Deepak"};
        String[] games = {"Cricket","Football","Tennis","Cricket","Boxing"};
        Scanner sc=new Scanner(System.in);
        String keyy=sc.next();
        TreeMap<String,String> map=new TreeMap<>();
        for(int i=0;i<names.length;i++)
        {
            map.put(names[i],games[i]);
        }
        map.remove(keyy);
        for(String key:map.keySet())
        {
            System.out.println(key+":"+map.get(key));
        }
        
    }
}
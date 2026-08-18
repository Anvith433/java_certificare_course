import java.util.*;

class Main {
    public static void main(String[] args) { 
        
        String[] names = {"Ram","Naresh","Vani","Rahim","Deepak"};
        String[] games = {"Cricket","Football","Tennis","Cricket","Boxing"};
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] ss=s.split(" ");
        TreeMap<String,String> map=new TreeMap<>();
         for(int i=0;i<names.length;i++)
         {
             map.put(names[i],games[i]);
         }
         map.put(ss[0],ss[1]);
         for(String key:map.keySet())
         {
             System.out.println(key+":"+map.get(key));
         }
    }
}
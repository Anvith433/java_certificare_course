import java.util.*;
class Main {
    public static void main(String[] args) { 
        
        String[] names = {"Ram","Naresh","Vani","Rahim"};
        String[] games = {"Cricket","Football","Tennis","Cricket"};
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        TreeMap<String,String> map=new TreeMap<>();
        for(int i=0;i<names.length;i++)
        {
            map.put(names[i],games[i]);
        }
        for(int i=0;i<num;i++)
        {
            String s=sc.nextLine();
            String[] ss=s.split(" ");
            map.put(ss[0],ss[1]);
        }
        for(String key:map.keySet())
        {
            System.out.println(key+":"+map.get(key));
        }

    }
}
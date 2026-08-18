import java.util.HashMap;
import java.util.*;
class Main {
    public static void main(String[] args) { 
        String[] names = { "Ram", "Naresh", "Vani", "Rahim" };
        String[] games = { "Cricket", "Football", "Tennis", "Cricket" };
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       String[] arr=s.split(" ");
       TreeMap<String,String> map=new TreeMap<>();
       for(int i=0;i<names.length;i++)
       {
           map.put(names[i],games[i]);
       }
       map.put(arr[0],arr[1]);
       for(String key:map.keySet())
       {
           System.out.println(key+":"+map.get(key));
       }
        
    }
}
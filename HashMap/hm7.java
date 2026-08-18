import java.util.*;
class Main {
    public static void main(String[] args) { 
        String[] fruits = { "apples", "bananas", "mangoes", "oranges", "watermelons" };
        Integer[] quantities = { 10, 20, 15, 200, 50 };
        Scanner sc=new Scanner(System.in);
        String existingName=sc.next();
        String newName=sc.next();
        TreeMap<String,Integer> map=new TreeMap<>();
        for(int i=0;i<fruits.length;i++)
        {
            map.put(fruits[i],quantities[i]);
        }
        int value=map.get(existingName);
        map.remove(existingName);
        map.put(newName,value);
        for(String key:map.keySet())
        {
            System.out.println(key+" "+map.get(key));
        }
    }
}
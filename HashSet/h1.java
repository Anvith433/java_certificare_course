import java.util.*;
class Main{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       String[] name=sc.nextLine().split(",");
       HashSet<Integer> set1=new HashSet<>();
       for(String nam:name)
       {
           set1.add(Integer.parseInt(nam.trim()));
       }
       String[] name1=sc.nextLine().split(",");
       HashSet<Integer> set2=new HashSet<>();
       for(String namm:name1)
       {
           set2.add(Integer.parseInt(namm.trim()));
       }
       set1.retainAll(set2);
       ArrayList<Integer> commonList=new ArrayList<>(set1);
       Collections.sort(commonList);
       System.out.println(commonList);
    }
}
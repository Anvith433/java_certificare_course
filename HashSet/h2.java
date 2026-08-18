import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String[] name=sc.nextLine().split(" ");
        HashSet<Integer> sett=new HashSet<>();
        for(String namm:name)
        {
            sett.add(Integer.parseInt(namm.trim()));
        }
        ArrayList<Integer> arrlist=new ArrayList<>(sett);
        Collections.sort(arrlist);
        System.out.println(arrlist);
        
    }
}
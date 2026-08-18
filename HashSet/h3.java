import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Integer[] arrayItems = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        HashSet<Integer> setItems = new HashSet<Integer>();
        setItems.addAll(Arrays.asList(arrayItems));
        Scanner sc=new Scanner(System.in);
        String[] name=sc.nextLine().split(" ");
        HashSet<Integer> setItems1 = new HashSet<Integer>();
        for(String rr:name)
        {
            setItems1.add(Integer.parseInt(rr.trim()));
        }
        setItems.removeAll(setItems1);
        ArrayList<Integer> arrlist=new ArrayList<>(setItems);
        Collections.sort(arrlist);
        System.out.println(arrlist);
    }
}
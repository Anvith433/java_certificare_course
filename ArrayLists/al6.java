import java.util.*;
class Main{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrList= new ArrayList<>();
        arrList.add(2);
        arrList.add(4);
        arrList.add(6);
        arrList.add(8);
        arrList.add(10);
        arrList.add(12);
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        arrList.add(a);
        System.out.println(arrList);
    }
}
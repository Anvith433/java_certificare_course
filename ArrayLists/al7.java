import java.util.*;
class Main{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrList=new ArrayList<>();
        arrList.add(10);
        arrList.add(20);
        arrList.add(40);
        arrList.add(50);
        arrList.add(60);
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int index=sc.nextInt();
        arrList.add(index,a);
        System.out.println(arrList);
    }
}
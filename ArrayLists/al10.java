import java.util.*;
class Main{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrList=new ArrayList<>(Arrays.asList(5,10,20,35,5,50,20,100,200,10,150,100,100));
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i=0;
      arrList.removeIf(item->item==N);
        System.out.println(arrList);
    }
}
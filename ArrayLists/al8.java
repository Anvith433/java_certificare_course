import java.util.*;
class Main{
    public static void main(String[] args)
    {
       ArrayList<Integer> arrList=new ArrayList<>();
       arrList.add(10);
       arrList.add(20);
       arrList.add(30);
       arrList.add(40);
       arrList.add(50);
       arrList.add(60);
       arrList.add(70);
       arrList.add(80);
       arrList.add(90);
       arrList.add(100);
       int Len=arrList.size();
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       for(int i=1;i<=N;i++)
       {
           arrList.remove(Len-1);
           Len--;
       }
       System.out.println(arrList);
       
    }
}
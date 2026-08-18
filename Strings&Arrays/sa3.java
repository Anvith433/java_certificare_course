import java.util.*;
class List
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         String num=sc.nextLine();
        String[] numbers=num.split(" ");
       int sum=0;
       for(int i=0;i<numbers.length;i++)
       {
           int numss=Integer.parseInt(numbers[i]);
           sum=sum+numss;
       }
       System.out.println(sum);
        
    }
}
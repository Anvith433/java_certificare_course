import java.util.*;
class main{
    public static void Operations(String s)
    {
        int sum=0;
        int MAX=Integer.MIN_VALUE;
        int MIN=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++)
        {
          if(s.charAt(i)=='0'|| s.charAt(i)=='1' || s.charAt(i)=='2' || s.charAt(i)=='3' || s.charAt(i)=='4' || s.charAt(i)=='5' || s.charAt(i)=='6' || s.charAt(i)=='7' || s.charAt(i)=='8' || s.charAt(i)=='9')
          {
              int n=s.charAt(i)-'0';
              if(n > MAX)
              {
                  MAX=n;
              }
              if(n < MIN)
              {
                  MIN=n;
              }
              sum+=n;
          }
        }
        System.out.println(sum);
        System.out.println(MIN);
        System.out.println(MAX);
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Operations(s);
        
    }
}
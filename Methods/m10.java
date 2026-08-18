import java.util.*;
class Main {

    static void CountOfLowercaseAndUppercaseLetters(String str)
    {
        int UpCount=0;
        int DownCount=0;
       int len=str.length();
       for(int i=0;i<len;i++)
       {
           if(Character.isUpperCase(str.charAt(i)))
           {
               UpCount++;
           }
           else if(Character.isLowerCase(str.charAt(i)))
           {
               DownCount++;
           }
       }
       System.out.println(UpCount);
       System.out.print(DownCount);
}
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  String chars=sc.nextLine();
  CountOfLowercaseAndUppercaseLetters(chars);
}
}
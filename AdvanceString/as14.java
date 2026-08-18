import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       String se=sc.nextLine();
       int a=se.length();
       String p="";
       for(int i=0;i<a;i++)
       {
           if(se.charAt(i)>=65 && se.charAt(i)<=90)
           {
              p+=(char)(se.charAt(i)+32);
           }
           else if(se.charAt(i)>=97 && se.charAt(i)<=122)
           {
               p+=(char)(se.charAt(i)-32);
           }
           else if(se.charAt(i)==' '){
               p+=" ";
           }
       }
       System.out.print(p);
    }
}
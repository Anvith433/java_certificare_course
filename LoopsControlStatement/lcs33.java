import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=s.length();
        int c=0;
        String f="";
        for(int i=0;i<a;i++)
        {
           if(s.charAt(i)==' ')
           {
               break;
           }
           else 
           {
               c++;
           }
        }
        f+=s.substring(0,c).toUpperCase();
        for(int j=c;j<a;j++)
        {
            f+=s.charAt(j);
        }
        System.out.println(f);
}
}
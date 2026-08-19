import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        String C=sc.nextLine();
        String s=sc.nextLine();
        String d="";
        for(int i=0;i<s.length();i++)
        {
            String p=s.substring(i,i+1);
            if(p.equals("1"))
            {
                d+=A;
            }
            else if(p.equals("2"))
            {
                d+=B;
            }
            else if(p.equals("3"))
            {
                d+=C;
            }
        }
        System.out.println(d);
    }
}
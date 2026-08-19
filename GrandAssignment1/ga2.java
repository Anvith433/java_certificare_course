import java.util.*;

class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String q=sc.nextLine();
        if(s.equals(q))
        {
        System.out.println("Yes");
        return;
        }
        if(s.length()!=q.length())
        {
            System.out.println("No");
            return;
        }
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length-1;i++)
        {
    char temp1=ch[i];
    ch[i]=ch[i+1];
    ch[i+1]=temp1;
    if(String.valueOf(ch).equals(q))
    {
        System.out.println("Yes");
        return;
    }
    else 
    {
         temp1=ch[i];
        ch[i]=ch[i+1];
        ch[i+1]=temp1;
    }
        }
        System.out.println("No");
    }
}
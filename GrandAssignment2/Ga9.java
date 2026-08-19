import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        String T=sc.nextLine();
        if(S.length()!=T.length())
        {
            System.out.print("No");
        }
        int c=0;
        int diff=0;
        for(int i=0;i<S.length();i++)
        {
            if(c==0)
            {
                diff=(S.charAt(i)-T.charAt(i)+26)%26;
            }
            else if(c!=0)
            {
                if(diff!=(S.charAt(i)-T.charAt(i)+26)%26)
                {
                    System.out.print("No");
                    return;
                }
            }
            c++;
            
        }
      
        System.out.print("Yes");
        
    }
}
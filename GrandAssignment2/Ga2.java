import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<T;i++)
        {
            String s=sc.nextLine();
            int currentDirection=0;
            boolean rescued=false;
            for(int j=0;j<s.length();j++)
            {
                char ch=s.charAt(j);
                if(ch=='R')
                {
                    currentDirection=(currentDirection+1)%4;
                }
                else if(ch=='L')
                {
                    currentDirection=(currentDirection+3)%4;
                }
                if(currentDirection==2)
                {
                    rescued=true;
                    break;
                }
            
                
            }
            if(rescued)
            {
                System.out.println("YES");
            }
            else 
            {
                System.out.println("NO");
            }
        }
        
    }
}
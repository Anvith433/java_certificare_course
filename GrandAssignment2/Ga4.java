import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int S=sc.nextInt();
        int T=sc.nextInt();
        int c=0;
        for(int i=0;i<=S;i++)
        {
            for(int j=0;j<=S-i;j++)
            {
                for(int k=0;k<=S-i-j;k++)
                {
                    if(i*j*k<=T)
                    {
                        c++;
                    }
                }
            }
        }
        System.out.println(c);
    }
}
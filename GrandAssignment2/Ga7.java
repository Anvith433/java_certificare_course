import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int draw=0;
            int mary=0;
            int amanda=0;
            int X=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            for(char c:s.toCharArray())
            {
                if(c=='A')
                {
                    amanda++;
                }
                else if(c=='M')
                {
                    mary++;
                }
                else if(c=='D')
                {
                    draw++;
                }
            }
            if( mary>amanda)
            {
                int prize=X*60;
                System.out.println(prize);
            }
            else if(amanda==mary)
            {
                int prize=X*55;
                System.out.println(prize);
            }
            else if(amanda>mary)
            {
                int prize=X*40;
                System.out.println(prize);
            }
        }
    }
}
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<T;i++)
        {
            HashMap<String,String> map=new HashMap<>();
            int N=sc.nextInt();
            sc.nextLine();
            for(int j=0;j<N;j++)
            {
              String ch=sc.nextLine().trim();
              
              map.put(ch,ch);
             
            }
            if(map.size()!=N)
            {
                System.out.println("Yes");
            }
            else 
            {
                System.out.println("No");
            }
        }
    }
}
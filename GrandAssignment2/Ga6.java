import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int N=sc.nextInt();
            int M=sc.nextInt();
            int S=sc.nextInt();
          int win=(S+M-1)%N;
          if(win==0)
          {
              win=N;
          }
          System.out.println(win);
}
}
}
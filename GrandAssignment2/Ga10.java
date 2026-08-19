import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] s=new int[N];
        for(int i=0;i<N;i++)
        {
            s[i]=sc.nextInt();
        }
        int j=0;
        int[] result=new int[N];
        while(j!=N)
        {
            int count=0;
        for(int i=j+1;i<N;i++)
        {
        if(s[i]<s[j])
        {
            count++;
        }
        } 
        result[j]=count;
        j++;
        
    }
   for(int i=0;i<result.length;i++)
   {
       System.out.print(result[i]+" ");
   }
    }
}
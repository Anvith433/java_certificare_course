import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
       long sum=0;
        for(int i=0;i<s;i++)
        {
            String p=sc.next();
            if(p.length()==1)
            {
                sum=sum+0;
            }
            else 
            {
                int val=Integer.parseInt(p.substring(0,p.length()-1));
                int pow=Integer.parseInt(p.substring(p.length()-1));;
                sum+=(long) Math.pow(val,pow);
            }
            
        }
        System.out.println(sum);
          
    }
}
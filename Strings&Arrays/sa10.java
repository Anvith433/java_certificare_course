import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int count=0;
        while(sc.hasNextInt())
        {
            count++;
            sum+=sc.nextInt();
        }
       double avg=(double) sum /count;
       avg=Math.round(avg*100.0)/100.0;
       System.out.println(avg);
    }
}
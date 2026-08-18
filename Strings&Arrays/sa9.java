import java.util.*;
import java.lang.*;
class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        while(sc.hasNextInt())
        {
            int n=sc.nextInt();
            if(max<n)
            {
                max=n;
            }
        }
        System.out.println(max);
    }
}
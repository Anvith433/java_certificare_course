import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int lcm=0;
        for(int i=1;i<m*n;i++)
        {
            int multipliesM=m*i;
            for(int j=1;j<=m*n;j++)
            {
                int multipliesN=n*j;
                if(multipliesM==multipliesN)
                {
                    lcm=multipliesM;
                    break;
                }
            }
            if(lcm!=0)
            {
                break;
            }
        }
        System.out.println(lcm);
    }
}
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<N;i++)
        {
            String s=sc.nextLine();
            String[] arr=s.split(" ");
            if(arr[0].length()==arr[1].length())
            {
                int sum=0;
                int sum1=0;
                for(int j=0;j<arr[0].length();j++)
                {
                    sum+=arr[0].charAt(j);
                    sum1+=arr[1].charAt(j);
                }
                if(sum==sum1)
                {
                    System.out.print("YES ");
                }
                else {
                    System.out.print("NO ");
                }
            }
            else{
                System.out.print("NO ");
            }
        }
    }
}
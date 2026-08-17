import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        int sum=0;
        Scanner i=new Scanner(System.in);
        int s=i.nextInt();
        if(s%10==0)
        {
            sum=sum+(s%10)*10+(s/10);
            System.out.println(0+""+sum);
        }
        else{
        sum=sum+(s%10)*10+(s/10);
        System.out.println(sum);
        }
        
    }
}
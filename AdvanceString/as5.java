import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                s+=i;
            }
        }
        String g=(s==a)?"Perfect Number":"Not a Perfect Number";
        System.out.printf("%s",g);
    }
}
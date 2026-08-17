import java.util.Scanner;
class Hi
{
    public static void main(String[] args)
    {
        Scanner m=new Scanner(System.in);
        int a=m.nextInt();
        String h=(a>0)?"Positive":(a<0)?"Negative":"Zero";
        System.out.print(h);
    }
}
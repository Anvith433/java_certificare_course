import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        int s=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
         float b=(a<=50)?s+a*2:(a>50 && a<=150)?s+50*2+(a-50)*3:(a>150 && a<=250)?s+50*2+100*3+(a-150)*5:s+50*2+100*3+100*5+(a-250)*8;
        float c=b+b*0.2f;
        System.out.print(c);
    }
}
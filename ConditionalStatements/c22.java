import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String s=((a%6)==0)?"Number is divisible by 6":(a%3==0)?"Number is divisible by 3":(a%2==0)?"Number is divisible by 2":"Number is not divisible by 2, 3 or 6";
        System.out.print(s);
    }
}
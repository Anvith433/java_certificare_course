import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String r=(a%2==0)?"Even":"Odd";
        System.out.print(r);
        
    }
}
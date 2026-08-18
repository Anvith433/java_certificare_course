import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long A=sc.nextInt();
        long B=sc.nextInt();
        double C=Math.pow(A,B);
        int D=(int) C;
        System.out.println(D);
    }
}
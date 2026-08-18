import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    int C=(int) Math.pow(A,2)+(int) Math.pow(B,2);
    int D=(int) Math.sqrt(C);
    System.out.printf("%d",D);
}
}
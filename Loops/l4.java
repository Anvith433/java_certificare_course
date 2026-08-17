import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        long N=s.nextInt();
        long i=1;
        long sh=0;
        do{
            sh+=i;
            i+=1;
        }while(i<=N);
        System.out.println(sh);
    }
}
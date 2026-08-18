import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=N;i++)
        {
            int a=sc.nextInt();
            if(a%3==0)
            {
                System.out.println(a);
            }
        }
    }
}
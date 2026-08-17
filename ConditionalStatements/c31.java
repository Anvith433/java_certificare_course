import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        int h=0;
        int f=0;
        int t=0;
        int o=0;
        Scanner e=new Scanner(System.in);
        int a=e.nextInt();
        if(a!=0)
        {
          h+=a/100;
          a=a%100;
          f+=a/50;
          a=a%50;
          t+=a/10;
          a=a%10;
          o+=a%10;
          
          
        }
        System.out.printf("100:%d\n",h);
        System.out.printf("50:%d\n",f);
        System.out.printf("10:%d\n",t);
        System.out.printf("1:%d\n",o);
        
    }
}
import java.util.*;

class Main {

    static void sumOfSquaresMToN(int a, int b) {
        int sum=0;
        for(int i=a;i<=b;i++)
        {
            sum+=Math.pow(i,2);
        }
     System.out.print(sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sumOfSquaresMToN(a,b);

        sc.close();
    }

}
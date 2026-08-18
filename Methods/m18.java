import java.util.Scanner;

class Main {
    static void sumOfCubesMToN(int a, int b) {
        int sum=0;
      for(int i=a;i<=b;i++)
      {
          sum+=Math.pow(i,3);
      }

System.out.print(sum);
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sumOfCubesMToN(a,b);
        

        sc.close();
    }
    
}
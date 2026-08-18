import java.util.Scanner;

class Main {

    static int getArg(int arg)
    {
        return arg;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val=getArg(n);
        System.out.println(val);

    }
    
}
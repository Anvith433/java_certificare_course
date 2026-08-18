import java.util.Scanner;
class Main {

    static int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int val=add(a,b);
        System.out.println(val);
        sc.close();
    }

}
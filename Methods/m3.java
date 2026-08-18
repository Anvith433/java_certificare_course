import java.util.Scanner;
class Main {

    static int MultiplyByThree(int a)
    {
        return a*3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int val=MultiplyByThree(a);
        System.out.println(val);
    }
    
}
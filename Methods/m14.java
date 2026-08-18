
import java.util.Scanner;

class Main {
    static String getDiscount(int amount) {
        if(amount<500)
        {
            return "5%";
        }
        else if(amount>=500 && amount<2500)
        {
            return "10%";
        }
        else{
            return "20%";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        String val=getDiscount(amount);
        System.out.println(val);
        sc.close();
    }

}
import java.util.Scanner;
class Main {
    public static String calculate_bill(int amount)
    {
        if(amount<500)
        {
            return Double.toString(amount-((amount)*0.05));
        }
        else if(amount>=500 && amount<2500)
        {
            return Double.toString(amount-((amount)*0.10));
        }
        else
        {
            return Double.toString(amount-((amount)*0.20));
        }
    }
    public static void main(String[] args) { 
        
        Scanner bill=new Scanner(System.in);
        int amount=bill.nextInt();
        String val=calculate_bill(amount);
        System.out.println(val);
        bill.close();
        
    }
}
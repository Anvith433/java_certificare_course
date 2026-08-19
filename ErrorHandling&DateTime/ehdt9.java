import java.util.*;
class Main
{
    public static void main(String[] args)
{
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] parts=input.trim().split("\\s+");
        try
        {
            int A=Integer.parseInt(parts[0]);
            int B=Integer.parseInt(parts[1]);
            int result=A/B;
            System.out.println(result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator can't be 0");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Input should be an integer");
        }
       
}
}
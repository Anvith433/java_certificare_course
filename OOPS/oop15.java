import java.util.Scanner;

interface AdvancedArithmetic{
    int divisorSum(int n);
}
class MyCalculator implements AdvancedArithmetic{
    int sum=0;
    int n;
    MyCalculator() {
        
    }
    
    
    public int divisorSum(int n){

        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        return sum;
    }
}
class Action {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyCalculator myCalculator = new MyCalculator();
        int divisorSum = myCalculator.divisorSum(input.nextInt()); // takes 6 as input and returns 12
        System.out.println(divisorSum);
        input.close();
    }
}
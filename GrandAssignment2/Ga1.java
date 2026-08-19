import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        BigInteger N=sc.nextBigInteger();
        BigInteger product=BigInteger.ONE;
        if(N.equals(BigInteger.ZERO))
        {
            System.out.print(0);
            return;
        }
        while(N.compareTo(BigInteger.ZERO)>0)
        {
            product=product.multiply(N.remainder(BigInteger.TEN));
            N=N.divide(BigInteger.TEN);
        }
        System.out.print(product);
    }
}
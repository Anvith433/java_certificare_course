import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner e=new Scanner(System.in);
        Float a=e.nextFloat();
        char A=((a>85))?'A':(a>70 && a<=85)?'B':(a>=60 && a<=70)?'C':'F';
        System.out.print(A);
        
    }
}
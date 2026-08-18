import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String[] array={"Python","Java","Ruby","C","C++","Go","R","JavaScript","Swift","PHP","Kotlin","Perl"};
        for(int i=0;i<N;i++)
        {
            int a=sc.nextInt();
            System.out.println(array[a]);
        }
    }
}
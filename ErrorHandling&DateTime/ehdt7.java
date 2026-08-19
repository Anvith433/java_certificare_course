import java.util.*;
import java.time.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int count=0;
        for(int year=A;year<=B;year++)
        {
            for(int month=1;month<=12;month++)
            {
                LocalDate date=LocalDate.of(year,month,1);
                if(date.getDayOfWeek()==DayOfWeek.MONDAY)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String inp=sc.nextLine();
        String inp1=sc.nextLine();
        DateTimeFormatter date1=DateTimeFormatter.ofPattern("MMM dd yyyy");
        DateTimeFormatter date2=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate datee=LocalDate.parse(inp,date1);
        LocalDate dateee=LocalDate.parse(inp1,date1);
       
        long a=ChronoUnit.DAYS.between(datee,dateee);
        for(int i=0;i<=a;i++)
        {
            LocalDate datt=datee.plusDays(i);
            String val=datt.format(date2);
            System.out.println(val);
            
        }
    }
}
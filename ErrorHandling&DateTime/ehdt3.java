import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String inp=sc.nextLine();
        
        DateTimeFormatter inputtt=DateTimeFormatter.ofPattern("dd MMM yyyy");
        DateTimeFormatter outputtt=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dtt=LocalDate.parse(inp,inputtt);
        LocalDate dtt11=dtt.plusDays(-1);
        System.out.println(dtt11.format(outputtt));
        LocalDate dtt1=dtt.plusDays(0);
        System.out.println(dtt1.format(outputtt));
        LocalDate dtt2=dtt.plusDays(1);
        System.out.println(dtt2.format(outputtt));
        sc.close();
    }
}
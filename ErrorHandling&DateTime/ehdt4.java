import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String inpp=sc.nextLine();
        int inpp1=sc.nextInt();
        DateTimeFormatter datee=DateTimeFormatter.ofPattern("MMM dd yyyy");
        DateTimeFormatter dateee=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date1=LocalDate.parse(inpp,datee);
        LocalDate dateAdd=date1.plusYears(inpp1);
        String date2=dateAdd.format(dateee);
        System.out.println(date2);
        
    }
}
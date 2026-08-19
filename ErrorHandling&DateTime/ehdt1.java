import java.time.LocalDate;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        DateTimeFormatter pat=DateTimeFormatter.ofPattern("d MMM yyyy");
        LocalDate date=LocalDate.parse(string,pat);
        System.out.println(date);
        
    }
}
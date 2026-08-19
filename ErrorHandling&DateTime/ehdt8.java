import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
 class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long unixTimestamp=sc.nextLong();
        Instant instant=Instant.ofEpochSecond(unixTimestamp);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneOffset.UTC);
        System.out.println(formatter.format(instant));
        
    }
}
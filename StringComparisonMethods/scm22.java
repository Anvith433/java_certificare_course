import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int L=sc.nextInt();
     int g=0;
     for(int i=1;i<=L;i++)
     {
         
       for(int j=i;j<=L;j++)
       {
          
           for(int k=j;k<=L;k++)
           {
              
               if(i*i +j*j==k*k)
               {
                   g++;
               }
           }
       }
    }
    System.out.print(g); 
}
}
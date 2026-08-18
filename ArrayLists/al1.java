import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        
        int K=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            list.add(sc.nextInt());
        }
        int pos=Collections.binarySearch(list,K);
        if(pos<0)
        {
            pos=-(pos+1);
        }
        list.add(pos,K);
        System.out.println(pos);
        System.out.println(list);
    }
        }
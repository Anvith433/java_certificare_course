import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        HashSet<Integer> hashset=new HashSet<>();
        HashSet<Integer> hashset1=new HashSet<>();
       for(int i=1;i<=2*N;i++)
       {
           if(i%2==0)
           {
               hashset.add(i);
           }
       }
       for(int i=1;i<=3*N;i++)
       {
           if(i%3==0)
           {
               hashset1.add(i);
           }
       }
       ArrayList<Integer> arr1=new ArrayList<>();
       for(int val:hashset)
       {
           if(val%3!=0)
           {
               arr1.add(val);
           }
       }
       Collections.sort(arr1);
       HashSet<Integer> union=new HashSet<>();
       for(int val:hashset)
       {
           if(!hashset1.contains(val))
           {
               union.add(val);
           }
       }
       for(int val1:hashset1)
       {
           if(!hashset.contains(val1))
           {
               union.add(val1);
           }
       }
      
       ArrayList<Integer> result=new ArrayList<>(union);
       Collections.sort(result);
       System.out.println(arr1);
       System.out.println(result);
       
}
}
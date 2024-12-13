/*  3  //input values
raju rani   //input
saritha saroja
saveetha sabitha
raju:rani   //output
saritha:saroja
saveetha:sabitha   */
import java.util.*;
public class Acceptingtreemap1{
    public static void main(String args[]){
        TreeMap<String,String> a=new TreeMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String s=sc.next();
            String s1=sc.next();
            a.put(s,s1);
        }
        for(String s:a.keySet())
        {
        System.out.println(s+":"+a.get(s));
        }
    }
}
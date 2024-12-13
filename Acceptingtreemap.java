/*  3//input value
raju rani  //input
saritha saroja
sumathi anitha
{raju=rani, saritha=saroja, sumathi=anitha}  //output   */
import java.util.*;
public class Acceptingtreemap{
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
        System.out.println(a);
    }
}
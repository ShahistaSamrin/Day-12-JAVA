/*  Hello 
    Students
    Raju   */
import java.util.*;
class Iteratinghashset{
    public static void main(String args[]){
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("Hello");
        a.add("Students");
        a.add("Raju");
        a.add("Students");
        //Iterator
        for(String s:a)
        {
            System.out.println(s+" ");
        }
    }
}
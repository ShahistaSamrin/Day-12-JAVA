/*  Hello 
    Students 
    Raju   */ 
import java.util.*;
class Printingiterator{
    public static void main(String args[]){
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("Hello");
        a.add("Students");
        a.add("Raju");
        a.add("Students");
        //printing using iterator
        Iterator itr = a.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next()+" ");
        }
    }
}
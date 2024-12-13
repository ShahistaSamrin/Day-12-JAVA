/*  [Hello, Students, Raju]
    [Hello, Students]
    []   */
import java.util.*;
class Linkedhashset{
    public static void main(String args[]){
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("Hello");
        a.add("Students");
        a.add("Raju");
        a.add("Students");
        System.out.println(a);
        a.remove("Raju");
        System.out.println(a);
        a.clear();
        System.out.println(a);

    }
}
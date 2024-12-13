/*  5     //size
88 99 89 667 767//input
767  /output
667
89
99
88  */
import java.util.*;
public class Acceptingvaluesinlinkedlist{
    public static void main(String args[]){
        //accepting values into a LinkedList
        LinkedList<Integer> a=new LinkedList<>();
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        for(int i=0;i<size;i++)
        {
            int s1=s.nextInt();
            a.addFirst(s1);
        }
        for(int i=0;i<size;i++)
        System.out.println(a.get(i)+" ");
    }
}
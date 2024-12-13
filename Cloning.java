/*  5 
88 89 99 676 767 //input
[767, 676, 99, 89, 88]  //output  */  
import java.util.*;
public class Cloning{
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
        LinkedList<Integer> b=new LinkedList<>();
        b=(LinkedList)a.clone();
        System.out.println(b);
    }
}
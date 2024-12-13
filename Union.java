/*  [1, 2, 3, 5, 6, 10]
    [1, 2, 3, 4, 55, 60]
    [1, 2, 3, 4, 55, 60] */
import java.util.*;
class Union{
    public static void main(String args[]){
        int arr1[]={10,5,6,1,2,3};
        int arr2[]={1,2,3,4,55,60};
        Set<Integer> a=new HashSet<>();
        Set<Integer> b=new HashSet<>();
        for(int s:arr1)
        a.add(s);
        for(int s1:arr2)
        b.add(s1);
        System.out.println(a);
        System.out.println(b);
        Set<Integer> u=new HashSet<>();
        u.addAll(b);
        System.out.println(u);
        
    }
}
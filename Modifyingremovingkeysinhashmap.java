/* {SNO=01, SName=shahi, City=chennai}
{SNO=90, SName=shahi, City=chennai}
{SNO=90, City=chennai}
{}   */
import java.util.*;
public class Modifyingremovingkeysinhashmap{
    public static void main(String args[]){
        HashMap<String,String> a=new HashMap<>();
        a.put("SNO","01");
        a.put("SName","shahi");
        a.put("City","chennai");
        System.out.println(a);
        //Modifying value for a key
        a.put("SNO","90");
        System.out.println(a);
        //removing key in a hashmap
        a.remove("SName");
        System.out.println(a);
        a.clear();
        System.out.println(a);                                                                                                                               
    }
}
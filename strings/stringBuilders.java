package strings;
import java.util.*;
public class stringBuilders {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Hello ");
        str.append(" World");
        str.setCharAt(8,'d');
        str.insert(6,"sachin");
        str.deleteCharAt(4);
        System.out.println(str);
        System.out.println(str.reverse());
        str.delete(5,12);
        str.reverse();
        System.out.println(str);
        str.insert(4,'o');
        System.out.println(str);
        str.setCharAt(7,'o');
        System.out.println(str);
    }
}

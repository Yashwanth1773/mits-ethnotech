import java.util.*;
public class sets{
    public static void main(String[] args){
        //Set
        Set <Integer>s=new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
         System.out.println("==============SET EXAMPLE===============");
        System.out.println(s);
        HashSet<Integer> h=new HashSet<>();
        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);
        System.out.println("==============HASHSET EXAMPLE===============");
         System.out.println(h);
        System.out.println(h.contains(10));

        LinkedHashSet l=new LinkedHashSet<>();
        for(Integer a:h){
            l.add(a);
        }
        System.out.println("==============LINKEDHASHSET EXAMPLE===============");
         System.out.println(l);
         System.out.println("Size of rthe set:"+l.size());

        TreeSet<Integer> t=new TreeSet<>();
        t.add(100);
        t.add(300);
        t.add(200);
        System.out.println("==============TREESET EXAMPLE===============");
        System.out.println(t);
        System.out.println(t.contains(100));

        NavigableSet <Integer> i=new TreeSet<>();
        for(Integer r:s){
            i.add(r);
        }
        System.out.println("==============NAVIGABLESET EXAMPLE===============");
        System.out.println(i);
        System.out.println("Set is empty:"+i.isEmpty());
        System.out.println(i.remove(5));
        System.out.println(i);
    }
}
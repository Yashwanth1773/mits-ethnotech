
import java.util.LinkedList;
import java.util.Queue;

public class queueExample{
    public static void main(String[] args){
        Queue <String> q=new LinkedList<>();
        q.add("Yash");
        q.add("sandy");
        q.add("vara");
        q.add("venky");
        q.remove();
        System.out.println(q.peek());
    }
}
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class qexample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Queue <Integer> q=new LinkedList<>();
        Queue<Integer>a=new LinkedList<>();
        System.out.println("Enter the no of students for registration:");
        int x=sc.nextInt();
        System.out.println("enter registration numbers:");
        for(int j=0;j<x;j++){
            q.offer(sc.nextInt());
        }
         System.out.println(" registered students:");
        System.out.println(q);
        for(Integer i:q){
            if(!a.contains(i)){
                a.add(i);
            }
        }
        System.out.println("Enter the no of students for new  registration:");
        int n=sc.nextInt();
        System.out.println("enter registration numbers:");
        for(int j=0;j<n;j++){
            q.offer(sc.nextInt());
        }
        System.out.println(" registered students:");
        System.out.println(q);
        for(Integer i:q){
            if(!a.contains(i)){
                a.add(i);
            }
        }
        System.out.println("Final registered students ids:");
        System.out.println(a);
        System.out.println("The no of students:"+a.size());
    }
}
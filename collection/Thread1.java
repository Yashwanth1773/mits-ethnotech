
class Mythread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is started");
    }

}
public class Thread1{
    public static void main(String[] args) {
        Thread t1=new Thread(new Mythread());
         Thread t2=new Thread(new Mythread());
         t1.start();
         t2.start();
    }
}
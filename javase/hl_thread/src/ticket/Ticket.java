package ticket;

/**
 * @Auther: Administrator
 * @Date: 2019/7/8 16:34
 * @Description:
 */
public class Ticket implements Runnable{

    static int tickets = 50;

    static Object obj = "aa";

    @Override
    public void run() {
        while (tickets>0){
            synchronized ( obj ){
                if (tickets>0){
                    System.out.println(tickets+"........."+Thread.currentThread().getName());
                    tickets--;
                }else {
                    System.out.println("票卖完了");
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Ticket ticket = new Ticket();
        Thread thread = new Thread(ticket);
        Thread thread1 = new Thread(ticket);
        Thread thread2 = new Thread(ticket);
        thread.start();
        thread1.start();
        thread2.start();
    }
}

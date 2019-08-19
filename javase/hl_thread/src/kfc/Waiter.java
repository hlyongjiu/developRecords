package kfc;

/**
 * @Auther: hl
 * @Date: 2019/7/9 16:42
 * @Description:
 */
public class Waiter extends Thread {
    KFC kfc;
    //KFC要传入，保证每一个服务员和用户在同一个KFC对象内
    public Waiter(KFC kfc) {
        this.kfc=kfc;
    }
    @Override
    public void run() {
        int size=(int)(Math.random()*5)+5;//每次生产的数量
        System.out.println("*************每次生产的数量"+size);
        while (true) {
            kfc.prod(size);//传入每次生产的数量
        }
    }
}

package kfc;

/**
 * @Auther: hl
 * @Date: 2019/7/9 16:40
 * @Description:
 */
public class Customers extends Thread{
    KFC kfc;
    //KFC要传入，保证每一个服务员和用户在同一个KFC对象内
    public Customers(KFC kfc) {
        this.kfc=kfc;
    }
    @Override
    public void run() {
        int size=(int)(Math.random()*5);//每次要消费的食物的数量
        while (true) {
            kfc.consu(size);//在消费的方法里面传入参数
        }

    }
}

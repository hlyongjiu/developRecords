package threadAddSub;

/**
 * @Auther: hl
 * @Date: 2019/7/9 17:26
 * @Description:
 */
public class ThreadAddSub extends Thread {
    //判断要进行的操作
    boolean operate = true;
    //要操作的数
    static int sum = 0;

   final static Object obj = "a";

    // 把操作运算通过构造方法传进来
    public ThreadAddSub(boolean operate) {
        super();
        this.operate = operate;
    }

    @Override
    public void run() {
        //super.run();

        while (true) {
            System.out.println(Thread.currentThread().getName());
            synchronized (obj) {
                /*if (sum != 0) {
                    //注意这里
                    obj.notify();
                    System.out.println("测试");
                }*/
                //锁对象
                obj.notifyAll();
                if (operate) {
                    sum += 5;
                    System.out.println("加后，sum=" + sum);
                } else {
                    sum -= 4;
                    System.out.println("减后，sum=" + sum);
                }
                try {
                    //sleep(1000);
                    obj.wait();
                   // System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

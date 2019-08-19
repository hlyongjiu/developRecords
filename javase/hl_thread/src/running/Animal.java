package running;

/**
 * @Auther: hl
 * @Date: 2019/7/9 13:56
 * @Description:
 */
public abstract class Animal extends Thread{
    public int length = 200;

    public abstract void runing();

    @Override
    public void run() {
        super.run();
        while (length > 0){
            runing();
        }
    }

    //在需要回调数据的地方，声明一个接口
    public static interface CalltoBack{
        public void win();
    }

    //创建接口对象
    public CalltoBack calltoBack;
}

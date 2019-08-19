package running;

/**
 * @Auther: hl
 * @Date: 2019/7/9 14:02
 * @Description:
 */
public class Tortoise extends Animal {

    public Tortoise() {
        setName("乌龟");// Thread的方法，给线程赋值名字
    }

    // 重写running方法，编写乌龟的奔跑操作
    @Override
    public void runing() {
        //乌龟速度
        int dis = 2;
        length -= dis;
        System.out.println("乌龟跑了" + dis + "米，距离终点还有" + length + "米");
        if (length <= 0) {
            length = 0;
            System.out.println("乌龟获得了胜利");
            //给回调对象赋值，让兔子不要再跑了
            if (calltoBack != null) {
                calltoBack.win();
            }
        }
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

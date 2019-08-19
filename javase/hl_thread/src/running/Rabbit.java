package running;

/**
 * @Auther: hl
 * @Date: 2019/7/9 14:02
 * @Description:
 */
public class Rabbit extends Animal {

    public Rabbit() {
        setName("兔子");
    }

    @Override
    public void runing() {
        //兔子速度
        int dis = 5;
        length -= dis;
        System.out.println("兔子跑了" + dis + "米，距离终点还有" + length + "米");
        if (length <= 0) {
            length = 0;
            System.out.println("兔子获得了胜利");
            //给回调对象赋值，让乌龟不要再跑了
            if (calltoBack != null) {
                calltoBack.win();
            }
        }
        try {
            if ((2000 - length) % 20 == 0) {
                sleep(1000);//每20米休息一次，休息时间是1秒
            } else {
                sleep(100);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

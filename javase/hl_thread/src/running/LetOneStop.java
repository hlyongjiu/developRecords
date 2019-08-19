package running;

/**
 * @Auther: hl
 * @Date: 2019/7/9 14:31
 * @Description:
 */
public class LetOneStop implements Animal.CalltoBack {
    //动物对象
    Animal animal;

    //获取动物对象，可以传入兔子或乌龟的实例
    public LetOneStop(Animal animal) {
        this.animal = animal;
    }

    //让动物的线程停止
    @Override
    public void win() {
        animal.stop();
    }
}

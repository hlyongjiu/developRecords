package threadAddSub;

/**
 * @Auther: hl
 * @Date: 2019/7/9 17:27
 * @Description:
 */
public class MainClassAddSub {
    /**
     * (线程同步)
     * */
    public static void main(String[] args) {

        /*//创建一个存放ThreadAddSub对象的数组
        ThreadAddSub[] tSub=new ThreadAddSub[4];
        for (int i = 0; i < tSub.length; i++) {

            //把实例化ThreadAddSub对象赋值到数组内
            //第一三个是true，二四个是false
            tSub[i]=new ThreadAddSub(i%2==0?true:false);

            //让线程开始工作
            tSub[i].start();
        }*/
        ThreadAddSub threadAddSub1 = new ThreadAddSub(false);
        ThreadAddSub threadAddSub2 = new ThreadAddSub(true);
        ThreadAddSub threadAddSub3 = new ThreadAddSub(false);
        ThreadAddSub threadAddSub4 = new ThreadAddSub(true);
        threadAddSub1.start();
        threadAddSub2.start();
       /* threadAddSub3.start();
        threadAddSub4.start();*/

    }
}

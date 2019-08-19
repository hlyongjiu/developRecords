package com.learn.initialization_cleanup;

/**
 * @Auther: hl
 * @Date: 2019/7/29 15:11
 * @Description:
 */
public class ClassLoaderOrder {

    public static void main(String[] args) {
        //new Zi();
        System.out.println(Zi.z);
    }
}

class Fu {
 static int f=10;
 static{
     System.out.println("Fu中static块:f="+f);
 }

    public Fu() {
        System.out.println("Fu被初始化f="+f);
    }
}

class Zi extends Fu {
    static int z;
    static {
        System.out.println("Zi中static块:z=" + z);
        z=1;
    }

    public Zi() {
        System.out.println("Zi被初始化z:"+z);
    }
}

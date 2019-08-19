package com.learn.object;

import com.learn.util.Print;

import java.util.ArrayList;

import static com.learn.util.Print.*;

/**
 * @Auther: hl
 * @Date: 2019/7/26 09:43
 * @Description:
 */
public class FunTest {

    public static void main(String[] args) {
        test(null);
        test(new int[]{1, 2, 3});
        test(new ArrayList<>());
        //test();
    }

    public static void test(Object object) {
        print(null);print(new ShowProperties().toString());
        //print();
        //print();
    }
}

package com.learn.util;

import com.sun.istack.internal.Nullable;

/**
 * @Auther: hl
 * @Date: 2019/7/25 16:52
 * @Description:
 */
public class Print {
    /**
     *
     * 功能描述: 简化System.out.print(String string)代码
     *
     * @param:
     * @return:
     * @auther: hl
     * @date: 2019/7/25 17:05
     */
    public static void print(@Nullable String object) {
        System.out.println(object);
    }

    public static void print() {
        System.out.println();
    }
}

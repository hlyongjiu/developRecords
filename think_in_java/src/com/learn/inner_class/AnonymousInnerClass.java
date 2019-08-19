package com.learn.inner_class;

import com.learn.inner_class.interfacedemo.Contents;

/**
 * @Auther: hl
 * @Date: 2019/8/13 11:17
 * @Description:
 */
public class AnonymousInnerClass {
    public Contents contents() {
        return new Contents(){
            @Override
            public int value() {
                return 1;
            }
        };
    }
}

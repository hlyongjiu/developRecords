package com.learn.inner_class;

import com.learn.inner_class.interfacedemo.Destination;

/**
 * @Auther: hl
 * @Date: 2019/8/13 11:31
 * @Description:
 */
public class AnonymousInnerClass2 {
    public Destination destination(final String b) {
        return new Destination() {
            private String a = b;

            @Override
            public String readLabel() {
                return a;
            }
        };

    }

    public static void main(String[] args) {
        String[] str = {"a","b",};
        int[] a = {};


        AnonymousInnerClass2 class2 = new AnonymousInnerClass2();
        Destination destination = class2.destination("asdf");
        AnonymousInnerClass2 class3 = new AnonymousInnerClass2();
        Destination destination2 = class3.destination("bbbb");
        System.out.println(destination.readLabel());
        System.out.println(destination2.readLabel());
        System.out.println(System.nanoTime());
        System.out.println(args[0]);
        System.out.println(args.length);

    }
}

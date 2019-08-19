package com.learn.initialization_cleanup;

/**
 * @Auther: hl
 * @Date: 2019/7/29 11:47
 * @Description:
 */
public enum Enum {
    File,EXE,JAVA
}
class EnumTest{
    public static void main(String[] args) {
        Enum anEnum = Enum.JAVA;
        System.out.println(anEnum);
        System.out.println(Enum.values());
        for(Enum enum1:Enum.values()){
            System.out.println(enum1 +",ordinal"+enum1.ordinal() );
        }
    }
}

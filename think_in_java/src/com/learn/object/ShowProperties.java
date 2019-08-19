package com.learn.object;

/**
 * @Auther: hl
 * @Date: 2019/7/25 15:25
 * @Description:
 */
public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}

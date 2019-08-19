package com.learn.inner_class.interfacedemo;

/**
 * @Auther: hl
 * @Date: 2019/8/13 16:04
 * @Description:
 */
public abstract class Event {
    private long eventTime;
    protected final long delayTime;

    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    public void start() {
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready() {
        //System.out.println(this.getClass()+"eventTime:"+eventTime+"当前时间："+System.nanoTime());
        return System.nanoTime() >= eventTime;
    }

    public abstract void action();
}

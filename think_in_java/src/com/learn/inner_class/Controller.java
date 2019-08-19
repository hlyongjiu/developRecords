package com.learn.inner_class;

import com.learn.inner_class.interfacedemo.Event;

import java.util.*;

/**
 * @Auther: hl
 * @Date: 2019/8/13 16:09
 * @Description:
 */
public class Controller {
    private List<Event> eventList = new ArrayList<Event>();

    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        /*for (Event e : eventList) {
            System.out.println(e.getClass());
        }*/
        while (eventList.size() > 0) {
            System.out.println(eventList.size());
            for (Event e : new ArrayList<Event>(eventList)) {
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                    System.out.println(eventList.size());
                }
            }
        }
    }
}

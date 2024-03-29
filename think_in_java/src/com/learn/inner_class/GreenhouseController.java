package com.learn.inner_class;

import com.learn.inner_class.interfacedemo.Event;

import java.util.Arrays;

/**
 * @Auther: hl
 * @Date: 2019/8/13 16:31
 * @Description:
 */
public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControllers gc = new GreenhouseControllers();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LinghtOn(200),
                gc.new LinghtOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if (args.length == 1) {
            gc.addEvent(new GreenhouseControllers.Terminate(new Integer(args[0])));
        }
        gc.run();
    }
}

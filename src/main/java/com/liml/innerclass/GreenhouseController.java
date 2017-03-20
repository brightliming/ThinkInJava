package com.liml.innerclass;

/**
 * Created by Administrator on 2017/1/1.
 */
public class GreenhouseController {
    public static void main(String[] args){
        GreenhouseControls gc = new GreenhouseControls();
        gc.addEvent(gc.new Bell(900));

        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOff(200),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400)
        };
        gc.addEvent(gc.new Restart(2000,eventList));

        if(args.length == 1){
            gc.addEvent(new GreenhouseControls.Terminal(new Integer(args[0])));
        }
        gc.run();
    }
}

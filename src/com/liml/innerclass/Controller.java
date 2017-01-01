package com.liml.innerclass;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/31.
 */
public class Controller {
    private List<Event> eventList = new ArrayList<Event>();

    public void addEvent(Event e){eventList.add(e);}

    public void run(){
        while(eventList.size()>0){
            for(Event e:new ArrayList<Event>(eventList)){
                if(e.ready()){
                    e.action();
                    System.out.println(e);
                    eventList.remove(e);
                }
            }
        }
    }
}

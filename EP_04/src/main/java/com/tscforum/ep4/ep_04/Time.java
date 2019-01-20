package com.tscforum.ep4.ep_04;

public class Time {
    EP04 plugin;
    public Time(EP04 pl){
        plugin = pl;
    }

    public void getTime(){
        System.out.print(plugin.time);
    }
}

package com.raja.easy;

import java.util.HashMap;
import java.util.Map;

public class Logger_L359 {
}

class Logger {
     Map<String,Integer> map;
    private  int timeout=10;

    public Logger() {
        map=new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        if(map.containsKey(message) && timestamp < map.get(message)){
            return false;
        }
        map.put(message,timestamp+timeout);
        return true;
    }
}


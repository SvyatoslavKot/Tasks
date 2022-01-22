package com.exemple.TaskOne;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TaskThree {
    public static void main(String[] args) {
        HashMap<Integer,String> keyValue = new HashMap<Integer, String>();
        keyValue.put(1,"Hello");
        keyValue.put(2,"World!");
        keyValue.put(3,"Have a nice day.");

        System.out.println("Cycle While");

        Iterator iterator = keyValue.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry qurentMe  = (Map.Entry) iterator.next();

            System.out.println(
                    "Key this " + qurentMe.getKey() + " Value this " + qurentMe.getValue());
        }
        System.out.println("Cycle For");

        for (Map.Entry qurentMe2: keyValue.entrySet()){
            System.out.println(
                    "Key this " + qurentMe2.getKey() + " Value this " + qurentMe2.getValue());
            }
        }
    }


package com.exemple.TaskOne;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TaskFour {
    public static void main(String[] args) {
        HashMap<Integer,String> keyValue = new HashMap<>();
        keyValue.put(1,"Hello");
        keyValue.put(2,"World");
        keyValue.put(3,"have a nice day");
        System.out.println("Size map is " + keyValue.size());
        System.out.println("Cycle while: ");

        Iterator iter = keyValue.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry qurentMe  = (Map.Entry) iter.next();
            System.out.println("Key this " + qurentMe.getKey() + " Value this " + qurentMe.getValue());
        }
        System.out.println("Cycle 'for'");

        for (Map.Entry qurentMe2: keyValue.entrySet()){
            System.out.println("Key this " + qurentMe2.getKey() + " Value this " + qurentMe2.getValue());
        }
    }
}

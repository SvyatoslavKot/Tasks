package com.exemple.TaskOne;

import java.util.HashMap;

public class TaskTwo {
    public static void main(String[] args) {
        String str = "Task text. This is test text. Test text for task two.";
        String[] words = str.split(" ");
        HashMap<String,Integer> keyValue = new HashMap<String, Integer>();
        for (int i = 0; i<= words.length-1; i++) {
            if (keyValue.containsKey(words[i])) {
                int counter = keyValue.get(words[i]);
                keyValue.put(words[i],counter+1);

            }
            else {
                keyValue.put(words[i], 1);
            }
        }
        System.out.println(keyValue);
    }
}

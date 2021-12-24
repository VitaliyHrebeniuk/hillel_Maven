package com.task;

import java.util. *;

public class TaskHashMap {
    public static void main(String[] args) {
        //1
        HashMap<String, String> hashMap = new HashMap();
        hashMap.put("1", "golova");
        hashMap.put("2", "uho");
        hashMap.put("3", "dvaUha");
        for(Map.Entry i:hashMap.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }

        //2
        System.out.println(hashMap.size());

        //3
        HashMap<String, String> hashMap2 = new HashMap();
        hashMap2.put("4", "golova");
        hashMap2.put("5", "uho");
        hashMap2.put("6", "dvaUha");
        hashMap2.putAll(hashMap);
        System.out.println(hashMap2);

        //4
        hashMap.clear();

        //5
        System.out.println(hashMap.isEmpty());

        //6
        HashMap<String, String> hashMap3 = new HashMap();
        hashMap3 = (HashMap<String, String>) hashMap2.clone();
        System.out.println(hashMap3);

        //7
        if(hashMap2.containsKey("1")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        //8
        if(hashMap2.containsValue("golova")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        //9
        Set set = hashMap2.entrySet();
        System.out.println(set);

        //10
        System.out.println(hashMap2.get(2));

        //11
        Set set2 = hashMap2.keySet();

        System.out.println(set2);

        //12
        System.out.println(hashMap2.values());


    }
}

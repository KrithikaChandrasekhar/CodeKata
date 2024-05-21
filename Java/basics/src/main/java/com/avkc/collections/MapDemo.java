package com.avkc.collections;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("arv", "zzz");
        map.put("frooty", "aaa");
        map.get("arv");
        for(Map.Entry<String,String> entry: map.entrySet()) {
            entry.getKey();
            entry.getValue();
        }

    }
}

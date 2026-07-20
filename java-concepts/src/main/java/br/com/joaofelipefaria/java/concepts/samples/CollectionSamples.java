package br.com.joaofelipefaria.java.concepts.samples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Sample class for CollectionSamples.
 */
public class CollectionSamples {

    /**
     * Prints sample output for CollectionSamples.
     */
    public static void print() {
        System.out.println("-- CollectionSamples --");
        listSamples();
        setSamples();
        mapSamples();
    }

    private static void listSamples() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add(1, "inserted");

        System.out.println("list size=" + list.size());
        for (String item : list) {
            System.out.println("list item=" + item);
        }
        System.out.println("contains 'two'=" + list.contains("two"));
        System.out.println("indexOf 'three'=" + list.indexOf("three"));
    }

    private static void setSamples() {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("two");
        set.add("three");

        System.out.println("set size=" + set.size());
        for (String item : set) {
            System.out.println("set item=" + item);
        }

        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("first");
        linkedSet.add("second");
        linkedSet.add("first");
        System.out.println("linkedSet size=" + linkedSet.size());
    }

    private static void mapSamples() {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("two", 22);

        System.out.println("map size=" + map.size());
        System.out.println("map get 'two'=" + map.get("two"));
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("one", 1);
        linkedMap.put("two", 2);
        System.out.println("linkedMap order= " + linkedMap.keySet());
    }
}

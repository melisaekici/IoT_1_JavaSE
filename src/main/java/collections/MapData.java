package collections;

import java.util.*;


// HashTable
// HashMap
// LinkedHashMap
// TreeMap

public class MapData {

    // mapData
    public static void mapData(){
        Map<String, String> map = new HashMap<>();
        map.put("1", "PC"); // ilk kısım (1) unique olmalı
        map.put("2", "Laptop");
        map.put("3", "PC-2");
        map.put("4", "Laptop-2");
        map.put("5", "Laptop-3");
        System.out.println(map.get("1"));
        System.out.println("Eleman Sayısı: " + map.size());
        System.out.println("HashCode: " + map.hashCode());
        System.out.println("HashCode(toString): " + map.toString());

        for(String key: map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }

    }

    public static void linkedMapData() {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("1", "PC"); // ilk kısım (1) unique olmalı
        linkedHashMap.put("2", "Laptop");
        linkedHashMap.put("3", "PC-2");
        linkedHashMap.put("4", "Laptop-2");
        linkedHashMap.put("5", "Laptop-3");
        System.out.println(linkedHashMap.get("1"));
        System.out.println("Eleman Sayısı: " + linkedHashMap.size());
        System.out.println("HashCode: " + linkedHashMap.hashCode());
        System.out.println("HashCode(toString): " + linkedHashMap.toString());

        for (String key : linkedHashMap.keySet()) {
            System.out.println(key + ": " + linkedHashMap.get(key));
        }
    }

    public static void HashTable() {
        Map<String, String> hashTable = new Hashtable<>();
        hashTable.put("1", "PC"); // ilk kısım (1) unique olmalı
        hashTable.put("2", "Laptop");
        hashTable.put("3", "PC-2");
        hashTable.put("4", "Laptop-2");
        hashTable.put("5", "Laptop-3");
        System.out.println(hashTable.get("1"));
        System.out.println("Eleman Sayısı: " + hashTable.size());
        System.out.println("HashCode: " + hashTable.hashCode());
        System.out.println("HashCode(toString): " + hashTable.toString());

        for (String key : hashTable.keySet()) {
            System.out.println(key + ": " + hashTable.get(key));
        }
    }

    public static void TreeMap() {
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("1", "PC"); // ilk kısım (1) unique olmalı
        treeMap.put("2", "Laptop");
        treeMap.put("3", "PC-2");
        treeMap.put("4", "Laptop-2");
        treeMap.put("5", "Laptop-3");
        System.out.println(treeMap.get("1"));
        System.out.println("Eleman Sayısı: " + treeMap.size());
        System.out.println("HashCode: " + treeMap.hashCode());
        System.out.println("HashCode(toString): " + treeMap.toString());

        for (String key : treeMap.keySet()) {
            System.out.println(key + ": " + treeMap.get(key));
        }
    }

    public static void main(String[] args) {
        System.out.println("************* MapData ************");
        mapData();
        System.out.println("\n************* LinkedMapData ************");
        linkedMapData();
        System.out.println("\n************* HashTable ************");
        HashTable();
        System.out.println("\n************* TreeMap ************");
        TreeMap();
    }
}

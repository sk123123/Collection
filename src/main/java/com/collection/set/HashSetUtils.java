package com.collection.set;

import java.util.HashSet;

/**
 * hashset分析
 */
public class HashSetUtils {
    public static void main(String[] args) {
        //实例化 map = new HashMap<>();
        HashSet hashSet = new HashSet();
        //key值存放 无序
        hashSet.add("hashSet");
        //元素可以null
        hashSet.add(null);
        // value 存放 private static final Object PRESENT = new Object();
        hashSet.add("hashSet");//元素不可重复
        System.out.println(hashSet);
    }
}

package com.collection.set;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet 继承自HashSet 内部实现了一个hashMap
 * 通过LinkedHashMap 实现了元素排序
 */
public class LinkedHashSetUtils {
    public static void main(String[] args) {
        LinkedHashSet linedHashSet = new LinkedHashSet();
        //有序
        linedHashSet.add("linedHashSet");
        //可为null
        linedHashSet.add(null);
        //元素不可重复
        linedHashSet.add("linedHashSet");
        System.out.println(linedHashSet);
    }
}

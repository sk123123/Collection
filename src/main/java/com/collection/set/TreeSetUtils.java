package com.collection.set;

import com.collection.utils.TreeSetClass;

import java.util.*;

/**
 * TreeSet:元素不可重复，有序
 *
 */
public class TreeSetUtils {
    public static void main(String[] args) {
        //NavigableMap->SortedMap
        //TreeMap
        TreeSet treeSet = new TreeSet();
        //1、存储基本数据类型
//        treeSet.add("treeSet");
        //存储类型不一致包错
//        treeSet.add(1);
        treeSet.comparator();
//        treeSet.add(null); 元素不能为空
        //2、存储对象 cannot be cast to java.lang.Comparable
        TreeSetClass treeSetClass = new TreeSetClass(1,"tom","男");
        TreeSetClass treeSetClass1 = new TreeSetClass(2,"jack","男");
        TreeSetClass treeSetClass2 = new TreeSetClass(3,"sam","男");
        //根据对象某个属性的唯一性重下CompareTo方法 保证数据唯一性
        treeSet.add(treeSetClass);
        treeSet.add(treeSetClass1);
        treeSet.add(treeSetClass2);
        System.out.println(treeSet);
    }
}

package com.collection.utils;

public class TreeSetClass implements Comparable{
    int age;
    String name;
    String sex;

    public TreeSetClass(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "TreeSetClass{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        /**
         * 0:元素每次进行比较，都认为是相同的元素，
         * 这是就不再向TreeSet里面插入除第一个元素以外的元素，所以TreeSet中就只插入了一个元素。
         * 1:元素每次进行比较，都认为新插入的元素比上一个元素大，
         * 于是二叉树存储时，会储存在根的右侧，读取时就是正序排列，先进先出
         * -1:元素每次进行比较，都认为新插入的元素比上一个元素小，
         * 于是二叉树存储时，会储存在根的左侧，读取时就是倒序排列，先进后出
         */
        if(o instanceof TreeSetClass){
            if(((TreeSetClass) o).age == this.age){
                return 0;
            }else{
                if(((TreeSetClass) o).age>this.age){
                    return 1;
                }else {
                    return -1;
                }
            }
        }else {
            return 0;
        }
    }
}

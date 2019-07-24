package com.chengxiaoxiao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName: ComparableDemo
 * @description:
 * @author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2019-07-24
 */
public class ComparableDemo {

    public static void main(String[] args) {
        List<Person> p = new ArrayList<>();
        p.add(new Person("张三丰",50));
        p.add(new Person("迪丽热巴",18));
        p.add(new Person("杨幂",30));

        System.out.println(p);

        Collections.sort(p);

        System.out.println(p);

    }
}
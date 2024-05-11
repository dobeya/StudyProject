package com.study.main;

import sun.reflect.generics.tree.Tree;

import javax.swing.event.TreeExpansionEvent;
import java.util.*;

/**
 * @author caoyg
 * @date
 * @description
 */
public class InDoor {

    public static void main(String[] args) {
        TreeSet<Object> objects = new TreeSet<>(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                if (null == o1 || null == o2) {
                    throw new RuntimeException("不允许传入空值");
                }
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        objects.add("efg");
        objects.add("abc");
        objects.add("hig");
        System.out.println(objects);
        objects.add("klm");
        TreeSet<Object> objects1 = new TreeSet<>();
        objects.add("sss");
        objects.add(new Object());
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        ThreadLocal<Object> tl = new ThreadLocal<>();
        tl.set(new Object());
        for (Object o : objectObjectHashMap.keySet()) {
            
        }

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            
        }

        Iterator<Object> iterator = objectObjectHashMap.keySet().iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            
        }


    }

}

class ActionImpl implements Action{
    @Override
    public void showMsg() {

    }
}

interface Action{
    public void showMsg();
}
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
        TreeSet<Object> objects = new TreeSet<>();
        objects.add("测试");

        UseTest useTest = new UseTest();
        useTest.UseTestShow();

    }

    public void branchMethod(){
        System.out.println("hello");
    }

    public String otherMethod(){
        System.out.println("你好！");
        return null;
    }
}


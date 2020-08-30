package com.sikiedu.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @date 2020/8/30 0030 14:25:31
 * @description
 */
public class Demo {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 10; i++) {
            List list=new ArrayList();
            a++;
            Demo2.test2();
            test();
        }
        test();
    }

    public static void test(){
           System.out.println("exec test Method");
        }

}

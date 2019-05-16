package com.bsoft;

import java.lang.reflect.Method;

/**
 * @ClassName: TestSingle
 * @Description: TODO
 * @Author: zhuangy
 * @Date: 2019-05-16 09:32
 **/
public class TestSingle {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("com.bsoft.Single");
        Single s1 = Single.getInstance();
        Method method = clazz.getMethod("getInstance");
        Single s2 = (Single) method.invoke(s1,null);
        System.out.println(s1 == s2);
    }


}

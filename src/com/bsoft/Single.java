package com.bsoft;

/**
 * @ClassName: Single
 * @Description: TODO
 * @Author: zhuangy
 * @Date: 2019-05-16 09:29
 **/
public class Single {
    private Single() {

    }

    private static class Loader {
        private final static Single INSTANCE = new Single();
    }

    public static final Single getInstance() {
        return Loader.INSTANCE;
    }
}

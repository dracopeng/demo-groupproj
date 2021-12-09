package com.example1;

public class Spotbugs1501 {
    void test(){
        String var = "hello world";
        String.format(var + " GitHub.\n"); // no warning (false negative)
    }
    
    void test01(){
        String.format("hello world" + "test01" + " GitHub.\n"); // warning
    }
}

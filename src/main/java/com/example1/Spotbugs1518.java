package com.example1;

public class Spotbugs1518 {
    void test(){
        Random random = new Random();
        float f = random.nextFloat() * num; // no warning (false negative)
    }
}

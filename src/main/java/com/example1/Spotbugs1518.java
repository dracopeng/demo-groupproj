package com.example1;

import java.util.Random;

public class Spotbugs1518 {
    void test(){
        Random random = new Random();
        float num;
        num = 3;
        float f = random.nextFloat() * num; // no warning (false negative)
    }
}

package com.example1;

import java.util.Random;

public class Spotbugs1518 {
    void test(){
        Random random = new Random();
        float num = 1;
        float f = random.nextFloat() * num; // no warning (false negative)
    }
}
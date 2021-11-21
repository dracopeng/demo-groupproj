package com.example1;

public class Spotbugs1517 {
    void test00(){
        int i = 0;
        // i = 2 + (i++); // no warning (false negative)'
        i = 2;
    }
}

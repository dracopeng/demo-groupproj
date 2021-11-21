package com.example1;

public class Spotbugs1759 {
    ArrayList<Integer> lst = new ArrayList<Integer>();
    Integer[] res;
    public Integer[] asArray() {
        res = (Integer[]) ((Object[])(lst.toArray()));  // should report a warning here
        return this.res;
    }
}

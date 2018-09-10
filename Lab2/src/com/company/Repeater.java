package com.company;

public class Repeater {
    public int[] Repeat (int[] a){
        int[] ar = new int[a.length*2];
        for (int i =0; i<a.length;i++ ){
            ar[i*2]=a[i];
            ar[i*2+1]=a[i];
        }
        return ar;

    }
}

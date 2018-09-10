package com.company;

public class Main {


    /*public static String digWord (int d, int pl){
        switch ()

    }

    public static String inWords (int num){

    }*/


    public static void main(String[] args) {

        /*StarTriangle small = new StarTriangle(3);
        System.out.println(small.toString());

        Analyzer an = new Analyzer();
        an.run();*/
        int[] a = new int[5];

        for (int i = 0; i<a.length; i++)
            a[i]=i+1;
        Repeater rep = new Repeater();
        int [] ar = rep.Repeat(a);
        for (int i =0; i<ar.length; i++){
            System.out.print(ar[i]+ " ");
        }


    }
}

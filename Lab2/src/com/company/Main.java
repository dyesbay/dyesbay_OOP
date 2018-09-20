package com.company;

public class Main {


    /*public static String digWord (int d, int pl){
        switch ()

    }

    public static String inWords (int num){

    }*/


    public static void main(String[] args) {

        //StarTriangle
        /*StarTriangle small = new StarTriangle(3);
        System.out.println(small.toString());
*/
//Analyzer
      //  Analyzer an = new Analyzer();
        //an.run();

        //Repeat
//
//        int[] a = new int[5];
//
//        for (int i = 0; i<a.length; i++)
//            a[i]=i+1;
//        Repeater rep = new Repeater();
//        int [] ar = rep.Repeat(a);
//        for (int i =0; i<ar.length; i++){
//            System.out.print(ar[i]+ " ");
//        }

        //Time
//        Time t = new Time ( 23, 56, 5);
//        System.out.println(t.toStandard());
//        System.out.println(t.toUniversal());
//        Time t2 = new Time (5, 10 ,40);
//        System.out.println(t2.toUniversal());
//        t.add(t2);
//        System.out.println(t.toUniversal());

        //Words
        System.out.println(inWords(9999));



    }
    public static String inWords(int a){
        switch (a) {
            case 1:
                return "one ";
            case 2:
                return "two ";
            case 3:
                return "three ";
            case 4:
                return "four ";
            case 5:
                return "five ";
            case 6:
                return "six ";
            case 7:
                return "seven ";
            case 8:
                return "eight ";
            case 9:
                return "nine " ;
            case 10:
                return "ten ";
            case 11:
                return "eleven ";
            case 12:
                return "twelve ";
            case 13:
                return "thirteen ";
            case 14:
                return "fourteen ";
            case 15:
                return "fifteen ";
            case 16:
                return "sixteen ";
            case 17:
                return "seventeen ";
            case 18:
                return "eighteen ";
            case 19:
                return "nineteen ";
            case 20:
                return "twenty ";
            case 30:
                return "thirty ";
            case 40:
                return "fourty ";
            case 50:
                return "fifty ";
            case 60:
                return "sixty ";
            case 70:
                return "seventy ";
            case 80:
                return "eighty ";
            case 90:
                return "ninety ";
        }
        if (a>20 && a < 100){
            String s = inWords(a%100-a%10) + inWords(a%10);
            return s;
        }

        else if (a>99 && a < 1000){
            String s = inWords(a/100) + "hundred [and] " + inWords(a%100) ;
            return s;
        }

        else if (a>999 ){
            String s = inWords(a/1000) + "thousand " + inWords(a%1000);
            return s;
        }
        else return "zero";
    }
}

package com.company;

import java.util.Scanner;

public class Analyzer {
    public void run (){
        Scanner reader = new Scanner(System.in);
        Data cData= new Data();
        while (true){
            System.out.print("Enter number(Q to quit): ");
            String s = reader.nextLine();
            if (s.equals("Q" ) || s.equals("q")) {
                System.out.println("Average = " + cData.getAvg());
                if (cData.getSize()>0)
                    System.out.println("Max = " + cData.getMax());
                break;
            }
            else
                cData.add(Double.parseDouble(s));

        }
    }
}

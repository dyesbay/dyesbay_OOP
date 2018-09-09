package com.company;

public class Data {
    private double Avg;
    private double Max;
    private int Size;
    Data (){
        Avg=0;
        Size=0;
    };
    public void add (double d){
        if (Size==0)
            Max=d;
        else if (d>Max)
            Max=d;
        Avg=(Avg*Size+d)/++Size;

    }
    public double getAvg(){
        return Avg;
    }
    public double getMax (){
        return Max;
    }
    public int getSize (){
        return Size;
    }
}

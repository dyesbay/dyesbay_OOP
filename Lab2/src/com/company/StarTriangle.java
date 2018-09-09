package com.company;

public class StarTriangle {
    private int Size;
    StarTriangle(int a){
        Size= a;
    }
    public String toString(){
        String s = new String();
        for (int j = 1; j<=Size; j++){
            for (int i =1; i<=j;i++)
                s+="[*]";
            s+="\n";
        }
        return s;
    }
}
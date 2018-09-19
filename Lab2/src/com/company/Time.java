package com.company;

public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time (int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    String toUniversal(){
        String s = new String();
        if (hour<10)
            s+="0" + hour + ":";
        else s+= hour + ":";
        if (minute<10)
            s+="0" + minute + ":";
        else s+= minute + ":";
        if (second<10)
            s+="0" + second;
        else s+= second;
        return s;

    }

    String toStandard(){
        String s = new String();
        String a = "AM";
        int h=hour;
        if (hour >=12){
            a = "PM";
            h-=12;
        }
        if (hour<10)
            s+="0" + h + ":";
        else s+= h+ ":";
        if (minute<10)
            s+="0" + minute + ":";
        else s+= minute + ":";
        if (second<10)
            s+="0" + second;
        else s+= second;
        s+=" " + a;
        return s;
    }

}

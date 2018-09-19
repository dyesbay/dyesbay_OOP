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
    public int getHour () {
        return hour;
    }
    public int getMinute () {
        return minute;
    }
    public int getSecond () {
        return second;
    }
    
    public void setHour (int hour){
        this.hour=hour%24;
    }
    public void setMinute (int minute){
        this.minute=minute%60;
    }
    public void setSecond (int second){
        this.second=second%24;
    }
    public void add (Time time){
        int tempM = (this.second + time.getSecond())/60;
        this.second+=time.getSecond();
        this.second%=60;
        int tempH = this.minute + time.getMinute() + tempM;
        tempH/=60;
        this.minute+=time.getMinute()+ tempM;
        this.minute%=60;
        this.hour+=time.getHour()+tempH;
        this.hour%=24;
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

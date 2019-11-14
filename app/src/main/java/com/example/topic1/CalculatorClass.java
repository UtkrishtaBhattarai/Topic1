package com.example.topic1;

import android.widget.TextView;

public class CalculatorClass {

    private int first, second;
    private TextView tvdisplay;

    public void setTvdisplay(TextView tvdisplay) {
        this.tvdisplay = tvdisplay;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int addResult() {
        int result = first + second;
        return result;
    }

    public int subractresult() {
        Integer result = first - second;
        return result;
    }

    public int multiplyresult() {
        Integer result = first * second;
        return result;
    }

    public int divideresult() {
        Integer result = first / second;
        return result;
    }

    public String foradd() {
        return first + "+" + second;
    }

    public String forsub() {
        return first + "-" + second;
    }

    public String formultiply() {
        return first + "*" + second;
    }

    public String fordivide() {
        return first + "/" + second;
    }


}

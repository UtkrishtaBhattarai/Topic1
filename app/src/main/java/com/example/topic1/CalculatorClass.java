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


}

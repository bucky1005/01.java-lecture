package com.ohgiraffers.chap04.section01.greedy;

class Time implements Comparable<Time> {
    public int start, end;
    Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time o){
        if(this.end ==o.end) return this.start-o.start;
        else return this.end -o.end;
    }

}

package com.chsoft.common;


/**
 * Created by zhuhuihui on 17/2/23.
 */
public final class Test1 {
    private char value[] = null;

    private Test1(){
        this.value = new char['1'];
    }

    private Test1(String name){
        this.value = name.toCharArray();
    }

    public void put(){
        this.value = new char['2'];
    }

    public static  void main(String[] args){

    }
}

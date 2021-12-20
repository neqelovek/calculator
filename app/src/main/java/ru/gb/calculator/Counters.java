package ru.gb.calculator;

import java.io.Serializable;

public class Counters implements Serializable {

    private final int value1;
    private final int value2;
    private final int value3;
    private final int value4;
    private final int value5;
    private final int value6;
    private final int value7;
    private final int value8;
    private final int value9;
    private final int value0;
    private final char valuePlus;
    private final char valueMinus;
    private final char valueEqually;
    private final char valueMultiply;
    private final char valueShare;
    private final char valuePoint;
    private final char valueClean;
    private final char valuePercent;
    private final String valueCleanAll;
    private final String valueMemoryClean;
    private final String valueMemoryPlus;
    private final String valueMemoryMinus;
    private final String valueMemoryRead;


    public Counters() {

        value1 = 1;
        value2 = 2;
        value3 = 3;
        value4 = 4;
        value5 = 5;
        value6 = 6;
        value7 = 7;
        value8 = 8;
        value9 = 9;
        value0 = 0;
        valuePlus = '+';
        valueMinus = '-';
        valueEqually = '=';
        valueMultiply = '*';
        valueShare = '/';
        valuePoint = '.';
        valueCleanAll = "CE";
        valueClean = 'C';
        valuePercent = '%';
        valueMemoryClean = "MC";
        valueMemoryPlus = "M+";
        valueMemoryMinus = "M-";
        valueMemoryRead = "MR";



    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    public int getValue3() {
        return value3;
    }

    public int getValue4() {
        return value4;
    }

    public int getValue5() {
        return value5;
    }

    public int getValue6() {
        return value6;
    }

    public int getValue7() {
        return value7;
    }

    public int getValue8() {
        return value8;
    }

    public int getValue9() {
        return value9;
    }

    public int getValue0() {
        return value0;
    }

    public char getValuePlus() {
        return valuePlus;
    }

    public char getValueMinus() {
        return valueMinus;
    }

    public char getValueEqually() {
        return valueEqually;
    }

    public char getValueMultiply() {
        return valueMultiply;
    }

    public char getValueShare() {
        return valueShare;
    }

    public char getValuePoint() {
        return valuePoint;
    }

    public String getValueCleanAll() {
        return valueCleanAll;
    }

    public char getValueClean() {
        return valueClean;
    }

    public char getValuePercent() {
        return valuePercent;
    }

    public String getValueMemoryClean() {
        return valueMemoryClean;
    }

    public String getValueMemoryPlus() {
        return valueMemoryPlus;
    }

    public String getValueMemoryMinus() {
        return valueMemoryMinus;
    }

    public String getValueMemoryRead() {
        return valueMemoryRead;
    }
}


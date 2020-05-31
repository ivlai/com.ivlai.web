package com.ivlai.entity;

public class TheTest {

    private Integer column1;

    private String str;

    @Override
    public String toString() {
        return "TheTest{" +
                "column1=" + column1 +
                ", str='" + str + '\'' +
                '}';
    }

    public Integer getColumn1() {
        return column1;
    }

    public void setColumn1(Integer column1) {
        this.column1 = column1;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}

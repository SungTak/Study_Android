package com.yst.study.book.part12.model;

/**
 * Created by Naver on 2015-08-14.
 */
public class CustomView {
    private int index;
    private String name;
    public CustomView(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public int getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }
}

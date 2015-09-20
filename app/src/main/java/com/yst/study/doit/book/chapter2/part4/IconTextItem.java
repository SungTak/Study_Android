package com.yst.study.doit.book.chapter2.part4;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.List;

/**
 * 리스트 뷰에 담을 한 row에 대한 레이아웃
 * 각 아이템임 (모델객체)
 *
 * Created by Naver on 2015-09-20.
 */
public class IconTextItem {
    private Drawable icon;
    private List<String> textData;

    public IconTextItem(Drawable icon, List<String> textData) {
        this.icon = icon;
        this.textData = textData;
    }

    public IconTextItem(Drawable icon, String text1, String text2, String text3) {
        this.icon = icon;
        this.textData = new ArrayList<>();
        this.textData.add(text1);
        this.textData.add(text2);
        this.textData.add(text3);
    }

    public List<String> getTextData() {
        return this.textData;
    }

    public String getTextData(int index) {
        if (textData == null || index > textData.size()) {
            return "";
        }

        return textData.get(index);
    }

    public void setTextData(List<String> textData) {
        this.textData = textData;
    }

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }
}

package com.yst.study.doit.book.chapter2.part4;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yst.study.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 최상단 리니어레이아웃임(각 로우에 보여줄 레이아웃)
 * 각 아이템 화면임
 *
 * Created by Naver on 2015-09-20.
 */
public class IconTextView extends LinearLayout {
    private ImageView imageView;
//    private TextView textView1;
//    private TextView textView2;
//    private TextView textView3;

    private List<TextView> textViews;

    public IconTextView(Context context, IconTextItem item) {
        super(context);

        this.textViews = new ArrayList<>();

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.doit_chapter2_part4_listitem, this, true);

        // 해당 레이아웃에서 뷰들을 찾는다.
        imageView = (ImageView) findViewById(R.id.doit_ch2_part4_iconItem);

        textViews.add((TextView) findViewById(R.id.doit_ch2_part4_dataitem1));
        textViews.add((TextView) findViewById(R.id.doit_ch2_part4_dataitem2));
        textViews.add((TextView) findViewById(R.id.doit_ch2_part4_dataitem3));

        // 모델에 저장된 데이터를 세팅한다.
        imageView.setImageDrawable(item.getIcon());
        for (int i = 0; i < textViews.size(); i++) {
            textViews.get(i).setText(item.getTextData(i));
        }

//        textView1 = (TextView) findViewById(R.id.doit_ch2_part4_dataitem1);
//        textView1.setText(item.getTextData(0));
//
//        textView2 = (TextView) findViewById(R.id.doit_ch2_part4_dataitem2);
//        textView2.setText(item.getTextData(1));
//
//        textView3 = (TextView) findViewById(R.id.doit_ch2_part4_dataitem3);
//        textView3.setText(item.getTextData(2));
    }

    public void setText(int index, String text) {
        textViews.get(index).setText(text);

//        if (index == 0) {
//            textView1.setText(text);
//        } else if (index == 1) {
//            textView2.setText(text);
//        } else if (index == 2) {
//            textView3.setText(text);
//        } else {
//            throw new IllegalArgumentException();
//        }
    }

    public void setIcon(Drawable icon) {
        imageView.setImageDrawable(icon);
    }
}

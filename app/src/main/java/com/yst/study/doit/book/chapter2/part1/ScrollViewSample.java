package com.yst.study.doit.book.chapter2.part1;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.yst.study.R;

/**
 * Created by Naver on 2015-09-06.
 */
public class ScrollViewSample extends Activity {
    private ScrollView scrollView;
    private ImageView imageView;
    private BitmapDrawable bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doit_chapter2_part1_scroll_view);

        scrollView = (ScrollView)findViewById(R.id.doit_ch2_part1_scrollView);
        imageView = (ImageView)findViewById(R.id.doit_ch2_part1_imageView);
        Button button = (Button)findViewById(R.id.doit_ch2_part1_change_image_btn);

        scrollView.setHorizontalScrollBarEnabled(true);

        Resources resources = getResources();
        bitmap = (BitmapDrawable)resources.getDrawable(R.drawable.brown);

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmap.getIntrinsicWidth();
        imageView.getLayoutParams().height = bitmap.getIntrinsicHeight();
    }

    public void onClickChangeImage(View v) {
        changeImage();
    }

    private void changeImage() {
        Resources resources = getResources();
        bitmap = (BitmapDrawable)resources.getDrawable(R.drawable.rirakkuma);

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmap.getIntrinsicWidth();
        imageView.getLayoutParams().height = bitmap.getIntrinsicHeight();
    }
}

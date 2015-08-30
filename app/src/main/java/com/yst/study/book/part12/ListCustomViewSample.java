package com.yst.study.book.part12;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.yst.study.R;
import com.yst.study.book.part12.adapter.CustomAdapter;
import com.yst.study.book.part12.model.CustomView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Naver on 2015-08-14.
 */
public class ListCustomViewSample extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_board);

        List<CustomView> customViews = new ArrayList<>();

        for (int i = 0; i < 10; i ++) {
            System.out.print(i);
            CustomView customView = new CustomView(i, i + "m번째 게시물입니다");
            customViews.add(customView);
        }

        CustomAdapter customAdapter = new CustomAdapter(this, R.layout.custom_part_view, customViews);

        ListView customListView = (ListView)findViewById(R.id.custom_list_view);
        customListView.setAdapter(customAdapter);

    }
}

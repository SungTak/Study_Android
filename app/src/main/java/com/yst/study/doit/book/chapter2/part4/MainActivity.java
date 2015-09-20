package com.yst.study.doit.book.chapter2.part4;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.yst.study.R;

/**
 * Created by Naver on 2015-09-20.
 */
public class MainActivity extends Activity {
    ListView listView;
    IconTextListAdapter listAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doit_chapter2_part4_activity_main);

        listView = (ListView) findViewById(R.id.doit_ch2_part4_listView1);
        listAdapter = new IconTextListAdapter(this);

        Resources resources = getResources();
        listAdapter.addItem(new IconTextItem(resources.getDrawable(R.drawable.icon05), "test", "33000", "900"));
        listAdapter.addItem(new IconTextItem(resources.getDrawable(R.drawable.icon05), "test2", "13000", "500"));

        listView.setAdapter(listAdapter);

        // 클릭 이벤트
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                IconTextItem textItem = (IconTextItem)listAdapter.getItem(position);
                String text1 = textItem.getTextData(0);

                Toast.makeText(getApplicationContext(), "selected : " + text1, Toast.LENGTH_LONG).show();
            }
        });

    }
}

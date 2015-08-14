package com.yst.study.book.part12;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.yst.study.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Naver on 2015-08-01.
 */
public class ListViewSample extends Activity {
    public void onCreate(Bundle savedInstantState) {
        super.onCreate(savedInstantState);
        setContentView(R.layout.listviewtest);

        List<String> peoples = createPeoples();
        ArrayAdapter<String> adapters = createArrayAdapter(peoples);

        ListView listView = (ListView)findViewById(R.id.list_view_test);
        listView.setAdapter(adapters);
    }

    private List<String> createPeoples() {
        List<String> peoples = new ArrayList<>();
        peoples.add("¿±º∫≈π");
        peoples.add("æ»¡§πŒ");
        peoples.add("±Ë≈¬»Ø");
        peoples.add("english name");

        return peoples;
    }

    private ArrayAdapter<String> createArrayAdapter(List<String> peoples) {
        return new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, peoples);
    }
}

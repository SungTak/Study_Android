package com.yst.study.doit.book.chapter2.part4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 리스트뷰에 보여줄 어댑터
 * 아이템들을 가지고 있고(커스텀 내용 -> 리스트 뷰용)
 *
 * Created by Naver on 2015-09-20.
 */
public class IconTextListAdapter extends BaseAdapter {
    private Context context;
    private List<IconTextItem> items;

    public IconTextListAdapter(Context context) {
        this.context = context;
        this.items = new ArrayList<>();
    }

    public void addItem(IconTextItem item) {
        items.add(item);
    }

    /**
     * getView에서 getCount를 내부적으로 호출함
     * 리턴 0을 주면 아무것도 안나옴(데이터 리스트가 있더라도)
     *
     * @return
     */
    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        IconTextView iconTextView;

        if (convertView == null) {
            iconTextView = new IconTextView(context, items.get(position));
        } else {
            iconTextView = (IconTextView) convertView;
        }

        // 어댑터에 저장된 아이템 모델 데이터를 각 아이템 뷰에 넣는다.
        iconTextView.setIcon(items.get(position).getIcon());

        for (int i = 0; i < items.size(); i++) {
            iconTextView.setText(i, items.get(position).getTextData(i));
        }

        return iconTextView;
    }
}

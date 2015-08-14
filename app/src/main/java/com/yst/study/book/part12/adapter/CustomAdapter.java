package com.yst.study.book.part12.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.yst.study.R;
import com.yst.study.book.part12.model.CustomView;

import java.util.List;

/**
 * Created by Naver on 2015-08-14.
 */
public class CustomAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    private List<CustomView> customViews;
    private int layout;

    /**
     *
     * @param context ����Ʈ�並 ������ �ִ� �༮�ε�..
     * @param layout Ŀ���� ���� ��(��� ���)
     * @param customViews Ŀ���� �� ����Ʈ
     */
    public CustomAdapter(Context context, int layout, List<CustomView> customViews) {
        this.context = context;
        this.layout = layout;
        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.customViews = customViews;
    }

    @Override
    public int getCount() {
        return customViews.size();
    }

    @Override
    public Object getItem(int position) {
        return customViews.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(this.layout, parent, false);
        }

        TextView title = (TextView)convertView.findViewById(R.id.custom_title);
        title.setText(customViews.get(position).getName());

        return convertView;
    }
}

package com.yst.study.book.part20;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yst.study.R;

/**
 * Created by Naver on 2015-09-02.
 */
public class TextFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.part20_text_fragment, container, false);

        TextView textView = (TextView) root.findViewById(R.id.part20_edittext);
        textView.setSaveEnabled(true);
        return root;
    }
}

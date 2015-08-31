package com.yst.study.book.part20;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.yst.study.R;

/**
 * Created by Naver on 2015-08-31.
 */
public class CounterFragment extends android.app.Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.part20_counter_fragment, container, false);

        Button incrementBtn = (Button) root.findViewById(R.id.part20_button_increment);
        final TextView textCounter = (TextView) root.findViewById(R.id.part20_text_counter);

        incrementBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = Integer.parseInt(textCounter.getText().toString());
                textCounter.setText(Integer.toString(count + 1));
            }
        });

        return root;
    }
}

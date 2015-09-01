package com.yst.study.book.part20;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.yst.study.R;

/**
 * Created by Naver on 2015-09-02.
 */
public class ReplaceFragmentSample extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.part20_replace_fragment_layout);
    }

    public void part20AddFragmentEvent(View v) {
        FragmentManager fragmentManager = getFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.part20_frame_layout);

        if (fragment != null) {
            Toast.makeText(this, "exist Fragment!", Toast.LENGTH_SHORT).show();
            return;
        }

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        CounterFragment counterFragment = new CounterFragment();

        transaction.add(R.id.part20_frame_layout, counterFragment, "counter");
        transaction.commit();
    }

    public void part20RemoveFragmentEvent(View v) {
        FragmentManager fragmentManager = getFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.part20_frame_layout);

        if (fragment == null) {
            Toast.makeText(this, "프래그먼트 없음", Toast.LENGTH_SHORT).show();
            return;
        }

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.remove(fragment);
        transaction.commit();
    }

    public void part20ReplaceFragmentEvent(View v) {
        FragmentManager fragmentManager = getFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.part20_frame_layout);

        if (fragment == null) {
            Toast.makeText(this, "Not Exist Fragment", Toast.LENGTH_SHORT).show();
            return;
        }

        FragmentTransaction transaction = fragmentManager.beginTransaction();

        if (fragment.getTag() == "counter") {
            TextFragment textFragment = new TextFragment();
            transaction.replace(R.id.part20_frame_layout, textFragment, "text");
        } else {
            CounterFragment counterFragment = new CounterFragment();
            transaction.replace(R.id.part20_frame_layout, counterFragment, "counter");
        }

        transaction.commit();
    }

    public void part20HideFragmentEvent(View v) {
        FragmentManager fragmentManager = getFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.part20_frame_layout);

        if (fragment == null) {
            Toast.makeText(this, "Not Exist Fragment !!", Toast.LENGTH_SHORT).show();
            return;
        }

        FragmentTransaction transaction = fragmentManager.beginTransaction();

        if (fragment.isHidden()) {
            transaction.show(fragment);
        } else {
            transaction.hide(fragment);
        }

        transaction.commit();
    }
}

package com.nalazoocare.layoutinflater;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

/**
 * Created by nalazoo.yeomeme@gmail.com on 2020-07-07
 */
public class Sub extends LinearLayout {
    public Sub(Context context, AttributeSet attrs) {
        super(context);
        init(context);
    }

    public Sub(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.sub, this,true);
    }
}

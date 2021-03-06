package com.davidhan.kit.boiled;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * name: EzLinearLayout
 * desc:
 * date: 2015-06-14
 * author: David
 * Copyright (c) 2015 David Han
 */
public abstract class BoiledLinearLayout extends LinearLayout {
    public BoiledLinearLayout(Context context) {
        super(context);
        init();
    }

    public BoiledLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public BoiledLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    protected void init() {

    }
    protected void setContentView(int resId) {
        inflate(getContext(), resId, this);
    }
}

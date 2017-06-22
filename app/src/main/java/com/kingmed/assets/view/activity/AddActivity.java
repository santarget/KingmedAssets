package com.kingmed.assets.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.kingmed.assets.R;
import com.kingmed.assets.base.BaseActivity;
import com.kingmed.assets.util.StatusBarUtil;

/**
 * Created by ssy on 2017/6/22.
 */

public class AddActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        StatusBarUtil.setColor(this, getResources().getColor(R.color.colorPrimaryDark));
    }
}

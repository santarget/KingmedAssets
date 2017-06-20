package com.kingmed.assets.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.v7.widget.Toolbar;

import com.kingmed.assets.R;
import com.kingmed.assets.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ssy on 2017/6/20.
 */

public class SettingsActivity extends BaseActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.appbar)
    AppBarLayout appbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
    }
}

package com.kingmed.assets.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.kingmed.assets.R;
import com.kingmed.assets.base.BaseActivity;
import com.kingmed.assets.util.StatusBarUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ssy on 2017/6/20.
 */

public class MainActivity extends BaseActivity {
    @BindView(R.id.tvAdd)
    TextView tvAdd;
    @BindView(R.id.tvQuery)
    TextView tvQuery;
    @BindView(R.id.tvCheck)
    TextView tvCheck;
    @BindView(R.id.tvSettings)
    TextView tvSettings;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StatusBarUtil.setTransparent(this);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.tvAdd, R.id.tvQuery, R.id.tvCheck, R.id.tvSettings})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvAdd:
                startActivity(new Intent(this, AddActivity.class));
                break;
            case R.id.tvQuery:
                startActivity(new Intent(this, QueryActivity.class));
                break;
            case R.id.tvCheck:
                startActivity(new Intent(this, CheckActivity.class));
                break;
            case R.id.tvSettings:
                startActivity(new Intent(this, SettingsActivity.class));
                break;
        }
    }
}

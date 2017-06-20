package com.kingmed.assets.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.kingmed.assets.R;
import com.kingmed.assets.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ssy on 2017/6/20.
 */

public class SplashActivity extends BaseActivity {

    @BindView(R.id.ivLogo)
    ImageView ivLogo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                toLoginOrMain();
            }
        }, 1500l);
    }

    private void toLoginOrMain() {
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }
}

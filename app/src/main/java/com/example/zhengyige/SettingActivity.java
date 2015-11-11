package com.example.zhengyige;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by Duan on 2015/10/22.
 */
public class SettingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.setting_activity);
    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}

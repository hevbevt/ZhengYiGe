package com.example.zhengyige;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by Duan on 2015/10/21.
 */
public class FacetofaceActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.facetoface_main);
    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }

}

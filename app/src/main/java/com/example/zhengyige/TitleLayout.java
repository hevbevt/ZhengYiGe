package com.example.zhengyige;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

/**
 * Created by Duan on 2015/10/21.
 */
public class TitleLayout extends RelativeLayout {

    public TitleLayout (Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title_layout, this);
        Button backButton = (Button) findViewById(R.id.back_button);
        Button editButton = (Button) findViewById(R.id.edit_button);

        backButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity) getContext()).finish();
            }
        });
    }
}

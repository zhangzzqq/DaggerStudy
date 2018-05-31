package com.example.dagger2test.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.dagger2test.R;
import com.example.dagger2test.User;

import javax.inject.Inject;

/**
 * Created by steven on 2018/5/31.
 */
//BActivity.java
public class BActivity extends AppCompatActivity {
    @Inject
    User user;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
//        App.get(this).getUserComponent().plus(new BModule()).inject(this);
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText("username:"+user.getName()+"--user:"+user);

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BActivity.this, CActivity.class));
            }
        });
    }


}


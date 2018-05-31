package com.example.dagger2test.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.dagger2test.App;
import com.example.dagger2test.MainActivity;
import com.example.dagger2test.R;

/**
 * Created by steven on 2018/5/31.
 */
//CActivity.java
public class CActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);


        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                App.get(CActivity.this).releaseUserComponent();
                startActivity(new Intent(CActivity.this, MainActivity.class));
                finish();
            }
        });

    }
}


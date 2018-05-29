package com.example.administrator.dagger2study;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.gson.Gson;

import javax.inject.Inject;

/**
 * 官方文档
 * <p>
 * https://google.github.io/dagger/users-guide
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Inject
    Student student;

    @Inject
    A a;

    @Inject
    Gson gson;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        DaggerAComponent.builder().build().inject(this);


        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        Button btn4 = findViewById(R.id.button4);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);

        init();

    }


    private void init() {

//        a = DaggerAComponent.builder().build().a();
        DaggerAComponent.builder().build().inject(this);


    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.button1:
                Toast.makeText(this, student.toString(), Toast.LENGTH_SHORT).show();
                break;

            case R.id.button2:
                a.doSomething();
                break;

            case R.id.button3:
                a.field = "test";
                String aStr = gson.toJson(a);
                Log.e("mainactivity", "astr = " + aStr);
                break;


        }
    }


}

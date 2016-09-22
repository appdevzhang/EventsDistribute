package com.appdevzhang.eventsdistribute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button clickBtn;
    private ImageView clickImage;
    private Button clickBtn1,clickBtn2;
    private MyLayout mMyLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickBtn = (Button) this.findViewById(R.id.click_btn);
        clickImage = (ImageView) this.findViewById(R.id.click_iv);
        mMyLayout = (MyLayout) this.findViewById(R.id.my_layout);
        clickBtn1 = (Button) this.findViewById(R.id.click_btn1);
        clickBtn2 = (Button) this.findViewById(R.id.click_btn2);

        clickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG","onClick execute");
            }
        });

        clickBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.d("TAG","btn onTouch execute" + event.getAction());
                return false;
            }
        });

        clickImage.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.d("TAG","image onTouch execute" + event.getAction());
                return false;
            }
        });

        mMyLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.d("TAG","myLayout on touch" + event.getAction());
                return false;
            }
        });

        clickBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG","You clicked button1");
            }
        });

        clickBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG","You clicked button2");
            }
        });

    }
}

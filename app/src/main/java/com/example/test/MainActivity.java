package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private EditText ed;
    private ProgressBar pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        View btn = findViewById(R.id.btn);
//        // 点击事件
//        btn.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                System.out.println("点击事件");
//            }
//        });
//        // 长按事件
//        btn.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                System.out.println("点击长按事件");
//                return false;
//            }
//        });
//        // 触摸事件
//        btn.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                System.out.println("触摸事件"+event.getAction());
//                return false;
//            }
//        });


        View editbtn = findViewById(R.id.editbtn);
        ed = findViewById(R.id.edit);
        editbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ed.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                String name = ed.getText().toString();
                System.out.println("用户名为："+name);
            }
        });

        View showbtn = findViewById(R.id.showbtn);
        pb = findViewById(R.id.probar);
        editbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("点击事件000");
                if(pb.getVisibility() == View.GONE){
                    pb.setVisibility(View.VISIBLE);
                }else{
                    pb.setVisibility(View.GONE);
                }
            }
        });

    }

    // 处理点击事件
    public void handleClick(View v) {
        System.out.println("点击事件");
        View editText = findViewById(R.id.edit);
    }

}
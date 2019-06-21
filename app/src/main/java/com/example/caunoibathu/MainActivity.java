package com.example.caunoibathu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btnShowResult;
    TextView tvResult;
    ArrayList<String> listQuotations;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


    }

    private void init(){
        btnShowResult = findViewById(R.id.btnShowResult);
        tvResult = findViewById(R.id.tvResult);
        listQuotations = new ArrayList<>();

        listQuotations.add("Khi quyết định làm một việc , bạn có thể thất bại. Nhưng nếu ko làm , cơ hội thất bại cũng ko có");
        listQuotations.add("Hồi lớp 10, mình với nó ngồi ở bờ sông và mình tỏ tình. Nó từ chối, mình phồng má trợn mắt lên vác xe đạp của nó lẳng vào bụi gai và hét “có yêu không”. Nó sợ quá khóc lên rồi gật đầu nói nhỏ “có, nhưng đừng cho ai biết nhé”…\n" +
                "Bạn mất trắng những cú golf khi bạn chọn không đánh.");
        listQuotations.add("Sự khác biệt luôn khiến người khác phải khó chịu'' ");
        listQuotations.add("Vận tốc ánh sáng nhanh hơn âm thanh Nên ngta nhìn có vẻ thông minh cho đến khi họ phát biểu.");
        listQuotations.add("Khi một con muỗi đậu lên 2 hòn bi của bạn ... Đó là lúc bạn biết bạo lực k phải là cách tốt để giải quyết 1 vần đề - trích vozer");

    }

    public  void showQuotation(View v){
        if (v.getId() == R.id.btnShowResult) {
            Random randomGenerator  = new Random();

            tvResult.setTextSize(randomGenerator.nextInt(20)+10);
            tvResult.setTextColor(Color.rgb(randomGenerator.nextInt(265),randomGenerator.nextInt(265),randomGenerator.nextInt(265)));

            switch (randomGenerator.nextInt(3)){
                case 0:tvResult.setGravity(Gravity.CENTER);
                break;
                case 1:tvResult.setGravity(Gravity.LEFT);
                break;
                case 2:tvResult.setGravity(Gravity.RIGHT);
            }


//            int a = randomGenerator.nextInt(4);
            //tvResult.setText(randomGenerator.nextInt(4)+"");
            ///tvResult.setText(listQuotations.get(a).toString());
            tvResult.setText(listQuotations.get(randomGenerator.nextInt(listQuotations.size()))+"");
        }
    }
    private void showToast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }


}

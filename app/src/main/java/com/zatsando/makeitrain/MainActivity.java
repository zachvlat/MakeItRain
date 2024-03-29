package com.zatsando.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
//    private Button showMoney;
//    private Button showTag;
    private int moneyCounter = 0;
    private TextView moneyText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moneyText = findViewById(R.id.money_text);
//        showMoney = findViewById(R.id.button_make_rain);
//        showTag = findViewById(R.id.button_show_tag);

//        showMoney.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("my tag", "onClick: show money");
//            }
//        });
    }

    public void showTag(View v){
        Toast.makeText(getApplicationContext(), "Hello There", Toast.LENGTH_LONG)
                .show();
    }

    public void makeItRain (View v){
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        moneyCounter += 1000;
        moneyText.setText(String.valueOf(numberFormat.format(moneyCounter)));

        if (moneyCounter==10000){
            Toast.makeText(getApplicationContext(), "Whoa slow down!", Toast.LENGTH_SHORT)
                    .show();
        }
        if (moneyCounter==50000){
            Toast.makeText(getApplicationContext(), "WTF!", Toast.LENGTH_SHORT)
                    .show();
        }
    }
}

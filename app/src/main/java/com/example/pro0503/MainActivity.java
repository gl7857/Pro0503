package com.example.pro0503;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView txView;
    int clicksNumber=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txView = findViewById(R.id.txView);
        btn = findViewById(R.id.btn);
    }


    public void clicked(View view) {
        clicksNumber++;
        txView.setText("This is a click number:"+clicksNumber);
        if (clicksNumber==6){
            txView.setText("Enough to click.Go to new start!");
            clicksNumber=0;
        }
    }
}
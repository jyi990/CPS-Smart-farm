package com.gachon.smartfarmforcps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //화면에 textview 객체들 참조
    TextView yieldTextView=findViewById(R.id.todayYield);;
    TextView temperatureTextView=findViewById(R.id.temperatureControlConnect);;
    TextView temperatureTomorrowTextView=findViewById(R.id.temperatureControlTommorrowCon);

    //서버로부터 받아올 값
    String todayYield="";
    String temperature="";
    String tomorrowTemperature="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //값들을 연결하여 화면 상에 띄움
        yieldTextView.setText(todayYield);
        temperatureTextView.setText(temperature);
        temperatureTomorrowTextView.setText(tomorrowTemperature);



    }
}
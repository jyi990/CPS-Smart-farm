package com.gachon.smartfarmforcps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TemperatureSensorActivity extends AppCompatActivity {

    private ImageView onButton;
    private ImageView offButton;

    private TextView sensorValue;
    private TextView compareValue;

    String sensorValueFromServer="";
    int compareVal=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_sensor);

        //이미지뷰->센서 상태에 따라 온, 오프 버튼을 번갈아 보여주는 이벤트
        onButton=findViewById(R.id.onBUtton);
        offButton=findViewById(R.id.offButton);

        if(sensorState()) {
            onButton.setVisibility(ImageView.VISIBLE);
            offButton.setVisibility(ImageView.INVISIBLE);
        }
        else{
            onButton.setVisibility(ImageView.INVISIBLE);
            offButton.setVisibility(ImageView.VISIBLE);
        }

        //현재 값을 받아와 보여주는 변수
        sensorValue=findViewById(R.id.currentValueConnect);
        sensorValue.setText(sensorValueFromServer);
        //전일과 비교한 값을 보여주는 변수
        compareValue=findViewById(R.id.compareValueTem);
        //계산하는 과정 추가 필요->함수 구현??
        compareValue.setText(compareVal);
    }

    //함수 기능 추가 필요
    private boolean sensorState() {
        return true;
    }


}


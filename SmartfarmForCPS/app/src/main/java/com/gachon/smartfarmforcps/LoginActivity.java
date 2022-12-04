package com.gachon.smartfarmforcps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class LoginActivity extends AppCompatActivity {

    private EditText idEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        idEditText=findViewById(R.id.idTy);
        passwordEditText=findViewById(R.id.passwordTy);

        //로딩 화면
        Intent intent = new Intent(this, LoadingActivity.class);
        startActivity(intent);

        //회원가입 버튼 이벤트
        Button registerButton=(Button)findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regIntent=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(regIntent);
            }
        });

        //로그인 버튼 이벤트
        Button loginButton=(Button)findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if 계정 정보 확인

                Intent loginIntent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(loginIntent);
            }
        });



    }

}
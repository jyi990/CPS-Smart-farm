package com.gachon.smartfarmforcps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class RegisterActivity extends AppCompatActivity {

    private UserDao mUserDao;
    private EditText nameEditText;
    private Spinner ageSpinner;
    private Spinner genderSpinner;

    private EditText idEditText;
    private EditText passwordEditText;
    private EditText telephoneEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //데이터 베이스 생성
        UserDatabase db= Room.databaseBuilder(getApplicationContext(),UserDatabase.class,"smartfarm_db")
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build();

        mUserDao=db.userDatabase();

        nameEditText=findViewById(R.id.nameTy);
        ageSpinner=findViewById(R.id.ageSpinner);
        genderSpinner=findViewById(R.id.genderSpinner);
        idEditText=findViewById(R.id.idRegisterTy);
        passwordEditText=findViewById(R.id.passwordRegisterTy);
        telephoneEditText=findViewById(R.id.telephoneTy);

        //회원가입 버튼 이벤트
        Button registerButton=findViewById(R.id.registerRegisterButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //데이터 삽입
                User user=new User();
                user.setName(nameEditText.getText().toString());
                user.setId(idEditText.getText().toString());
                user.setPassword(passwordEditText.getText().toString());
                user.setPhoneNumber(telephoneEditText.getText().toString());

                ageSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        user.setAge((Integer)adapterView.getItemAtPosition(i));
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });

                genderSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        user.setGender(adapterView.getItemAtPosition(i).toString());
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });
            }
        });


    }
}
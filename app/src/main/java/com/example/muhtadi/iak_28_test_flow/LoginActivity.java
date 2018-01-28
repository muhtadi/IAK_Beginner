package com.example.muhtadi.iak_28_test_flow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = LoginActivity.class.getSimpleName();
    /**
     * init variable view for login activity
     */
    private EditText et_username;
    private EditText et_password;
    private Button btn_cancel, btn_login;

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        /**
         * declare variable with the activity login layout
         */
        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);
        btn_cancel = findViewById(R.id.btn_cancel);
        btn_login = findViewById(R.id.btn_login);

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this, "Button cancel ditekan", Toast.LENGTH_SHORT).show();
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mUsername = et_username.getText().toString();
                String mPassword = et_password.getText().toString();

                if (TextUtils.isEmpty(mUsername)) {
                    et_username.setError("username tidak boleh kosong");
                }

                if (TextUtils.isEmpty(mPassword)) {
                    et_password.setError("pass tidak boleh kosong");
                }

                if (mUsername.equals(USERNAME) && mPassword.equals(PASSWORD)) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra(MainActivity.USERNAME, mUsername);
                    intent.putExtra(MainActivity.PASSWORD, mPassword);

                    finish();
                    startActivity(intent);

                } else {
                    Toast.makeText(LoginActivity.this, "password/username salah", Toast.LENGTH_SHORT).show();
                    et_username.getText().clear();
                    et_password.getText().clear();
                }
            }

        });

    }

}

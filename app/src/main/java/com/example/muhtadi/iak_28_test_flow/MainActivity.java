package com.example.muhtadi.iak_28_test_flow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private TextView mUsername;
    private TextView mPassword;

    public static final String USERNAME = null;
    public static final String PASSWORD = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");

        mUsername = findViewById(R.id.tv_username);
        mPassword = findViewById(R.id.tv_password);

        String username_intent = getIntent().getStringExtra(USERNAME);
        String password_intent = getIntent().getStringExtra(PASSWORD);

        Log.d(TAG, username_intent);
        Log.d(TAG, password_intent);

        mUsername.setText(username_intent);
        mPassword.setText(password_intent);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
}

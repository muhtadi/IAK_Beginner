package com.example.muhtadi.iak_28_test_flow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    public static String USERNAME = "username";
    public static String PASSWORD = "password";

    private String link_picture = "http://www.wabicorp.com/wp-content/uploads/2015/09/Mine%20Tunnel.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");

        TextView mUsername = findViewById(R.id.tv_username);
        TextView mPassword = findViewById(R.id.tv_password);
        ImageView imageView = findViewById(R.id.picture);

        String username_intent = getIntent().getStringExtra(USERNAME);
        String password_intent = getIntent().getStringExtra(PASSWORD);

        Log.d(TAG, username_intent);
        Log.d(TAG, password_intent);

        mUsername.setText(username_intent);
        mPassword.setText(password_intent);

        Picasso.with(this).load(link_picture).into(imageView, new Callback() {
            @Override
            public void onSuccess() {
                Toast.makeText(MainActivity.this, "berhasil load", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onError() {
                Toast.makeText(MainActivity.this, "gagal load", Toast.LENGTH_SHORT).show();
            }
        });
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

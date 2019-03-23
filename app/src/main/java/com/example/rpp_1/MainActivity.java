package com.example.rpp_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final int SLEEP_DELAY = 2000;
    private boolean resumed;
    private volatile boolean backPressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (!resumed) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(SLEEP_DELAY);

                        if (!backPressed) {
                            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
            resumed = true;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        backPressed = true;
    }

}

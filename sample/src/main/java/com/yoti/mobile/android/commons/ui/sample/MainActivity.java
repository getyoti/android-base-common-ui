package com.yoti.mobile.android.commons.ui.sample;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    View progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.yoti_progress_bar);

        findViewById(R.id.yoti_button).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello World!", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.progress_bar_button).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        progressBar.setVisibility(View.GONE);
                    }
                }, 1500);
            }
        });

        ((CheckBox) findViewById(R.id.update_btn_states_checkbox)).setOnCheckedChangeListener(
            new OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    updateButtonsState(!isChecked);
                }
            });
    }

    private void updateButtonsState(boolean enabled) {
        findViewById(R.id.yoti_button).setEnabled(enabled);
        findViewById(R.id.blue_button).setEnabled(enabled);
        findViewById(R.id.green_button).setEnabled(enabled);
        findViewById(R.id.white_button).setEnabled(enabled);
        findViewById(R.id.progress_bar_button).setEnabled(enabled);
    }
}
package com.faza.project.expertsystemai.Activity;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.faza.project.expertsystemai.R;

public class MainActivity extends AppCompatActivity {

    Button tentang;
    Button team;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tentang = findViewById(R.id.tentang);
        Button btnStart = (Button) findViewById(R.id.btn_start);
        team = findViewById(R.id.team);

        team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent team = new Intent(getApplicationContext(), TeamActivity.class);
                startActivity(team);
            }
        });

        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tentang = new Intent(getApplicationContext(), TentangActivity.class);
                startActivity(tentang);
            }
        });
        btnStart.setOnClickListener(new StartClickListener());
    }

    private class StartClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent questionIntent = new Intent(MainActivity.this, QuestionActivity.class);
            startActivity(questionIntent);
        }
    }
}
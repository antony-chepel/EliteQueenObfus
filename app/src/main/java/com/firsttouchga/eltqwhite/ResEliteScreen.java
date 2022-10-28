package com.firsttouchga.eltqwhite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firsttouchga.R;

import java.util.Random;

public class ResEliteScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_elite_screen);
        TextView resElig = findViewById(R.id.tv_elig);
        Button b_elig = findViewById(R.id.b_elig);
        EliteUtils utilsEl = new EliteUtils();
        Random r = new Random();
        String resEligs = utilsEl.listBonusItems.get(r.nextInt(4));
        resElig.setText(resEligs);
        b_elig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(),MainEliteScreen.class));
            }
        });
    }
}
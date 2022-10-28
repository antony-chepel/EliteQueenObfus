package com.firsttouchga.eltqwhite;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.firsttouchga.R;

import java.util.Random;

public class MainEliteScreen extends AppCompatActivity {

    ImageView im_el1,im_el2,im_el_3;
    Button b_el;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_elite_screen);
        im_el1 = findViewById(R.id.im_el_1);
        im_el2 = findViewById(R.id.im_el_2);
        im_el_3 = findViewById(R.id.im_el_3);
        EliteUtils utils = new EliteUtils();
        Random random = new Random();
        Integer res1_Elite = utils.listEliteImg.get(random.nextInt(5));
        Integer res2_Elite = utils.listEliteImg.get(random.nextInt(5));
        Integer res3_Elite = utils.listEliteImg.get(random.nextInt(5));
        im_el1.setImageResource(res1_Elite);
        im_el2.setImageResource(res2_Elite);
        im_el_3.setImageResource(res3_Elite);
        b_el = findViewById(R.id.b_el);
        dragElite();
        b_el.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ResEliteScreen.class));
            }
        });
    }



    @SuppressLint("ClickableViewAccessibility")
    private void dragElite(){
        View.OnTouchListener listener = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                 v.setX(event.getRawX() - v.getWidth()/2);
                 v.setY(event.getRawY() - v.getHeight()/2);
                }
                return true;
            }
        };

        im_el1.setOnTouchListener(listener);
        im_el2.setOnTouchListener(listener);
        im_el_3.setOnTouchListener(listener);
    }

}
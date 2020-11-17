package com.example.elkehnashop;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    ImageView toppic;
    ImageView shortpic;
    ImageView conversepic;
    HorizontalScrollView topscroll;
    HorizontalScrollView shortsscroll;
    HorizontalScrollView conversescroll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2main);

        toppic = findViewById(R.id.toppic);
        topscroll = findViewById(R.id.topscroll);
        shortpic = findViewById(R.id.shortpic);
        shortsscroll = findViewById(R.id.shortsscroll);
        conversepic = findViewById(R.id.conversepic);
        conversescroll = findViewById(R.id.conversescroll);

        toppic =(ImageView)findViewById(R.id.toppic);
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.topsanimation);
        toppic.startAnimation(animation);

        shortpic =(ImageView)findViewById(R.id.shortpic);
        Animation animation2= AnimationUtils.loadAnimation(this,R.anim.topsanimation);
        shortpic.startAnimation(animation2);

        conversepic =(ImageView)findViewById(R.id.conversepic);
        Animation animation3= AnimationUtils.loadAnimation(this,R.anim.topsanimation);
        conversepic.startAnimation(animation3);


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            int id = v.getId();
            if(id == R.id.toppic){
                toppic.setVisibility(View.GONE);
                topscroll.setVisibility(View.VISIBLE);
            }
            else if (id ==R.id.shortpic){
                shortpic.setVisibility(View.GONE);
                shortsscroll.setVisibility(View.VISIBLE);
            }
            else if (id==R.id.conversepic){
                conversepic.setVisibility(View.GONE);
                conversescroll.setVisibility(View.VISIBLE);

            }
            return false;
        }
    };
        View.OnClickListener L = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int idtoast = v.getId();
                Context context =getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast price;
                CharSequence text ;
                if (idtoast==R.id.toppic){
                    text="1000DA";
                }
                else if (idtoast==R.id.shortpic){
                    text= "1500DA";
                }
                else if (idtoast==R.id.conversepic){
                    text="1750DA";
                }
                else{text="";}
                price=Toast.makeText(context,text,duration);
                price.show();
            }
        };

    toppic.setOnLongClickListener(listener);
    shortpic.setOnLongClickListener(listener);
    conversepic.setOnLongClickListener(listener);

        toppic.setOnClickListener(L);
        shortpic.setOnClickListener(L);
        conversepic.setOnClickListener(L);
    }






    }


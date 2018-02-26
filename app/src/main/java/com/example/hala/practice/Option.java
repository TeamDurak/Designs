package com.example.hala.practice;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Option extends AppCompatActivity {

    String x;
    int y;
    ImageView logo_picker;
    TextView back_button;
    LinearLayout avatar_container;
    int stopclick=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        back_button = (TextView)findViewById(R.id.back_button);
        logo_picker = (ImageView)findViewById(R.id.logo_picker);
        avatar_container = (LinearLayout)findViewById(R.id.avatar_container);

        //avatars and list
        logo_picker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stopclick ==0){
                    stopclick=1;

                    LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    final View addView = inflater.inflate(R.layout.avatars,null);

                    final ImageView avatar_1  = (ImageView) addView.findViewById(R.id.avatar_1);
                    final ImageView avatar_2  = (ImageView) addView.findViewById(R.id.avatar_2);
                    final ImageView avatar_3  = (ImageView) addView.findViewById(R.id.avatar_3);
                    final ImageView avatar_4  = (ImageView) addView.findViewById(R.id.avatar_4);
                    final ImageView avatar_5  = (ImageView) addView.findViewById(R.id.avatar_5);
                    final ImageView avatar_6  = (ImageView) addView.findViewById(R.id.avatar_6);
                    final ImageView avatar_7  = (ImageView) addView.findViewById(R.id.avatar_7);
                    final ImageView avatar_8  = (ImageView) addView.findViewById(R.id.avatar_8);
                    final ImageView avatar_9  = (ImageView) addView.findViewById(R.id.avatar_9);
                    final ImageView avatar_10 = (ImageView) addView.findViewById(R.id.avatar_10);
                    final ImageView avatar_11 = (ImageView) addView.findViewById(R.id.avatar_11);
                    final ImageView avatar_12 = (ImageView) addView.findViewById(R.id.avatar_12);
                    final ImageView avatar_13 = (ImageView) addView.findViewById(R.id.avatar_13);
                    final ImageView avatar_14 = (ImageView) addView.findViewById(R.id.avatar_14);
                    final ImageView avatar_15 = (ImageView) addView.findViewById(R.id.avatar_15);
                    final ImageView avatar_16 = (ImageView) addView.findViewById(R.id.avatar_16);
                    final ImageView avatar_17 = (ImageView) addView.findViewById(R.id.avatar_17);
                    final ImageView avatar_18 = (ImageView) addView.findViewById(R.id.avatar_18);
                    final ImageView avatar_19 = (ImageView) addView.findViewById(R.id.avatar_19);
                    final ImageView avatar_20 = (ImageView) addView.findViewById(R.id.avatar_20);
                    final ImageView close     = (ImageView) addView.findViewById(R.id.close);

                    avatar_1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            logo_picker.setImageResource(R.drawable.avatar_1);
                            ((LinearLayout) addView.getParent()).removeView(addView);
                            y = 0; stopclick=0; }});

                    avatar_2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            logo_picker.setImageResource(R.drawable.avatar_2);
                            ((LinearLayout) addView.getParent()).removeView(addView);
                            y = 1; stopclick=0; }});

                    avatar_3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            logo_picker.setImageResource(R.drawable.avatar_3);
                            ((LinearLayout) addView.getParent()).removeView(addView);
                            y = 2; stopclick=0; }});

                    avatar_4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            logo_picker.setImageResource(R.drawable.avatar_4);
                            ((LinearLayout) addView.getParent()).removeView(addView);
                            y = 3; stopclick=0; }});

                    avatar_5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            logo_picker.setImageResource(R.drawable.avatar_5);
                            ((LinearLayout) addView.getParent()).removeView(addView);
                            y = 4; stopclick=0; }});

                    avatar_6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            logo_picker.setImageResource(R.drawable.avatar_6);
                            ((LinearLayout) addView.getParent()).removeView(addView);
                            y = 5; stopclick=0; }});

                    avatar_7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            logo_picker.setImageResource(R.drawable.avatar_7);
                            ((LinearLayout) addView.getParent()).removeView(addView);
                            y = 6; stopclick=0; }});

                    avatar_8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            logo_picker.setImageResource(R.drawable.avatar_8);
                            ((LinearLayout) addView.getParent()).removeView(addView);
                            y = 7; stopclick=0; }});

                    avatar_9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            logo_picker.setImageResource(R.drawable.avatar_9);
                            ((LinearLayout) addView.getParent()).removeView(addView);
                            y = 8; stopclick=0; }});

                    avatar_10.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            logo_picker.setImageResource(R.drawable.avatar_10);
                            ((LinearLayout) addView.getParent()).removeView(addView);
                            y = 9; stopclick=0; }});

                    avatar_11.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            logo_picker.setImageResource(R.drawable.avatar_11);
                            ((LinearLayout) addView.getParent()).removeView(addView);
                            y = 10; stopclick=0; }});

                    avatar_12.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            logo_picker.setImageResource(R.drawable.avatar_12);
                            ((LinearLayout) addView.getParent()).removeView(addView);
                            y = 11; stopclick=0; }});

                    avatar_13.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            logo_picker.setImageResource(R.drawable.avatar_13);
                            ((LinearLayout) addView.getParent()).removeView(addView);
                            y = 12; stopclick=0; }});

                    avatar_14.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            logo_picker.setImageResource(R.drawable.avatar_14);
                            ((LinearLayout) addView.getParent()).removeView(addView);
                            y = 13; stopclick=0; }});

                    avatar_15.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            logo_picker.setImageResource(R.drawable.avatar_15);
                            ((LinearLayout) addView.getParent()).removeView(addView);
                            y = 14; stopclick=0; }});

                    avatar_16.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            logo_picker.setImageResource(R.drawable.avatar_16);
                            ((LinearLayout) addView.getParent()).removeView(addView);
                            y = 15; stopclick=0; }});

                    avatar_17.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            logo_picker.setImageResource(R.drawable.avatar_17);
                            ((LinearLayout) addView.getParent()).removeView(addView);
                            y = 16; stopclick=0; }});

                    avatar_18.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            logo_picker.setImageResource(R.drawable.avatar_18);
                            ((LinearLayout) addView.getParent()).removeView(addView);
                            y = 17; stopclick=0; }});

                    avatar_19.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            logo_picker.setImageResource(R.drawable.avatar_19);
                            ((LinearLayout) addView.getParent()).removeView(addView);
                            y = 18; stopclick=0; }});

                    avatar_20.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            logo_picker.setImageResource(R.drawable.avatar_20);
                            ((LinearLayout) addView.getParent()).removeView(addView);
                            y = 19; stopclick=0; }});

                    avatar_container.addView(addView);
            }}
        });

        LayoutTransition transition = new LayoutTransition();
        avatar_container.setLayoutTransition(transition);

        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText get_name = (EditText) findViewById(R.id.name);
                x = get_name.getText().toString();
                Intent intent = new Intent(getApplicationContext(), com.example.hala.practice.MainActivity.class);
                intent.putExtra("the name",x);
                intent.putExtra("number",y);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}


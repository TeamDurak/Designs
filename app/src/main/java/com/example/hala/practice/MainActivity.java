
package com.example.hala.practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout top_layout;
    Animation up_to_down;
    String name;
    private int [] avatar_array = {R.drawable.avatar_1,R.drawable.avatar_2,R.drawable.avatar_3,
                                  R.drawable.avatar_4,R.drawable.avatar_5,R.drawable.avatar_6,
                                  R.drawable.avatar_7,R.drawable.avatar_8,R.drawable.avatar_9,
                                  R.drawable.avatar_10,R.drawable.avatar_11,R.drawable.avatar_12,
                                  R.drawable.avatar_13,R.drawable.avatar_14,R.drawable.avatar_15,
                                  R.drawable.avatar_16,R.drawable.avatar_17,R.drawable.avatar_18,
                                  R.drawable.avatar_19,R.drawable.avatar_20};
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView view_name = (TextView)findViewById(R.id.main_name);
        name = getIntent().getStringExtra("the name");
        view_name.setText(name);
        int y = getIntent().getIntExtra("number",0);
        ImageView logo = (ImageView) findViewById(R.id.logo);
        logo.setImageResource(avatar_array[y]);

        //top to down animation
        top_layout = (LinearLayout)findViewById(R.id.top_layout);
        up_to_down = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        top_layout.setAnimation(up_to_down);
    }
//opens new game
    public void new_game(View view) {
        ImageView img= (ImageView) view.findViewById(R.id.new_game);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        img.startAnimation(animation);
        Intent intent = new Intent(MainActivity.this,New_Game.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
//opens settings
    public void settings(View view) {
        ImageView img= (ImageView) view.findViewById(R.id.settings);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        img.startAnimation(animation);
        Intent intent = new Intent(this,Option.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
//opens how to play
    public void how(View view) {
        TextView img= (TextView) view.findViewById(R.id.how);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        img.startAnimation(animation);
        Intent intent = new Intent(this,HowTo.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}

package com.rajarpita.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b=(Button) findViewById(R.id.Rollbutton);
        final int[] mydicee={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };
        final ImageView leftdice=(ImageView)findViewById(R.id.imageView1);
        final ImageView rightdice=(ImageView)findViewById(R.id.imageView2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee", "button is pressed ");
                Random R=new Random();
                int num=R.nextInt(6);
                Log.d("Dicee","Random num is"+ num);
                leftdice.setImageResource(mydicee[num]);
                num=R.nextInt(6);
                rightdice.setImageResource(mydicee[num]);

            }
        });
    }
}

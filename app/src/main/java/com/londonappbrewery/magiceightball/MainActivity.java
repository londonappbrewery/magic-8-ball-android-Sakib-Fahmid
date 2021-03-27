package com.londonappbrewery.magiceightball;

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

        Button askButton;
        askButton=(Button)findViewById(R.id.buttonAsk);

        final ImageView eightBallImage=(ImageView)findViewById(R.id.image_magic_ball);

        final int[] ballImageArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        askButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new Random();
                int randomNumber=randomNumberGenerator.nextInt(5);
                eightBallImage.setImageResource(ballImageArray[randomNumber]);
                Log.d("magicBall","The number is :"+randomNumber);
            }
        });
    }
}

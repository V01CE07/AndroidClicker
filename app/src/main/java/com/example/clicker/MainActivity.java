package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private long score = 0;
    TextView mainText;
    Button mainBtn;
    Button backBtn;

    Button KillBtn;

    ImageButton guitarBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = (TextView) findViewById(R.id.mainText);
        mainBtn = (Button) findViewById(R.id.mainButton);
        backBtn = (Button) findViewById(R.id.backButton);
        KillBtn = (Button) findViewById(R.id.DIEbutton);
        guitarBtn = (android.widget.ImageButton) findViewById(R.id.guitarBtn);

        mainBtn.setOnClickListener(clickListener);
        backBtn.setOnClickListener(clickListener);
        KillBtn.setOnClickListener(clickListener);
        guitarBtn.setOnClickListener(clickListener);
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.mainButton) {
                backBtn.setEnabled(true);
                score++;
                if (score % 10 == 1 || score % 10 == 5 || score % 10 == 0 || score % 10 == 7
                        || score % 10 == 8 || score % 10 == 9 || score % 10 == 6) {
                    String s = "Кнопка нажата " + score + " раз";
                    mainText.setText(s.toCharArray(), 0, s.length());
                    mainBtn.setOnClickListener(clickListener);
                } else if (score == 12 || score == 13 || score == 14) {
                    String s = "Кнопка нажата " + score + " раз";
                    mainText.setText(s.toCharArray(), 0, s.length());
                    mainBtn.setOnClickListener(clickListener);
                } else {
                    String s = "Кнопка нажата " + score + " раза";
                    mainText.setText(s.toCharArray(), 0, s.length());
                    mainBtn.setOnClickListener(clickListener);
                }
            }

            if (v.getId() == R.id.guitarBtn) {
                backBtn.setEnabled(true);
                score++;
                if (score % 10 == 1 || score % 10 == 5 || score % 10 == 0 || score % 10 == 7
                        || score % 10 == 8 || score % 10 == 9 || score % 10 == 6) {
                    String s = "Кнопка нажата " + score + " раз";
                    mainText.setText(s.toCharArray(), 0, s.length());
                    guitarBtn.setOnClickListener(clickListener);
                } else if (score == 12 || score == 13 || score == 14) {
                    String s = "Кнопка нажата " + score + " раз";
                    mainText.setText(s.toCharArray(), 0, s.length());
                    guitarBtn.setOnClickListener(clickListener);
                } else {
                    String s = "Кнопка нажата " + score + " раза";
                    mainText.setText(s.toCharArray(), 0, s.length());
                    guitarBtn.setOnClickListener(clickListener);
                }
            }

            if (v.getId() == R.id.backButton) {
                score--;
                if (score % 10 == 1 || score % 10 == 5 || score % 10 == 0 || score % 10 == 7
                        || score % 10 == 8 || score % 10 == 9 || score % 10 == 6)
                {
                    String a = "Кнопка нажата " + score + " раз";
                    mainText.setText(a.toCharArray(), 0, a.length());
                    backBtn.setOnClickListener(clickListener);
                }
                else if (score == 12 || score == 13 || score == 14)
                {
                    String a = "Кнопка нажата " + score + " раз";
                    mainText.setText(a.toCharArray(), 0, a.length());
                    backBtn.setOnClickListener(clickListener);
                }
                else
                {
                    String a = "Кнопка нажата " + score + " раза";
                    mainText.setText(a.toCharArray(), 0, a.length());
                    backBtn.setOnClickListener(clickListener);
                }
                if (score <= 0){
                    String a = "Счёт не может быть меньше нуля";

                    mainText.setText(a.toCharArray(), 0, a.length());
                    backBtn.setEnabled(false);
                    backBtn.setOnClickListener(clickListener);

                }
                if (score < 10){
                    guitarBtn.setImageResource(R.drawable.g2);
                }
                if (score < 20){
                    guitarBtn.setImageResource(R.drawable.g3);
                }
                if (score < 50){
                    guitarBtn.setImageResource(R.drawable.g4);
                }
            }
            if (v.getId() == R.id.DIEbutton)
            {
                score = 0;
                String b = "Счёт обнулён";
                mainText.setText(b.toCharArray(), 0, b.length());
                KillBtn.setOnClickListener(clickListener);
                guitarBtn.setImageResource(R.drawable.g2);
            }
            if (score == 10){
                Toast.makeText(getApplicationContext(), "FINALLY NEW GUITAR OHH SHIT", Toast.LENGTH_LONG).show();
                guitarBtn.setImageResource(R.drawable.g3);
            }
            if (score == 20){
                Toast.makeText(getApplicationContext(), "YEEEP I'AM ALREADY TO MAKE ROCK", Toast.LENGTH_LONG).show();
                guitarBtn.setImageResource(R.drawable.g4);
            }
            if (score == 50){
                Toast.makeText(getApplicationContext(), "WHAT A FUCK PLEASE STOP", Toast.LENGTH_LONG).show();
                guitarBtn.setImageResource(R.drawable.g5);
            }
        }
    };
}
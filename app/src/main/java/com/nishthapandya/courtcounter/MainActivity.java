package com.nishthapandya.courtcounter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0,scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threePointsA(View view)
    {
        scoreA=scoreA +3;
        displayforTeamA(scoreA);
    }

    public void twoPointsA(View view)
    {
        scoreA=scoreA +2;
        displayforTeamA(scoreA);
    }

    public void freeThrowA(View view)
    {
        scoreA=scoreA +1;
        displayforTeamA(scoreA);
    }

    public void reset(View view){
        scoreA=0;
        scoreB=0;
        displayforTeamA(scoreA);
        displayforTeamB(scoreB);
    }

    public void displayforTeamA(int teamScore)
    {
        TextView tv_score = (TextView) findViewById(R.id.scoreA_text_view);
        tv_score.setText(String.valueOf(teamScore));
    }

    public void threePointsB(View view)
    {
        scoreB=scoreB +3;
        displayforTeamB(scoreB);
    }

    public void twoPointsB(View view)
    {
        scoreB=scoreB +2;
        displayforTeamB(scoreB);
    }

    public void freeThrowB(View view)
    {
        scoreB=scoreB +1;
        displayforTeamB(scoreB);
    }
    public void displayforTeamB(int teamScoreB)
    {
        TextView tv_score = (TextView) findViewById(R.id.scoreB_text_view);
        tv_score.setText(String.valueOf(teamScoreB));
    }
}
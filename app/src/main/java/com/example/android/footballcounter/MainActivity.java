package com.example.android.footballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * tracks the score for team A
     */
    int ScoreTeamA= 0 ;
    /**
     * tracks the score for team B
     */

    int ScoreTeamB= 0 ;

    /**
     * this method is called when the + 6 points button is clicked.
     */
    public void addsixForTeamA(View view){
        ScoreTeamA = ScoreTeamA + 6 ;
        displayForTeamA(ScoreTeamA) ;
    }
    /**
     * this method is called when the + 3 points button is clicked.
     */
    public void addThreeForTeamA(View view){
        ScoreTeamA = ScoreTeamA + 3 ;
        displayForTeamA(ScoreTeamA) ;
    }
    /**
     * this method is called when the + 2 points button is clicked.
     */
    public void addTwoForTeamA(View view){
        ScoreTeamA = ScoreTeamA + 2 ;
        displayForTeamA(ScoreTeamA) ;
    }

    /**
     * this method is called when the + free throw button is clicked.
     */
    public void addOneForTeamA(View view){
        ScoreTeamA = ScoreTeamA + 1 ;
        displayForTeamA(ScoreTeamA) ;
    }
    /**
     * this method is called when the + 6 points button is clicked.
     */
    public void addsixForTeamB(View view){
        ScoreTeamB = ScoreTeamB + 6 ;
        displayForTeamB(ScoreTeamB) ;
    }

    /**
     * this method is called when the + 3 points button is clicked.
     */
    public void addThreeForTeamB(View view){
        ScoreTeamB = ScoreTeamB + 3 ;
        displayForTeamB(ScoreTeamB) ;
    }
    /**
     * this method is called when the + 2 points button is clicked.
     */
    public void addTwoForTeamB(View view){
        ScoreTeamB = ScoreTeamB + 2 ;
        displayForTeamB(ScoreTeamB) ;
    }

    /**
     * this method is called when the + free throw button is clicked.
     */
    public void addOneForTeamB(View view){
        ScoreTeamB = ScoreTeamB + 1 ;
        displayForTeamB(ScoreTeamB) ;
    }
    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        ScoreTeamA = 0;
        ScoreTeamB = 0;
        displayForTeamA(ScoreTeamA);
        displayForTeamB(ScoreTeamB);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
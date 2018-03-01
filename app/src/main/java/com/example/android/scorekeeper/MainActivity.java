package com.example.android.scorekeeper;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreToJuventus = 0;
    int scoreToMilan = 0;
    int faultToJuventus = 0;
    int faultToMilan = 0;
    int cornerToJuventus = 0;
    int cornerToMilan = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Express chosen button. Add 1 goal for Juventus */
    public void goalJuve(View v) {
        ++scoreToJuventus;
        displayGoalForJuventus(scoreToJuventus);
    }

    /* Express chosen button. Add 1 goal for Milan */
    public void goalMilan(View v) {
        ++scoreToMilan;
        displayGoalForMilan(scoreToMilan);
    }

    public void faultJuve(View v) {
        ++faultToJuventus;
        displayFaultForJuventus(faultToJuventus);
    }

    public void faultMilan(View v) {
        ++faultToMilan;
        displayFaultForMilan(faultToMilan);
    }

    public void cornerJuve(View v) {
        ++cornerToJuventus;
        displayCornerForJuventus(cornerToJuventus);
    }

    public void cornerMilan(View v) {
        ++cornerToMilan;
        displayCornerForMilan(cornerToMilan);
    }

    /**
     * Displays the given score for Juventus.
     */
    public void displayGoalForJuventus(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreJuve);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Milan.
     */
    public void displayGoalForMilan(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreMilan);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fault for Juventus.
     */
    public void displayFaultForJuventus(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faultJuve);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fault for Milan.
     */
    public void displayFaultForMilan(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faultMilan);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given corner for Juventus.
     */
    public void displayCornerForJuventus(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cornerJuve);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given corner for Milan.
     */
    public void displayCornerForMilan(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cornerMilan);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset all current data for Juventus and Milan.
     */
    public void reset(View V) {
        scoreToJuventus = 0;
        scoreToMilan = 0;
        faultToJuventus = 0;
        faultToMilan = 0;
        cornerToJuventus = 0;
        cornerToMilan = 0;

        displayGoalForJuventus(scoreToJuventus);
        displayGoalForMilan(scoreToMilan);
        displayFaultForJuventus(faultToJuventus);
        displayFaultForMilan(faultToMilan);
        displayCornerForJuventus(cornerToJuventus);
        displayCornerForMilan(cornerToMilan);
    }

    public void sendEmail(View view) {
        Intent sendEmail = new Intent(Intent.ACTION_SENDTO);
        sendEmail.setData(Uri.parse("mailto:"));
        sendEmail.putExtra(Intent.EXTRA_SUBJECT, "Score of match between Juventus and Milan");

        if (sendEmail.resolveActivity(getPackageManager()) != null) {
            startActivity(sendEmail);
        }
    }

}





package com.example.richakulkarni.uidesignone;

import android.animation.Animator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.LinearLayout;

public class HomeDashboard extends AppCompatActivity implements View.OnClickListener {

    private CardView nearMeCard, beenHereCard, addLocCard, settingsCard, eventsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_dashboard);

        ////////////////////////////////////////////////////Defining Cards///////////////////////////////////////////////////////
        nearMeCard = (CardView) findViewById(R.id.near_me_button);
        beenHereCard = (CardView) findViewById(R.id.been_here_button);
        addLocCard = (CardView) findViewById(R.id.add_location_button);
        settingsCard = (CardView) findViewById(R.id.settings_button);
        eventsCard = (CardView) findViewById(R.id.events_button);

        ////////////////////////////////////////////Add Click Listener to the cards //////////////////////////////////////////////
        nearMeCard.setOnClickListener(this);
        beenHereCard.setOnClickListener(this);
        addLocCard.setOnClickListener(this);
        settingsCard.setOnClickListener(this);
        eventsCard.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.near_me_button: i = new Intent(this, NearMeActivity.class);
                startActivity(i);
                break;
            case R.id.add_location_button: i = new Intent(this, AddLocActivity.class);
                startActivity(i);
                break;
            case R.id.been_here_button: i = new Intent(this, BeenHereActivity.class);
                startActivity(i);
                break;
            case R.id.events_button: i = new Intent(this, EventsActivity.class);
                startActivity(i);
                break;
            case R.id.settings_button: i = new Intent(this, SettingsActivity.class);
                startActivity(i);
                break;
            default: break;
        }

    }
}





























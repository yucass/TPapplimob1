package com.example.jung.tpapplimob1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class interface5_SPORT_DETAIL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface5__sport__detail);

        Intent intent = getIntent();
        String name = intent.getStringExtra(EXTRA_MESSAGE);
        String firstname = intent.getStringExtra(EXTRA_MESSAGE);
        String footBall = intent.getStringExtra(EXTRA_MESSAGE);

        TextView nameTV = findViewById(R.id.nameTextView);
        nameTV.setText(name);
        TextView firstNameTV = findViewById(R.id.firstNameTextView);
        firstNameTV.setText(firstname);



        //TextView sporttype = findViewById(R.id.sportType);
        //sporttype.setText(footBall);

    }

    //Fonction de deplacement vers l'accueil
    public void accueil(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);

    }

    //Fonction de deplacement vers le sports
    public void sportBack(View view) {
        Intent intent = new Intent(this, interface4_SPORTS.class);

        startActivity(intent);

    }
}

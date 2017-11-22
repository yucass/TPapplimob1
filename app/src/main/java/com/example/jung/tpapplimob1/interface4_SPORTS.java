package com.example.jung.tpapplimob1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class interface4_SPORTS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface4__sports);

        Intent intent = getIntent();

        String name = intent.getStringExtra(EXTRA_MESSAGE);
        String firstname = intent.getStringExtra(EXTRA_MESSAGE);

        TextView nameTV = findViewById(R.id.nameTextView);
        nameTV.setText(name);
        TextView firstNameTV = findViewById(R.id.firstNameTextView);
        firstNameTV.setText(firstname);
    }

    //Fonction de déplacement vers le layout suivant
    public void goLayout5(View view) {
        //declaration nouvel intent
        Intent intent = new Intent(this, interface5_SPORT_DETAIL.class);

        //passage des variable nom et prenom
        //TextView nameTV = findViewById(R.id.nameTextView);
       // String name = nameTV.getText().toString();
        String name = intent.getStringExtra(EXTRA_MESSAGE);
          intent.putExtra(EXTRA_MESSAGE, name);

        //TextView firstNameTV = findViewById(R.id.firstNameTextView);
        //String firstname = firstNameTV.getText().toString();
        String firstname = intent.getStringExtra(EXTRA_MESSAGE);
        intent.putExtra(EXTRA_MESSAGE, firstname);

        Button football = findViewById(R.id.sport1Button);
        String footBall = football.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, footBall);

        //lancement de la nouvelle activité
        startActivity(intent);
    }

    //Fonction de deplacement vers l'accueil
    public void accueil(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);

    }
}

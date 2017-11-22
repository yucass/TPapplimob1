package com.example.jung.tpapplimob1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class interface3_MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface3__main_menu);


        Intent intent = getIntent();

        //Récupération des variable passé dans le intent
        String name = intent.getStringExtra(EXTRA_MESSAGE);
        String firstname = intent.getStringExtra(EXTRA_MESSAGE);
        String birth = intent.getStringExtra(EXTRA_MESSAGE);
        String mail = intent.getStringExtra(EXTRA_MESSAGE);
        String adress = intent.getStringExtra(EXTRA_MESSAGE);
        String comments = intent.getStringExtra(EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView nameTV = findViewById(R.id.nameTextView);
        nameTV.setText(name);
        TextView firstNameTV = findViewById(R.id.firstNameTextView);
        firstNameTV.setText(firstname);
        TextView birthDateTV = findViewById(R.id.birthDateTextView);
        birthDateTV.setText(birth);
        TextView eMailTV = findViewById(R.id.eMailTextView);
        eMailTV.setText(mail);
        TextView mailAdressTV = findViewById(R.id.mailAdressTextView);
        mailAdressTV.setText(adress);
        TextView commentsTV = findViewById(R.id.commentsTextView);
        commentsTV.setText(comments);
    }

    //Fonction de déplacement vers le layout suivant
    public void goLayout4(View view) {
        //declaration nouvel intent
        Intent intent = new Intent(this, interface4_SPORTS.class);

        //passage des variable nom et prenom
        TextView nameTV = findViewById(R.id.nameTextView);
        String name = nameTV.getText().toString();
        if(name != ""){
        intent.putExtra(EXTRA_MESSAGE, name);}else{ intent.putExtra(EXTRA_MESSAGE, "VOID");}

        TextView firstNameTV = findViewById(R.id.firstNameTextView);
        String firstname = firstNameTV.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, firstname);


        //lancement de la nouvelle activité
        startActivity(intent);
    }

    //Fonction de deplacement vers l'accueil
    public void accueil(View view) {
        //nouvel intent
        Intent intent = new Intent(this, MainActivity.class);
        //lancement nouvel itent
        startActivity(intent);

    }
}

package com.example.jung.tpapplimob1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class interface2_AUTH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface2__auth);
    }

    public void sendData(View view) {
        Intent intent = new Intent(this, interface3_MainMenu.class);

        EditText nametext = (EditText) findViewById(R.id.nameText);
        EditText firstnametext = (EditText) findViewById(R.id.firstNameText);
        EditText birthdate = (EditText) findViewById(R.id.birthDate);
        EditText email = (EditText) findViewById(R.id.eMail);
        EditText mailadress = (EditText) findViewById(R.id.mailAdress);
        EditText commentstext = (EditText) findViewById(R.id.commentsText);


        String name = nametext.getText().toString();
        String firstname = firstnametext.getText().toString();
        String birth = birthdate.getText().toString();
        String mail = email.getText().toString();
        String adress = mailadress.getText().toString();
        String comments = commentstext.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, name);
        intent.putExtra(EXTRA_MESSAGE, firstname);
        intent.putExtra(EXTRA_MESSAGE, birth);
        intent.putExtra(EXTRA_MESSAGE, mail);
        intent.putExtra(EXTRA_MESSAGE, adress);
        intent.putExtra(EXTRA_MESSAGE, comments);

        startActivity(intent);
    }
}

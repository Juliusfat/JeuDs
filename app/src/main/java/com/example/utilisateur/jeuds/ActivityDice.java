package com.example.utilisateur.jeuds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.security.SecureRandom;

public class ActivityDice extends AppCompatActivity {

    private int max ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice2);

        // récupération de l'info de l'activité principale

        max = getIntent().getIntExtra("max",0);
        TextView textdes = findViewById(R.id.textTitle);
        textdes.setText("Dés à " + max + " Faces ");

        TextView textResult = findViewById(R.id.textResult);
        textResult.setText("");


    }

    public void onGoDice(View V) {

        //création d'un nombre aléatoire

        SecureRandom random = new SecureRandom();
        int result = random.nextInt(max) + 1;
        TextView textResult = findViewById(R.id.textResult);
        textResult.setText(String.valueOf(result));
    }
}

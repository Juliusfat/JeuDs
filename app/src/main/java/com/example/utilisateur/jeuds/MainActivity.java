package com.example.utilisateur.jeuds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //chargement de la vue

        setContentView(R.layout.activity_main);

        // Initialisation du premier bouton

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent FormIntent = new Intent(MainActivity.this, ActivityDice.class);

                // transmission de l'info saisie vers la deuxieme activity

                FormIntent.putExtra("max", 6);

                //lancement de l'activity

                startActivity(FormIntent);
            }
        });

        Button button20 = findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent FormIntent = new Intent(MainActivity.this, ActivityDice.class);
                FormIntent.putExtra("max", 20);
                startActivity(FormIntent);
            }
        });


    }
}

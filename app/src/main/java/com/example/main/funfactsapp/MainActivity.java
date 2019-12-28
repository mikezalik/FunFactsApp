package com.example.main.funfactsapp;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static android.os.Build.VERSION_CODES.JELLY_BEAN;
import static com.example.main.funfactsapp.R.id.showFactButton;

public class MainActivity extends AppCompatActivity {
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();

    //Declare view variables
    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign the views from the layout file to the corresponding variables
        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);
        relativeLayout = findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String fact = factBook.getFact();

                factTextView.setText(fact);

                int color = colorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                }
            };
        
        showFactButton.setOnClickListener(listener);
        Toast.makeText(this, "I hope you enjoy these fun facts!", Toast.LENGTH_LONG).show();
        Log.d("FunFactsActivity", "Logging from onCreate() method");
    }

    private Button findViewById(View showFactButton) {

        return null;
    }
}


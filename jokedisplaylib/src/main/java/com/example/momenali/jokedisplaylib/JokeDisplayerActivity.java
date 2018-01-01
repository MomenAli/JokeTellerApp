package com.example.momenali.jokedisplaylib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayerActivity extends AppCompatActivity {

    public static final String JOKE_EXTRA_KEY = "jokeKey";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_displayer);

        Bundle extras = getIntent().getExtras();

        TextView tvJokeDisp = (TextView) findViewById(R.id.tvJokeDisp);

        tvJokeDisp.setText(extras.getString(JOKE_EXTRA_KEY));

    }
}

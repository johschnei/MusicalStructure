package com.example.jay.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayLists extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_lists);

        Button backToMainButton = (Button) findViewById(R.id.btnBackToMain);
        backToMainButton.setOnClickListener(this);

        Button nextToSongsButton = (Button) findViewById(R.id.btnNextToSongs);
        nextToSongsButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnBackToMain:
                backToMain();
                break;

            case R.id.btnNextToSongs:
                Intent nextToSongsIntent = new Intent(PlayLists.this, Songs.class);
                startActivity(nextToSongsIntent);
                break;

            default:
                break;
        }
    }

    @Override
    public void onBackPressed() {
        backToMain();
    }

    public void backToMain() {
        Intent backToMainIntent = new Intent(PlayLists.this, MainActivity.class);
        startActivity(backToMainIntent);
    }
}

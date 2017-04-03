package com.example.jay.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AllSongs extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_songs);

        Button backToMainButton = (Button) findViewById(R.id.btnBackToMain);
        backToMainButton.setOnClickListener(this);

        Button nextToNowPlayingButton = (Button) findViewById(R.id.btnNextToNowPlaying);
        nextToNowPlayingButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnBackToMain:
                backToMain();
                break;

            case R.id.btnNextToNowPlaying:
                Intent nextToNowPlayingIntent = new Intent(AllSongs.this, NowPlaying.class);
                startActivity(nextToNowPlayingIntent);
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
        Intent backToMainIntent = new Intent(AllSongs.this, MainActivity.class);
        startActivity(backToMainIntent);
    }
}

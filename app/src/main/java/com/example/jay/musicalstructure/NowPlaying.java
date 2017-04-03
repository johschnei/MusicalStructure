package com.example.jay.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NowPlaying extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Button backToMainButton = (Button) findViewById(R.id.btnBackToMain);
        backToMainButton.setOnClickListener(this);

        Button backToSongsButton = (Button) findViewById(R.id.btnBackToSongs);
        backToSongsButton.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        backToMain();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnBackToMain:
                backToMain();
                break;

            case R.id.btnBackToSongs:
                Intent backToSongsIntent = new Intent(NowPlaying.this, Songs.class);
                startActivity(backToSongsIntent);
                break;

            default:
                break;
        }
    }

    public void backToMain() {
        Intent backToMainIntent = new Intent(NowPlaying.this, MainActivity.class);
        startActivity(backToMainIntent);
    }
}

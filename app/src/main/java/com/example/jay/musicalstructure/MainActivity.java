package com.example.jay.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button playlistButton = (Button) findViewById(R.id.btnPlaylist);
        playlistButton.setOnClickListener(this);

        Button albumsButton = (Button) findViewById(R.id.btnAlbums);
        albumsButton.setOnClickListener(this);

        Button allSongsButton = (Button) findViewById(R.id.btnAllSongs);
        allSongsButton.setOnClickListener(this);

        Button nowPlayingButton = (Button) findViewById(R.id.btnNowPlaying);
        nowPlayingButton.setOnClickListener(this);

        Button artistsButton = (Button) findViewById(R.id.btnArtists);
        artistsButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btnPlaylist:
                Intent playListIntent = new Intent(MainActivity.this,PlayLists.class);
                startActivity(playListIntent);
                break;

            case R.id.btnAlbums:
                Intent albumsIntent = new Intent(MainActivity.this,Albums.class);
                startActivity(albumsIntent);
                break;

            case R.id.btnAllSongs:
                Intent songsIntent = new Intent(MainActivity.this,AllSongs.class);
                startActivity(songsIntent);
                break;

            case R.id.btnNowPlaying:
                Intent nowPlayingIntent = new Intent(MainActivity.this,NowPlaying.class);
                startActivity(nowPlayingIntent);
                break;

            case R.id.btnArtists:
                Intent artistsIntent = new Intent(MainActivity.this,Artists.class);
                startActivity(artistsIntent);
                break;

            default:
                break;
        }
    }
}

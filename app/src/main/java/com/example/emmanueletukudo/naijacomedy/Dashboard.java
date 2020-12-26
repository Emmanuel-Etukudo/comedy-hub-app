package com.example.emmanueletukudo.naijacomedy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class Dashboard extends AppCompatActivity implements View.OnClickListener {

    private Button btnMacaroni, btnLively, btnShaggi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnMacaroni = findViewById(R.id.btnMacaroni);
        btnLively = findViewById(R.id.btnLively);
        btnShaggi = findViewById(R.id.btnShaggi);

        btnMacaroni.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;

        switch (view.getId()) {
            case R.id.btnMacaroni:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(Dashboard.this, VideoPlayer.GOOGLE_API_KEY, VideoPlayer.MACARONI_PLAYLIST, 0, 0, true, true);
                break;
            case R.id.btnLively:
                break;
            case R.id.btnShaggi:
                break;

            default:
        }
        if (intent != null) {
            startActivity(intent);
        }

    }
}
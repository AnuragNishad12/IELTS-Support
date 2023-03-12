package com.anurag.ieltssupport.Listening.Part1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.anurag.ieltssupport.R;
import com.anurag.ieltssupport.databinding.ActivityPart1AnswersBinding;
import com.anurag.ieltssupport.databinding.ActivityPart1Binding;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Part1_Answers extends AppCompatActivity {


ActivityPart1AnswersBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPart1AnswersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
       binding.listPart1Topic.setText(getIntent().getIntExtra("topic",0));

        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);
        youTubePlayerView.enterFullScreen();
        youTubePlayerView.toggleFullScreen();
        getLifecycle().addObserver(youTubePlayerView);
        youTubePlayerView.enterFullScreen();
        youTubePlayerView.toggleFullScreen();

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = getIntent().getStringExtra("video");
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

    }
}
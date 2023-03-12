package com.anurag.ieltssupport.Speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.anurag.ieltssupport.R;
import com.anurag.ieltssupport.databinding.ActivityPart1SpeakingDisplayBinding;

public class part1SpeakingDisplay extends AppCompatActivity {

    ActivityPart1SpeakingDisplayBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPart1SpeakingDisplayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        binding.part1Questions.setText(getIntent().getStringExtra("questions"));
        binding.part1Answers.setText(getIntent().getStringExtra("answers"));








    }
}


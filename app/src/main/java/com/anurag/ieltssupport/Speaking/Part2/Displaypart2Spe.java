package com.anurag.ieltssupport.Speaking.Part2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.anurag.ieltssupport.R;
import com.anurag.ieltssupport.databinding.ActivityDisplaypart2SpeBinding;

public class Displaypart2Spe extends AppCompatActivity {

    ActivityDisplaypart2SpeBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDisplaypart2SpeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        binding.part1Questions.setText(getIntent().getStringExtra("question"));
        binding.part1Answers.setText(getIntent().getStringExtra("answers"));



    }
}
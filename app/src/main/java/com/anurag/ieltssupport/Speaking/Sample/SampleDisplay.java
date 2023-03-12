package com.anurag.ieltssupport.Speaking.Sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.anurag.ieltssupport.R;
import com.anurag.ieltssupport.databinding.ActivitySampleDisplayBinding;

public class SampleDisplay extends AppCompatActivity {

    ActivitySampleDisplayBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySampleDisplayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.part1Questions.setText(getIntent().getStringExtra("question"));
        binding.part1Answers.setText(getIntent().getStringExtra("answers"));






    }
}
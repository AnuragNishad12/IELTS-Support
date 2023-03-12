package com.anurag.ieltssupport.Reading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.anurag.ieltssupport.R;
import com.anurag.ieltssupport.databinding.ActivityReadAnswersBinding;

public class ReadAnswers extends AppCompatActivity {


    ActivityReadAnswersBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        binding = ActivityReadAnswersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.topic.setText(getIntent().getStringExtra("title"));
        binding.answers.setText(getIntent().getStringExtra("eassy"));



    }
}
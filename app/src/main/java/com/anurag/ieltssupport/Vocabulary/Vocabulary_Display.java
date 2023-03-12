package com.anurag.ieltssupport.Vocabulary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.anurag.ieltssupport.R;
import com.anurag.ieltssupport.databinding.ActivityVocabularyDisplayBinding;

public class Vocabulary_Display extends AppCompatActivity {


    ActivityVocabularyDisplayBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVocabularyDisplayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.textWords.setText(getIntent().getStringExtra("words"));
        binding.textVocabulary.setText(getIntent().getStringExtra("topic"));



    }
}
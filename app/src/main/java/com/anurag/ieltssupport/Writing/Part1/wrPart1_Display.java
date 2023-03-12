package com.anurag.ieltssupport.Writing.Part1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.anurag.ieltssupport.R;
import com.anurag.ieltssupport.databinding.ActivityWrPart1DisplayBinding;

public class wrPart1_Display extends AppCompatActivity {

    ActivityWrPart1DisplayBinding binding;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWrPart1DisplayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.part1WrQues.setText(getIntent().getStringExtra("questions"));
        binding.part1WrAns.setText(getIntent().getStringExtra("answers"));




    }
}
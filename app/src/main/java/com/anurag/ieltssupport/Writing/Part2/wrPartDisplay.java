package com.anurag.ieltssupport.Writing.Part2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.anurag.ieltssupport.R;
import com.anurag.ieltssupport.databinding.ActivityWrPartDisplayBinding;
import com.squareup.picasso.Picasso;

public class wrPartDisplay extends AppCompatActivity {

    ActivityWrPartDisplayBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWrPartDisplayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.Writing2Question.setText(getIntent().getStringExtra("question"));
        binding.Writing2Answers.setText(getIntent().getStringExtra("answers"));
        String image = getIntent().getStringExtra("image");
        Picasso.get().load(image).placeholder(R.drawable.ic_launcher_background).into(binding.ImageAnswers);




    }
}
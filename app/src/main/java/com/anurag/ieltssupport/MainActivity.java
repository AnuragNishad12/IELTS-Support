package com.anurag.ieltssupport;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.anurag.ieltssupport.Grammer.SecondGrammer;
import com.anurag.ieltssupport.Listening.SecondListening;
import com.anurag.ieltssupport.Reading.readSecondActivity;
import com.anurag.ieltssupport.Speaking.SpeakingSecond;
import com.anurag.ieltssupport.Vocabulary.Voca_Second_Recycler;
import com.anurag.ieltssupport.Writing.WritingSecondActivity;
import com.anurag.ieltssupport.databinding.ActivityMainBinding;
//import com.example.ieltssupport.databinding.ActivityMainBinding;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class MainActivity extends AppCompatActivity {

ActivityMainBinding binding;
private AdView mAdView;
InterstitialAd mInter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
     getSupportActionBar().hide();
binding.mainRead.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, readSecondActivity.class);
        startActivity(intent);
    }
});


binding.readListening.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, SecondListening.class);
        startActivity(intent);
    }
});

binding.mainWriting.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, WritingSecondActivity.class);
        startActivity(intent);
    }
});

binding.mainReading.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, SpeakingSecond.class);
        startActivity(intent);
    }
});

binding.graMain.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, SecondGrammer.class);
        startActivity(intent);
    }
});

binding.vocal.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, Voca_Second_Recycler.class);
        startActivity(intent);
    }
});


    }
}
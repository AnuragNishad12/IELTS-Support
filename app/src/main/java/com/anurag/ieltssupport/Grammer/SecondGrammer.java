package com.anurag.ieltssupport.Grammer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.util.Log;

import com.anurag.ieltssupport.R;
import com.anurag.ieltssupport.databinding.ActivitySecondGrammerBinding;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import java.util.ArrayList;

public class SecondGrammer extends AppCompatActivity {

    ActivitySecondGrammerBinding binding;
    ArrayList<grammerModels> models = new ArrayList<>();
    InterstitialAd mInterstitialAd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondGrammerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        graAdapter adapter = new graAdapter(models,getApplicationContext());
        binding.graRecyclerView.setAdapter(adapter);
        grammerModels ob1 = new grammerModels(R.drawable.grammarnsh,"Articles","-zZau_dttRY");
        models.add(ob1);
        grammerModels ob2 = new grammerModels(R.drawable.grammarnsh,"Idioms","jUT_WSavAC8");
        models.add(ob2);
       grammerModels ob3 = new grammerModels(R.drawable.grammarnsh,"Phrases","3HPDFtZQ9ao");
        models.add(ob3);
        grammerModels ob4 = new grammerModels(R.drawable.grammarnsh,"Nouns","gES-AewCOAI");
        models.add(ob4);
       grammerModels ob5 = new grammerModels(R.drawable.grammarnsh,"Pronouns","ZCrAJB4VohA");
        models.add(ob5);
        grammerModels ob6 = new grammerModels(R.drawable.grammarnsh,"Adjectives","9KahrrivdQQ");
        models.add(ob6);
        grammerModels ob7 = new grammerModels(R.drawable.grammarnsh,"Determiners","6p57dCu3s3M");
        models.add(ob7);
        grammerModels ob8 = new grammerModels(R.drawable.grammarnsh,"Verbs and Tenses","aPXW-kb2u6o");
        models.add(ob8);
        grammerModels ob9 = new grammerModels(R.drawable.grammarnsh,"Adverbs","n0fuame4hSQ");
        models.add(ob9);
        grammerModels ob10 = new grammerModels(R.drawable.grammarnsh,"Prepositions","HRZZIwIHeUM");
        models.add(ob10);
        grammerModels ob11 = new grammerModels(R.drawable.grammarnsh,"Conjunction","-FdEaeD1MdY");
        models.add(ob11);
        grammerModels ob12 = new grammerModels(R.drawable.grammarnsh,"Interjections","hDq-kugjd1U");
        models.add(ob12);
        grammerModels ob13 = new grammerModels(R.drawable.grammarnsh,"Sentence","rl85jxktfms");
        models.add(ob13);
        grammerModels ob14 = new grammerModels(R.drawable.grammarnsh,"Punctuation","bY5ChVDRLus");
        models.add(ob14);
        grammerModels ob15 = new grammerModels(R.drawable.grammarnsh,"Can and chould","JWg4Czg6KsE");
        models.add(ob15);
       grammerModels ob16 = new grammerModels(R.drawable.grammarnsh,"May and Might","EyCniqjVXpw");
        models.add(ob16);
        grammerModels ob17 = new grammerModels(R.drawable.grammarnsh,"Will and Would","bwk5TKUWCjM");
        models.add(ob17);
        grammerModels ob18 = new grammerModels(R.drawable.grammarnsh,"Parts of Speech","Rds2uWhoYBs");
        models.add(ob18);
       grammerModels ob19 = new grammerModels(R.drawable.grammarnsh,"Direct and Indirect","LOOJ-z3ERl8");
        models.add(ob19);
        grammerModels ob20 = new grammerModels(R.drawable.grammarnsh,"Active and Passive Voice","MIbSBmRAoxY");
        models.add(ob20);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        binding.graRecyclerView.setLayoutManager(linearLayoutManager);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {}
        });
        AdRequest adRequest = new AdRequest.Builder().build();


        InterstitialAd.load(this,"ca-app-pub-5187443533578655/3260144691", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;

                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdClicked() {
                                super.onAdClicked();
                            }

                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                super.onAdFailedToShowFullScreenContent(adError);
                            }

                            @Override
                            public void onAdImpression() {
                                super.onAdImpression();
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                super.onAdShowedFullScreenContent();
                                mInterstitialAd = null;
                            }
                        });

                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        super.onAdFailedToLoad(loadAdError);
                        mInterstitialAd = null;
                    }
                });
        if (mInterstitialAd != null) {
            mInterstitialAd.show(SecondGrammer.this);
        } else {
            Log.d("TAG", "The interstitial ad wasn't ready yet.");
        }

    }
}
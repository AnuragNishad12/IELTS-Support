package com.anurag.ieltssupport.Listening.Part2;

import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.SeekBar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import com.anurag.ieltssupport.R;
import com.anurag.ieltssupport.databinding.ActivityPart2AnswersDisplayBinding;


public class Part2AnswersDisplay extends AppCompatActivity {


    ActivityPart2AnswersDisplayBinding binding;
    MediaPlayer mPlayer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPart2AnswersDisplayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        binding.disTrans.setText(getIntent().getStringExtra("details"));
        binding.topicAnswers.setText(getIntent().getStringExtra("topic"));
        Uri uri = Uri.parse(getIntent().getStringExtra("audio"));
        mPlayer = MediaPlayer.create(Part2AnswersDisplay.this,uri);

        binding.downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadfile
                        (Part2AnswersDisplay.this,getIntent().getStringExtra("topic"),
                                "mp3",DOWNLOAD_SERVICE,getIntent().getStringExtra("audio"));
            }
        });

        binding.play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play();
            }
        });

        mPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                binding.seekBar.setMax(mPlayer.getDuration());
                String totalTime = createTimerLabel(mPlayer.getDuration());
                binding.text2.setText(totalTime);
                mPlayer.start();
                binding.play.setImageResource(R.drawable.pause);
            }
        });

        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                binding.play.setImageResource(R.drawable.plsay);
            }
        });

        binding.seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if (b) {
                    mPlayer.seekTo(i);
                    binding.seekBar.setProgress(i);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mPlayer != null) {
                    try {
                        if (mPlayer.isPlaying()) {
                            Message message = new Message();
                            message.what = mPlayer.getCurrentPosition();
                            handler.sendMessage(message);
                            Thread.sleep(1000);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    private void downloadfile
            (Context context, String filename, String fileEx, String Directory, String url){
        DownloadManager downloadManager = (DownloadManager)
                context.getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse(url);
        DownloadManager.Request request = new DownloadManager.Request(uri);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context,Directory,filename+fileEx);
        downloadManager.enqueue(request);
    }


    @SuppressLint("HandlerLeek")
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            binding.text1.setText(createTimerLabel(msg.what));
            binding.seekBar.setProgress(msg.what);
        }
    };

    private void play() {
        if (mPlayer != null && mPlayer.isPlaying()) {
            mPlayer.pause();
            binding.play.setImageResource(R.drawable.plsay);
        } else {
            mPlayer.start();
            binding.play.setImageResource(R.drawable.pause);
        }
    }

    public String createTimerLabel(int duration) {
        String timerLabel = "";
        int min = duration / 1000 / 60;
        int sec = duration / 1000 % 60;
        timerLabel += min + ":";
        if (sec < 10) timerLabel += "0";
        timerLabel += sec;
        return timerLabel;
    }
    }

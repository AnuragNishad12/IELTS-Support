package com.anurag.ieltssupport.Speaking;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.anurag.ieltssupport.R;

import java.util.ArrayList;

public class part1SpeaAdapter extends RecyclerView.Adapter<part1SpeaAdapter.Viewholder> {

    ArrayList<part1SpeaModel> models;
    Context context;

    public part1SpeaAdapter(ArrayList<part1SpeaModel> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_layout,parent,false);
       return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
    final part1SpeaModel temp = models.get(position);
    holder.image.setImageResource(R.drawable.breathable);
    holder.text.setText(temp.getTopic());
    holder.text.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context,part1SpeakingDisplay.class);
            intent.putExtra("questions",temp.getQues());
            intent.putExtra("answers",temp.getAns());
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);

        }
    });

    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        TextView text;
        ImageView image;
        CardView cardView;


        public Viewholder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageRead);
            text = itemView.findViewById(R.id.readTopic);
            cardView = itemView.findViewById(R.id.cardViewRead);

        }
    }
}

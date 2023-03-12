package com.anurag.ieltssupport.Vocabulary;

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

public class Vocabulary_Adapter extends RecyclerView.Adapter<Vocabulary_Adapter.ViewHolder> {

    ArrayList<Model_Vacabulary> models;
    Context context;

    public Vocabulary_Adapter(ArrayList<Model_Vacabulary> models, Context context) {
        this.models = models;
        this.context = context;
    }
    @NonNull
    @Override
    public Vocabulary_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_layout,parent,false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull Vocabulary_Adapter.ViewHolder holder, int position) {
        final Model_Vacabulary temp = models.get(position);
        holder.image.setImageResource(R.drawable.dictionary);
        holder.text.setText(temp.getTopic());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Vocabulary_Display.class);
                intent.putExtra("words",temp.getWords());
                intent.putExtra("topic",temp.getTopic());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView text;
        ImageView image;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageRead);
            text = itemView.findViewById(R.id.readTopic);
            cardView = itemView.findViewById(R.id.cardViewRead);
        }
    }
}

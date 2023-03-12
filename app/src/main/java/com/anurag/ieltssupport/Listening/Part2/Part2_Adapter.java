package com.anurag.ieltssupport.Listening.Part2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.anurag.ieltssupport.R;

import java.util.ArrayList;

public class Part2_Adapter extends RecyclerView.Adapter<Part2_Adapter.ViewHolder> {

    ArrayList<part2_Model> models;
    Context context;

    public Part2_Adapter(ArrayList<part2_Model> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public Part2_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.sample_layout,parent,false);
        return  new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Part2_Adapter.ViewHolder holder, int position) {
    final part2_Model temp = models.get(position);
    holder.text.setText(temp.getTopic());
    holder.image.setImageResource(R.drawable.headphones);
    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context, Part2AnswersDisplay.class);
            intent.putExtra("audio",temp.getAudio());
            intent.putExtra("details",temp.getTranscripts());
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
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.readTopic);
            image = itemView.findViewById(R.id.imageRead);
        }
    }
}

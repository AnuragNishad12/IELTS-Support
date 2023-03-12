package com.anurag.ieltssupport.Writing.Part1;

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

public class wrPart1_Adapter extends RecyclerView.Adapter<wrPart1_Adapter.ViewHolder> {

    ArrayList<wrPart1_Models> models;
    Context context;

    public wrPart1_Adapter(ArrayList<wrPart1_Models> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_layout,parent,false);
        return new wrPart1_Adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    final wrPart1_Models temp = models.get(position);
    holder.text.setText(temp.getTopic());
    holder.image.setImageResource(R.drawable.writing);
    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent  = new Intent(context,wrPart1_Display.class);
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

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView text;
        ImageView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageRead);
            text = itemView.findViewById(R.id.readTopic);

        }
    }
}

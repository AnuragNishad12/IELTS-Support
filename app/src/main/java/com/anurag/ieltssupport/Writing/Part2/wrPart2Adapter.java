package com.anurag.ieltssupport.Writing.Part2;

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

public class wrPart2Adapter extends RecyclerView.Adapter<wrPart2Adapter.ViewHolder> {

    ArrayList<wPart2Model> models;
    Context context;

    public wrPart2Adapter(ArrayList<wPart2Model> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_layout,parent,false);
        return new wrPart2Adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    final wPart2Model temp = models.get(position);
    holder.text.setText(temp.getTopic());
    holder.image.setImageResource(R.drawable.writing);
    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context,wrPartDisplay.class);
            intent.putExtra("question",temp.getQues());
            intent.putExtra("answers",temp.getAns());
            intent.putExtra("image",temp.getImage());
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


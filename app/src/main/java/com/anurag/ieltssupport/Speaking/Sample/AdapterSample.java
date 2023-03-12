package com.anurag.ieltssupport.Speaking.Sample;

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
import com.anurag.ieltssupport.Speaking.Part2.part2Models;

import java.util.ArrayList;

public class AdapterSample extends RecyclerView.Adapter<AdapterSample.ViewHolder> {

    ArrayList<part2Models> models;
    Context context;

    public AdapterSample(ArrayList<part2Models> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final part2Models temp = models.get(position);
        holder.textView.setText(temp.getTopic());
        holder.imageView.setImageResource(R.drawable.breathable);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SampleDisplay.class);
                intent.putExtra("question",temp.getQues());
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

        TextView textView;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.readTopic);
            imageView = itemView.findViewById(R.id.imageRead);
        }
    }
}

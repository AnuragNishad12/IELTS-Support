package com.anurag.ieltssupport.Reading;

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

public class readAdapter extends RecyclerView.Adapter<readAdapter.ViewHolder> {

    ArrayList<readModel> models;
    Context context;


    public readAdapter(ArrayList<readModel> models, Context context) {
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
    final readModel temp = models.get(position);
    holder.text.setText(temp.getTitle());
    holder.image.setImageResource(R.drawable.reading);
    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context,ReadAnswers.class);
            intent.putExtra("title",temp.getTitle());
            intent.putExtra("eassy",temp.getEassy());
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

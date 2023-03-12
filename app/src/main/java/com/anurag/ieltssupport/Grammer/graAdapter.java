package com.anurag.ieltssupport.Grammer;

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

public class graAdapter extends RecyclerView.Adapter<graAdapter.ViewHolder> {
    ArrayList<grammerModels> models;
    Context context;

    public graAdapter(ArrayList<grammerModels> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public graAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.sample_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull graAdapter.ViewHolder holder, int position) {
        final grammerModels temp = models.get(position);
        holder.text.setText(temp.getTopic());
        holder.image.setImageResource(temp.getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,DisplayGrammer.class);
                intent.putExtra("topic",temp.getTopic());
                intent.putExtra("video",temp.getVideo());
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


package com.anurag.ieltssupport.Listening.Part1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.anurag.ieltssupport.R;

import java.util.ArrayList;

public class Part1_Adapter extends RecyclerView.Adapter<Part1_Adapter.ViewHoder> {
ArrayList<part1_Model> models;
Context context;

    public Part1_Adapter(ArrayList<part1_Model> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public Part1_Adapter.ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.sample_layout,parent,false);
        return new ViewHoder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Part1_Adapter.ViewHoder holder, int position) {
    final part1_Model temp = models.get(position);
    holder.text.setText(temp.getTopic());
    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context,Part1_Answers.class);
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

    public class ViewHoder extends RecyclerView.ViewHolder {
        TextView text;
        public ViewHoder(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.readTopic);

        }
    }
}

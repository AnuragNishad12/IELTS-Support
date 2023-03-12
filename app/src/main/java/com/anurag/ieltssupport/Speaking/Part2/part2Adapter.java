package com.anurag.ieltssupport.Speaking.Part2;

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

public class part2Adapter extends RecyclerView.Adapter<part2Adapter.ViewHolder>{

    ArrayList<part2Models> models;
    Context context;

    public part2Adapter(ArrayList<part2Models> models, Context context) {
        this.models = models;
        this.context = context;
    }


    @NonNull
    @Override
    public part2Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull part2Adapter.ViewHolder holder, int position) {
   final part2Models temp = models.get(position);
   holder.text.setText(temp.getTopic());
   holder.image.setImageResource(R.drawable.breathable);
   holder.text.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Intent intent =  new Intent(context,Displaypart2Spe.class);
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
        TextView text;
        ImageView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.readTopic);
            image = itemView.findViewById(R.id.imageRead);
        }
    }
}

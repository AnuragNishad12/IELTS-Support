package com.anurag.ieltssupport.Writing.Part1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.anurag.ieltssupport.R;
import com.anurag.ieltssupport.databinding.ActivityWritingPart1Binding;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Writing_Part1_Activity extends AppCompatActivity {

    ActivityWritingPart1Binding binding;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference reference = database.getReference().child("WritingPart1");
    ArrayList<wrPart1_Models> list ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWritingPart1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        list = new ArrayList<>();
        wrPart1_Adapter adapter = new wrPart1_Adapter(list,getApplicationContext());
        binding.Wpart1Recycler.setAdapter(adapter);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list.clear();
                for (DataSnapshot dataSnapshot : snapshot.getChildren())
                {
                    wrPart1_Models model = dataSnapshot.getValue(wrPart1_Models.class);
                    list.add(model);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        binding.Wpart1Recycler.setLayoutManager(linearLayoutManager);
    }
}
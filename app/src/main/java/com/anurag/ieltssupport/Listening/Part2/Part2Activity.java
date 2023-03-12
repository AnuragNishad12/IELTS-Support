package com.anurag.ieltssupport.Listening.Part2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.anurag.ieltssupport.R;
import com.anurag.ieltssupport.databinding.ActivityPart2Binding;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class Part2Activity extends AppCompatActivity {


    ActivityPart2Binding binding;
//    FirebaseDatabase database = FirebaseDatabase.getInstance();
//    DatabaseReference reference = database.getReference().child("Listening");
    ArrayList<part2_Model>arrayList ;
    FirebaseFirestore db;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPart2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        arrayList = new ArrayList<>();
       Part2_Adapter adapter = new Part2_Adapter(arrayList,getApplicationContext());
        binding.part2Recycler.setAdapter(adapter);
        binding.progressBar.setVisibility(View.VISIBLE);

        db = FirebaseFirestore.getInstance();
        db.collection("Listening").get().
                addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                    @Override
                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                        binding.progressBar.setVisibility(View.GONE);
                        List<DocumentSnapshot> list = queryDocumentSnapshots.getDocuments();
                        for (DocumentSnapshot d:list){
                            part2_Model obj = d.toObject(part2_Model.class);
                            arrayList.add(obj);
                        }
                        adapter.notifyDataSetChanged();
                    }
                });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        binding.part2Recycler.setLayoutManager(linearLayoutManager);

    }
}
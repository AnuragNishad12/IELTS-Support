package com.anurag.ieltssupport.Reading;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.anurag.ieltssupport.Listening.Part2.part2_Model;
import com.anurag.ieltssupport.R;
import com.anurag.ieltssupport.databinding.ActivityReadSecondBinding;
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

public class readSecondActivity extends AppCompatActivity {

    ActivityReadSecondBinding binding;
   ArrayList<readModel> arrayList ;
   FirebaseFirestore db;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityReadSecondBinding.inflate(getLayoutInflater());
         setContentView(binding.getRoot());
         getSupportActionBar().hide();
        binding.progressBar2.setVisibility(View.VISIBLE);

        arrayList = new ArrayList<>();
      readAdapter adapter = new readAdapter(arrayList,getApplicationContext());
      binding.recyclerView.setAdapter(adapter);

        db = FirebaseFirestore.getInstance();
        db.collection("Eassy").get().
                addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                    @Override
                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                        binding.progressBar2.setVisibility(View.GONE);
                        List<DocumentSnapshot> list = queryDocumentSnapshots.getDocuments();
                        for (DocumentSnapshot d:list){
                            readModel obj = d.toObject(readModel.class);
                            arrayList.add(obj);
                        }
                        adapter.notifyDataSetChanged();
                    }
                });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        binding.recyclerView.setLayoutManager(linearLayoutManager);

    }
}
package com.anurag.ieltssupport.Listening.Part1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.anurag.ieltssupport.R;
import com.anurag.ieltssupport.databinding.ActivityPart1Binding;

import java.util.ArrayList;

public class Part1_Activity extends AppCompatActivity {

    ActivityPart1Binding binding;
    ArrayList<part1_Model> models = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPart1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        Part1_Adapter adapter = new Part1_Adapter(models,getApplicationContext());
        binding.lisPart1Recycler.setAdapter(adapter);
      part1_Model  ob1 = new part1_Model(R.string.Dis3Topic1,R.drawable.headphones,"QGxY-aAnxNE");
        models.add(ob1);
        part1_Model ob2 = new part1_Model(R.string.Dis3Topic2,R.drawable.headphones,"XOAvoy7mzUE");
        models.add(ob2);
        part1_Model ob3 = new part1_Model(R.string.Dis3Topic3,R.drawable.headphones,"7vQFB5dBCjE");
        models.add(ob3);
        part1_Model ob4 = new part1_Model(R.string.Dis3Topic4,R.drawable.headphones,"J38_M68FLyA");
        models.add(ob4);
        part1_Model ob5 = new part1_Model(R.string.Dis3Topic5,R.drawable.headphones,"1dfZ1iyn0SE");
        models.add(ob5);
        part1_Model ob6 = new part1_Model(R.string.Dis3Topic6,R.drawable.headphones,"qqWQCQtif80");
        models.add(ob6);
        part1_Model ob7 = new part1_Model(R.string.Dis3Topic7,R.drawable.headphones,"XRCILYcL3xc");
        models.add(ob7);
        part1_Model ob8 = new part1_Model(R.string.Dis3Topic8,R.drawable.headphones,"usDzi4Gl_4w");
        models.add(ob8);
        part1_Model ob9 = new part1_Model(R.string.Dis3Topic9,R.drawable.headphones,"chQlpLGcmHA");
        models.add(ob9);
        part1_Model ob10 = new part1_Model(R.string.Dis3Topic10,R.drawable.headphones,"VRiXCPp4xH0");
        models.add(ob10);
        part1_Model ob11 = new part1_Model(R.string.Dis3Topic11,R.drawable.headphones,"g6bPIe2ZA-E");
        models.add(ob11);
        part1_Model ob12 = new part1_Model(R.string.Dis3Topic12,R.drawable.headphones,"0FZ--Udxmm0");
        models.add(ob12);
        part1_Model ob13 = new part1_Model(R.string.Dis3Topic13,R.drawable.headphones,"m3MM6I584w8");
        models.add(ob13);
      part1_Model ob14 = new  part1_Model(R.string.Dis3Topic14,R.drawable.headphones,"tY-N3u2MrYo");
        models.add(ob14);
      part1_Model ob15 = new  part1_Model(R.string.Dis3Topic15,R.drawable.headphones,"TFiOGdheOl8");
        models.add(ob15);
      part1_Model ob16 = new  part1_Model(R.string.Dis3Topic16,R.drawable.headphones,"ML71rcUgqh8");
        models.add(ob16);
      part1_Model ob17 = new  part1_Model(R.string.Dis3Topic17,R.drawable.headphones,"YtJiSfQ16ig");
        models.add(ob17);
      part1_Model ob18 = new  part1_Model(R.string.Dis3Topic18,R.drawable.headphones,"3fU3HAIMoRA");
        models.add(ob18);
      part1_Model ob19 = new  part1_Model(R.string.Dis3Topic19,R.drawable.headphones,"Wn-G3alurIQ");
        models.add(ob19);
      part1_Model ob20 = new  part1_Model(R.string.Dis3Topic20,R.drawable.headphones,"ZxOWEsALv8k");
        models.add(ob20);
      part1_Model ob21 = new  part1_Model(R.string.Dis3Topic21,R.drawable.headphones,"LEGqz1GgqrU");
        models.add(ob21);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        binding.lisPart1Recycler.setLayoutManager(linearLayoutManager);

    }
}
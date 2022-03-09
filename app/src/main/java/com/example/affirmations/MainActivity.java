package com.example.affirmations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.example.affirmations.Data.DataSource;
import com.example.affirmations.adapter.ItemAdapter;
import com.example.affirmations.module.Affirmation;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Affirmation> data = DataSource.loadAffirmations();
        ItemAdapter adapter = new ItemAdapter(this, data);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
//        TextView textView = findViewById(R.id.textView);

//        textView.setText(data.get(1).resId);
    }
}
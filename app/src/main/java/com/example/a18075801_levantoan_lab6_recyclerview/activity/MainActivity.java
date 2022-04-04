package com.example.a18075801_levantoan_lab6_recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.a18075801_levantoan_lab6_recyclerview.R;
import com.example.a18075801_levantoan_lab6_recyclerview.adapter.NameListAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rclName;
    private NameListAdapter nameListAdapter;
    private ArrayList<String> nameArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
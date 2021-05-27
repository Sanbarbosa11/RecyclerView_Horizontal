package com.cursoandroid.recyclerviewhorizontal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.cursoandroid.recyclerviewhorizontal.Adapters.VerticalRecyclerViewAdapter;
import com.cursoandroid.recyclerviewhorizontal.Models.HorizontalModel;
import com.cursoandroid.recyclerviewhorizontal.Models.VerticalModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView verticalRecyclerView;
    VerticalRecyclerViewAdapter adapter;
    ArrayList<VerticalModel> arrayListVertical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayListVertical = new ArrayList<>();

        verticalRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        verticalRecyclerView.setHasFixedSize(true);

        verticalRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        adapter = new VerticalRecyclerViewAdapter(this, arrayListVertical);

        verticalRecyclerView.setAdapter(adapter);

        setData();

        //fazer adaptador vertical do recyclerView


    }

    private void setData() {


        for (int i = 1; i <= 5; i++) {

            VerticalModel mVerticalModel = new VerticalModel();

            mVerticalModel.setTitle("Title: " + i);

            ArrayList<HorizontalModel> arrayList = new ArrayList<>();

            for (int j = 0; j <= 5; j++) {
                HorizontalModel mHorizontalModel = new HorizontalModel();
                mHorizontalModel.setDescription("Description: " + j);
                mHorizontalModel.setName("Name: " + j);

                arrayList.add(mHorizontalModel);
            }

            mVerticalModel.setArrayList(arrayList);

            arrayListVertical.add(mVerticalModel);
        }

        adapter.notifyDataSetChanged();

    }
}
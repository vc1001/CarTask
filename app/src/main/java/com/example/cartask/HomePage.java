package com.example.cartask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.cartask.Adapter.CustomAdapter;
import com.example.cartask.Model.Model;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends AppCompatActivity {

    RecyclerView recyclerView;

    CustomAdapter customAdapter;

    Context context;

    List<Model> modelList ;

    public HomePage() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        recyclerView = findViewById(R.id.recylerview);

        modelList = new ArrayList<>();

        Model f1=new Model(R.drawable.car1,"Porsche");
        Model f2=new Model(R.drawable.car2,"Lambhorgini");
        Model f3=new Model(R.drawable.car3,"Aston Martin");
        Model f4=new Model(R.drawable.car4,"Ferrari");
        Model f5=new Model(R.drawable.car5,"Audi");
        Model f6=new Model(R.drawable.car6,"Buggati");
        Model f7=new Model(R.drawable.car2,"Porsche");
        Model f8=new Model(R.drawable.car4,"Ferrari");
        Model f9=new Model(R.drawable.car3,"Porsche");


        modelList.add(f1);
        modelList.add(f2);
        modelList.add(f3);
        modelList.add(f4);
        modelList.add(f5);
        modelList.add(f6);
        modelList.add(f7);
        modelList.add(f8);
        modelList.add(f9);

        customAdapter = new CustomAdapter(modelList,this);
        recyclerView.setAdapter(customAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);

    }
}
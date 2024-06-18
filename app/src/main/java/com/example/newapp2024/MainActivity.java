package com.example.newapp2024;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.SearchView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DataClass> dataList;
    Adapter myAdapter;
    DataClass dataClass;
    SearchView searchView;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recView);
        searchView = findViewById(R.id.search);

        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                searchList(newText);
                return true;
            }
        });

        navigationView = findViewById(R.id.nav_view_main);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        dataList = new ArrayList<>();

        dataClass = new DataClass("Волгоградский государственный университет");
        dataList.add(dataClass);

        dataClass = new DataClass("Волгоградский государственный медицинский университет");
        dataList.add(dataClass);

        dataClass = new DataClass("Волгоградский государственная академия физической культуры");
        dataList.add(dataClass);

        dataClass = new DataClass("Волгоградский государственный технический университет");
        dataList.add(dataClass);

        dataClass = new DataClass("Волгоградский государственный социально педагогический университет");
        dataList.add(dataClass);

        dataClass = new DataClass("Волгоградский государственный аграрный университет");
        dataList.add(dataClass);

        myAdapter = new Adapter(MainActivity.this, dataList);
        recyclerView.setAdapter(myAdapter);


    }

    private void searchList(String text){
        List<DataClass> dataSearchList = new ArrayList<>();
        for (DataClass data : dataList){
            if (data.getTittle().toLowerCase().contains(text.toLowerCase())) {
                dataSearchList.add(data);
            }

            if (dataSearchList.isEmpty()){
                Toast.makeText(this, "К сожалению по вашему запросу ничего не найдено", Toast.LENGTH_LONG).show();
            } else {
                myAdapter.setSearchList(dataSearchList);
            }
        }
    }
}
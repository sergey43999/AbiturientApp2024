package com.example.newapp2024;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PravaSpecActivity extends AppCompatActivity {

    RecyclerView recyclerViewPravoSpecVolgu;
    List<DataClass> dataList;
    AdapterPravoSpecVolgu volguPravoSpecAdapter;
    DataClass dataClass;
    SearchView searchViewPravoSpecVolgu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prava_spec);

        recyclerViewPravoSpecVolgu = findViewById(R.id.recViewPravoSpecVolgu);
        searchViewPravoSpecVolgu = findViewById(R.id.searchPravoSpecVolgu);

        searchViewPravoSpecVolgu.clearFocus();
        searchViewPravoSpecVolgu.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
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


        GridLayoutManager gridLayoutManager = new GridLayoutManager(PravaSpecActivity.this, 1);
        recyclerViewPravoSpecVolgu.setLayoutManager(gridLayoutManager);
        dataList = new ArrayList<>();

        dataClass = new DataClass("Судебная и прокурорская деятельность(очная)");
        dataList.add(dataClass);

        dataClass = new DataClass("Судебная и прокурорская деятельность(заочная)");
        dataList.add(dataClass);

        dataClass = new DataClass("Юриспруденция(очная)");
        dataList.add(dataClass);

        dataClass = new DataClass("Юриспруденция(заочная)");
        dataList.add(dataClass);


        volguPravoSpecAdapter = new AdapterPravoSpecVolgu(PravaSpecActivity.this, dataList);
        recyclerViewPravoSpecVolgu.setAdapter(volguPravoSpecAdapter);
    }

    private void searchList(String text){
        List<DataClass> dataSearchList = new ArrayList<>();
        for (DataClass data : dataList){
            if (data.getTittle().toLowerCase().contains(text.toLowerCase())) {
                dataSearchList.add(data);
            }

            if (dataSearchList.isEmpty()){
                Toast.makeText(this, "", Toast.LENGTH_LONG).show();
            } else {
                volguPravoSpecAdapter.setSearchList(dataSearchList);
            }
        }
    }
    }

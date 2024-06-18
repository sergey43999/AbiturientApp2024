package com.example.newapp2024;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class InstituteVolguActivity extends AppCompatActivity {

    RecyclerView recyclerViewInstituteVolgu;
    List<DataClass> dataList;
    AdapterVolguInstitute volguInstituteAdapter;
    DataClass dataClass;
    SearchView searchViewInstituteVolgu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_institute_volgu);

        recyclerViewInstituteVolgu = findViewById(R.id.recViewInstituteVolgu);
        searchViewInstituteVolgu = findViewById(R.id.searchInstituteVolgu);

        searchViewInstituteVolgu.clearFocus();
        searchViewInstituteVolgu.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
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

        GridLayoutManager gridLayoutManager = new GridLayoutManager(InstituteVolguActivity.this, 1);
        recyclerViewInstituteVolgu.setLayoutManager(gridLayoutManager);
        dataList = new ArrayList<>();

        dataClass = new DataClass("Институт математики и информационных технологий");
        dataList.add(dataClass);

        dataClass = new DataClass("Институт права");
        dataList.add(dataClass);

        dataClass = new DataClass("Институт естественных наук");
        dataList.add(dataClass);

        dataClass = new DataClass("Институт приоритетных технологий");
        dataList.add(dataClass);

        dataClass = new DataClass("Институт истории и международных отношений");
        dataList.add(dataClass);


        volguInstituteAdapter = new AdapterVolguInstitute(InstituteVolguActivity.this, dataList);
        recyclerViewInstituteVolgu.setAdapter(volguInstituteAdapter);

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
                volguInstituteAdapter.setSearchList(dataSearchList);
            }
        }
    }
}
package com.example.newapp2024;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class IPTVolguSpecActivity extends AppCompatActivity {

    RecyclerView recyclerViewIPTSpecVolgu;
    List<DataClass> dataList;
    AdapterIPTSpecVolguActivity volguIPTSpecAdapter;
    DataClass dataClass;
    SearchView searchViewIPTSpecVolgu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imitspec);


        recyclerViewIPTSpecVolgu = findViewById(R.id.recViewIMITSpecVolgu);
        searchViewIPTSpecVolgu = findViewById(R.id.searchIMITSpecVolgu);

        searchViewIPTSpecVolgu.clearFocus();
        searchViewIPTSpecVolgu.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
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


        GridLayoutManager gridLayoutManager = new GridLayoutManager(IPTVolguSpecActivity.this, 1);
        recyclerViewIPTSpecVolgu.setLayoutManager(gridLayoutManager);
        dataList = new ArrayList<>();

        dataClass = new DataClass("Информационная безопасность телекоммуникационных систем");
        dataList.add(dataClass);

        dataClass = new DataClass("Компьютерная безопасность");
        dataList.add(dataClass);

        dataClass = new DataClass("Информационная безопасность автоматизированных систем");
        dataList.add(dataClass);

        dataClass = new DataClass("Радиоэлектронные системы");
        dataList.add(dataClass);

        dataClass = new DataClass("Судебная экспертиза");
        dataList.add(dataClass);

        dataClass = new DataClass("Информационная безопасность");
        dataList.add(dataClass);


        volguIPTSpecAdapter = new AdapterIPTSpecVolguActivity(IPTVolguSpecActivity.this, dataList);
        recyclerViewIPTSpecVolgu.setAdapter(volguIPTSpecAdapter);
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
                volguIPTSpecAdapter.setSearchList(dataSearchList);
            }
        }
    }
}
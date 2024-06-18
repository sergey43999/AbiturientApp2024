package com.example.newapp2024;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class IMITSpecActivity extends AppCompatActivity {

    RecyclerView recyclerViewIMITSpecVolgu;
    List<DataClass> dataList;
    AdapterIMITSpecVolgu volguIMITSpecAdapter;
    DataClass dataClass;
    SearchView searchViewIMITSpecVolgu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imitspec);


        recyclerViewIMITSpecVolgu = findViewById(R.id.recViewIMITSpecVolgu);
        searchViewIMITSpecVolgu = findViewById(R.id.searchIMITSpecVolgu);

        searchViewIMITSpecVolgu.clearFocus();
        searchViewIMITSpecVolgu.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
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


        GridLayoutManager gridLayoutManager = new GridLayoutManager(IMITSpecActivity.this, 1);
        recyclerViewIMITSpecVolgu.setLayoutManager(gridLayoutManager);
        dataList = new ArrayList<>();

        dataClass = new DataClass("Прикладная математика и информатика");
        dataList.add(dataClass);

        dataClass = new DataClass("Математика и компьютерные науки");
        dataList.add(dataClass);

        dataClass = new DataClass("Математическое обеспечение и администрирование информационных систем");
        dataList.add(dataClass);

        dataClass = new DataClass("Прикладные математика и физика");
        dataList.add(dataClass);

        dataClass = new DataClass("Радиофизика");
        dataList.add(dataClass);

        dataClass = new DataClass("Информатика и вычислительная техника");
        dataList.add(dataClass);

        dataClass = new DataClass("Программная инженерия");
        dataList.add(dataClass);

        dataClass = new DataClass("Радиотехника");
        dataList.add(dataClass);

        dataClass = new DataClass("Фотоника и оптоинформатика");
        dataList.add(dataClass);


        volguIMITSpecAdapter = new AdapterIMITSpecVolgu(IMITSpecActivity.this, dataList);
        recyclerViewIMITSpecVolgu.setAdapter(volguIMITSpecAdapter);
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
                volguIMITSpecAdapter.setSearchList(dataSearchList);
            }
        }
    }
}
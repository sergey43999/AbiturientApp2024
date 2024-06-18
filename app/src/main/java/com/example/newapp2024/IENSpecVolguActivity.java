package com.example.newapp2024;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class IENSpecVolguActivity extends AppCompatActivity {

    RecyclerView recyclerViewIENSpecVolgu;
    List<DataClass> dataList;
    AdapterIENSpecVolgu volguIENSpecAdapter;
    DataClass dataClass;
    SearchView searchViewIENSpecVolgu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ienspec_volgu);


        recyclerViewIENSpecVolgu = findViewById(R.id.recViewIENSpecVolgu);
        searchViewIENSpecVolgu = findViewById(R.id.searchIENSpecVolgu);

        searchViewIENSpecVolgu.clearFocus();
        searchViewIENSpecVolgu.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
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


        GridLayoutManager gridLayoutManager = new GridLayoutManager(IENSpecVolguActivity.this, 1);
        recyclerViewIENSpecVolgu.setLayoutManager(gridLayoutManager);
        dataList = new ArrayList<>();

        dataClass = new DataClass("Биоинженерия и биоинформатика");
        dataList.add(dataClass);

        dataClass = new DataClass("Геология");
        dataList.add(dataClass);

        dataClass = new DataClass("Картография и геоинформатика");
        dataList.add(dataClass);

        dataClass = new DataClass("Биология");
        dataList.add(dataClass);

        dataClass = new DataClass("Биотехнология");
        dataList.add(dataClass);

        dataClass = new DataClass("Техносферная безопасность");
        dataList.add(dataClass);

        dataClass = new DataClass("Ландшафтная архитектура");
        dataList.add(dataClass);



        volguIENSpecAdapter = new AdapterIENSpecVolgu(IENSpecVolguActivity.this, dataList);
        recyclerViewIENSpecVolgu.setAdapter(volguIENSpecAdapter);
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
                volguIENSpecAdapter.setSearchList(dataSearchList);
            }
        }
    }
}
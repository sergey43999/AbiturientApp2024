package com.example.newapp2024;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterIPTSpecVolguActivity extends RecyclerView.Adapter<IPTSpecViewHolder>{

    private Context context;
    private List<DataClass> dataList;


    public void setSearchList(List<DataClass> dataSearchList){
        this.dataList = dataSearchList;
        notifyDataSetChanged();
    }

    public AdapterIPTSpecVolguActivity(Context context, List<DataClass> dataList){
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public IPTSpecViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new IPTSpecViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull IPTSpecViewHolder holder, int position) {
        holder.recTitle.setText(dataList.get(position).getTittle());

        switch (position){
            case 0:
                holder.cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), SecureTeleSystemVolguActivity.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;
            case 1:
                holder.cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), CompSecureActivity.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;
            case 2:
                holder.cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), SecureAutoSystemVolguActivity.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;
            case 3:
                holder.cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), RadioElSystemVolguActivity.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;
            case 4:
                holder.cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), SudExpertVolguActivity.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;
            case 5:
                holder.cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), IVTActivity.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;
            case 6:
                holder.cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), PIActivity.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;
            case 7:
                holder.cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), RadioTechActivity.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;
            case 8:
                holder.cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), FotonActivity.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;



        }
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}

class IPTSpecViewHolder extends RecyclerView.ViewHolder {
    TextView recTitle;
    CardView cardView;

    public IPTSpecViewHolder(View itemView) {
        super(itemView);

        recTitle = itemView.findViewById(R.id.recTittle);
        cardView = itemView.findViewById(R.id.cardRec);
    }
}

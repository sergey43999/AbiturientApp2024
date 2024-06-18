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

public class AdapterVolguInstitute extends RecyclerView.Adapter<VolguInstituteViewHolder>{

    private Context context;
    private List<DataClass> dataList;


    public void setSearchList(List<DataClass> dataSearchList){
        this.dataList = dataSearchList;
        notifyDataSetChanged();
    }

    public AdapterVolguInstitute(Context context, List<DataClass> dataList){
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public VolguInstituteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new VolguInstituteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VolguInstituteViewHolder holder, int position) {
        holder.recTitle.setText(dataList.get(position).getTittle());

        switch (position){
            case 0:
                holder.cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), IMITVolguActivity.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;
            case 1:
                holder.cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), InstPravaActivity.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;
            case 2:
                holder.cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), IENVolguActivity.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;
            case 3:
                holder.cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), IPTVolguActivity.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;





        }
    }

//    @Override
//    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        holder.recTitle.setText(dataList.get(position).getTittle());
//
//        switch (position){
//            case 0:
//                holder.cardView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Intent intent = new Intent(view.getContext(), VolguActivity.class);
//                        view.getContext().startActivity(intent);
//                    }
//                });
//                break;
//            case 1:
//                holder.cardView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Intent intent = new Intent(view.getContext(), VolGTUActivity.class);
//                        view.getContext().startActivity(intent);
//                    }
//                });
//                break;
//        }
//
//    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}

class VolguInstituteViewHolder extends RecyclerView.ViewHolder{
    TextView recTitle;
    CardView cardView;

    public VolguInstituteViewHolder(View itemView){
        super(itemView);

        recTitle = itemView.findViewById(R.id.recTittle);
        cardView = itemView.findViewById(R.id.cardRec);
    }
}

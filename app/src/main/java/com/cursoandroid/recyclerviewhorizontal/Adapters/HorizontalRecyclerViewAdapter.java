package com.cursoandroid.recyclerviewhorizontal.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cursoandroid.recyclerviewhorizontal.Models.HorizontalModel;
import com.cursoandroid.recyclerviewhorizontal.R;

import java.util.ArrayList;

public class HorizontalRecyclerViewAdapter extends RecyclerView.Adapter<HorizontalRecyclerViewAdapter.HorizontalRVViewHolder> {

    Context context;
    ArrayList<HorizontalModel> arrayList;

    public HorizontalRecyclerViewAdapter(Context context, ArrayList<HorizontalModel> arrayList) {

        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public HorizontalRVViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_horizontal, parent, false);
        return new HorizontalRVViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HorizontalRecyclerViewAdapter.HorizontalRVViewHolder holder, int position) {
        HorizontalModel horizontalModel = arrayList.get(position);
        holder.textViewTitle.setText(horizontalModel.getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, horizontalModel.getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class HorizontalRVViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle;
        ImageView imageViewThumb;

        public HorizontalRVViewHolder(View itemView) {
            super(itemView);
            textViewTitle = (TextView) itemView.findViewById(R.id.txtTitleHorizontal);
            imageViewThumb = (ImageView) itemView.findViewById(R.id.ivThumb);
        }
    }

}



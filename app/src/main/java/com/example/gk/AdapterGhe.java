package com.example.gk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterGhe extends RecyclerView.Adapter<AdapterGhe.GheViewHolder> {
    private List<Ghe> listGhe;

    public AdapterGhe(List<Ghe> listGhe, MainActivity mainActivity) {
        this.listGhe = listGhe;
    }

    @NonNull
    @Override
    public GheViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View gheView =
                inflater.inflate(R.layout.layout1, parent, false);
        GheViewHolder viewHolder = new GheViewHolder(gheView,this);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GheViewHolder holder, int position) {
        Ghe ghe=listGhe.get(position);
        holder.tvTen.setText(ghe.getName());
        holder.tvGia.setText(ghe.getGia());
        holder.imgGhe.setImageResource(ghe.getImgGhe());
    }

    @Override
    public int getItemCount() {
        return listGhe.size();
    }
    public class GheViewHolder extends RecyclerView.ViewHolder{
        public final TextView tvGia;
        public final TextView tvTen;
        public final ImageView imgGhe;
        final AdapterGhe adapter;

        public GheViewHolder(View itemView, AdapterGhe adapter) {
            super(itemView);
            tvTen=itemView.findViewById(R.id.tvTen);
            tvGia=itemView.findViewById(R.id.tvGia);
            imgGhe=itemView.findViewById(R.id.imgGhe);
            this.adapter=adapter;
        }
    }
}

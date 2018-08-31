package com.example.divinkas.cursapps.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.divinkas.cursapps.Model.P24;
import com.example.divinkas.cursapps.R;


public class P24_Recycler_Adapter extends RecyclerView.Adapter <P24ViewHolder>{
    private P24 p24List;
    private Context context;

    public P24_Recycler_Adapter(P24 obj, Context context){
        this.context = context;
        p24List = obj;

    }

    @NonNull
    @Override
    public P24ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_val, parent, false);
        return new P24ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull P24ViewHolder holder, int position) {
        holder.tvName.setText(p24List.getExchangeRate().get(position).currency);
        holder.tvPurchase.setText(String.valueOf(p24List.getExchangeRate().get(position).purchaseRate));
        holder.tvSale.setText(String.valueOf(p24List.getExchangeRate().get(position).saleRate));
    }

    @Override
    public int getItemCount() { return p24List.getExchangeRate().size(); }

    @Override
    public long getItemId(int position) { return position; }

    @Override
    public int getItemViewType(int position) { return position; }

}

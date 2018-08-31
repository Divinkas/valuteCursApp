package com.example.divinkas.cursapps.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.divinkas.cursapps.R;

public class P24ViewHolder extends RecyclerView.ViewHolder {

    public TextView tvName, tvSale, tvPurchase;

    public P24ViewHolder(View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.titleValute);
        tvSale = itemView.findViewById(R.id.tvPriceSale);
        tvPurchase = itemView.findViewById(R.id.tvPricePurchase);
    }
}

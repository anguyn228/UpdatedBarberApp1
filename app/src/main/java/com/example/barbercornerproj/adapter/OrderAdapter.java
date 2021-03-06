package com.example.barbercornerproj.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.barbercornerproj.R;
import com.example.barbercornerproj.model.OrderModel;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.ViewHolder> {

    private Context context;
    private ArrayList<OrderModel> orderList;

    public OrderAdapter(Context context, ArrayList<OrderModel> orderList) {
        this.context = context;
        this.orderList = orderList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.order_item, null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtProductName.setText(orderList.get(position).getProductName());
        holder.txtProductPrice.setText(String.valueOf(orderList.get(position).getPrice()));
        holder.txtQuantity.setText(String.valueOf(orderList.get(position).getQuantity()));
    }

    @Override
    public int getItemCount() {
        return orderList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtProductName, txtProductPrice, txtQuantity;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtProductName = itemView.findViewById(R.id.product_name);
            txtProductPrice = itemView.findViewById(R.id.product_price);
            txtQuantity = itemView.findViewById(R.id.quantity);
        }
    }
}

package com.example.tablayoutandrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SanPhamAdapter extends RecyclerView.Adapter<SanPhamAdapter.ViewHolder> {

    Context context;
    ArrayList<SanPham> listSanPham;

    public SanPhamAdapter(Context context, ArrayList<SanPham> listSanPham) {
        this.context = context;
        this.listSanPham = listSanPham;
    }

    public void setData(ArrayList<SanPham> list)
    {
        this.listSanPham = list ;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SanPham sanPham = listSanPham.get(position);
        holder.txtTenSanPham.setText(sanPham.getTenSanPham());
        Locale locale = new Locale("vn", "VN");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        holder.txtGiaSanPham.setText(currencyFormatter.format(sanPham.getGiaSanPham()));
        holder.imgAvatar.setImageResource(sanPham.getHinhSanPham());
    }

    @Override
    public int getItemCount() {
        return listSanPham.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgAvatar;
        TextView txtTenSanPham, txtGiaSanPham;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAvatar = itemView.findViewById(R.id.imgAvatar);
            txtGiaSanPham = itemView.findViewById(R.id.txtGiaSanPham);
            txtTenSanPham = itemView.findViewById(R.id.txtTenSanPham);
        }
    }
}

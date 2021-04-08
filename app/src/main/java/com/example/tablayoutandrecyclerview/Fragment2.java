package com.example.tablayoutandrecyclerview;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Fragment2 extends Fragment {

    RecyclerView recyclerView2;
    ArrayList<SanPham> listSanPham;
    SanPhamAdapter sanPhamAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView2 = getView().findViewById(R.id.recyclerview2);
        listSanPham = new ArrayList<>();
        sanPhamAdapter = new SanPhamAdapter(requireContext(), listSanPham);
        sanPhamAdapter.setData(getAll());
        LinearLayoutManager manager = new LinearLayoutManager(requireContext());
        recyclerView2.setLayoutManager(manager);
        recyclerView2.setAdapter(sanPhamAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_2, container, false);
    }

    private ArrayList<SanPham> getAll(){
        ArrayList<SanPham> sanPhams = new ArrayList<>();
        sanPhams.add(new SanPham("Samsung Galaxy A32", 4500000, R.drawable.ssa32));
        sanPhams.add(new SanPham("Samsung Galaxy A72", 900000, R.drawable.ssa72));
        sanPhams.add(new SanPham("Samsung Galaxy S21", 19990000, R.drawable.sss21));
        sanPhams.add(new SanPham("Google Pixel 4XL", 11000000, R.drawable.pixel4xl));
        sanPhams.add(new SanPham("Google Pixel 5", 19500000, R.drawable.pixel5));

        return sanPhams;
    }
}